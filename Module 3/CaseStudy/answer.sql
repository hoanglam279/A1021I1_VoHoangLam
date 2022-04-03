use casestudy;
-- cau 2:Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” 
-- và có tối đa 15 kí tự.
select * from nhan_vien
where
    HO_TEN like 'H%'
    or HO_TEN like 'T%'
    or HO_TEN like 'K%'
    and length(HO_TEN) <= 15;
-- cau 3: Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và
-- có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
SELECT * FROM khach_hang
WHERE
    (
        (YEAR(Now()) - YEAR(NGAY_SINH)) BETWEEN 18 AND 50
    )
    AND (
        DIA_CHI LIKE '%đà nẵng'
        or DIA_CHI LIKE '%quảng trị'
    );
-- cau4" 
-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của
-- khách hàng. Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
SELECT
    kh.HO_TEN,
    COUNT(*) as 'so lan dat'
FROM
    hop_dong hd
    JOIN hop_dong_chi_tiet hdct on hd.MA_HD = hdct.MA_HOP_DONG
    JOIN khach_hang kh on kh.MA_KH = hd.MA_KHACH_HANG
    JOIN loai_khach lk on lk.MA_LK = kh.MA_LOAI_KHACH
WHERE
    lk.TEN_LK LIKE 'Diamond'
GROUP BY
    kh.HO_TEN;
-- 5. Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong,ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với
-- tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem,
-- hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
-- 6. Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue,ten_loai_dich_vu của tất cả các loại dịch vụ chưa từng được khách hàng
-- thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select
    dv.ma_dv,
    dv.ten_dv,
    dv.dien_tich,
    dv.chi_phi_thue,
    ldv.ten_ldv
from
    dich_vu dv
    inner join loai_dich_vu ldv on dv.MA_LOAI_DV = ldv.MA_LDV
where
    not exists (
        select
            *
        from
            hop_dong hd
        where
            hd.ma_dich_vu = dv.ma_dv
            and (year(hd.NGAY_LAM_HD) = '2021')
            and month(hd.NGAY_LAM_HD) between 1
            and 3
    );
-- 7. Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu của tất cả các loại
-- dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
SELECT
    dv.MA_DV,
    dv.TEN_DV,
    dv.DIEN_TICH,
    dv.SO_NG_TOI_DA,
    dv.CHI_PHI_THUE,
    ldv.TEN_LDV
FROM
    dich_vu dv
    inner join loai_dich_vu ldv on dv.MA_LOAI_DV = ldv.MA_LDV
    where
    not exists (
        select
            *
        from
            hop_dong hd
        where
            hd.ma_dich_vu = dv.ma_dv
           and (year(hd.NGAY_LAM_HD) = '2021')
    );
-- 8. Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu,ho_ten không trùng nhau.Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
SELECT DISTINCT  khach_hang.HO_TEN FROM khach_hang;

-- 9. Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
  select month(NGAY_KET_THUC) as 'thang', count(month(NGAY_KET_THUC)) as 'so luong' 
  from hop_dong 
  where
     year(NGAY_KET_THUC) like '%2021'
      group by month(NGAY_KET_THUC);
      
-- 10 Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
 
 select hd.MA_HD, hd.NGAY_LAM_HD, hd.NGAY_KET_THUC, hd.TIEN_DAT_COC, sum(hdct.SO_LUONG) as 'so luong dich vu di kem'
 from hop_dong hd
 left join hop_dong_chi_tiet hdct on hd.MA_HD=hdct.MA_HOP_DONG
 group by hd.MA_HD, hd.NGAY_LAM_HD, hd.NGAY_KET_THUC, hd.TIEN_DAT_COC;
 
 -- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc 
 -- của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

select hd.MA_HD, nv.HO_TEN, kh.HO_TEN, kh.SO_DIEN_THOAI, dv.TEN_DV, sum(hdct.SO_LUONG) as 'so luong dich vu di kem', hd.TIEN_DAT_COC
from hop_dong hd 
join khach_hang kh
join nhan_vien nv
join dich_vu dv
join hop_dong_chi_tiet hdct 







