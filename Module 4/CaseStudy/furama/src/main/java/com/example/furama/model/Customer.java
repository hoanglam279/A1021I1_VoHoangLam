package com.example.furama.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @ManyToOne
    @JoinColumn(name = "customer_type_id")
    private CustomerType customerType;

    @NotEmpty
    @Size(max = 45)
    private String customerName;

    @NotEmpty
    @Size(max = 45)
    @DateTimeFormat
    private String customerBirthday;

    @NotEmpty
    private String customerGender;

    @NotEmpty
    @Size(max = 45)
    private String customerIdCard;

    @NotEmpty
    @Size(max = 45)
    private String customerPhone;

    @NotEmpty
    @Size(max = 45)
    @Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")
    private String customerEmail;

    @NotEmpty
    @Size(max = 45)
    private String customerAddress;

    public Customer() {
    }

//    public Customer(int customer_id, CustomerType customerType, @NotEmpty @Size(max = 45) String customer_name, @NotEmpty @Size(max = 45) String customer_birthday, @NotEmpty String customer_gender, @NotEmpty @Size(max = 45) String customer_id_card, @NotEmpty @Size(max = 45) String customer_phone, @NotEmpty @Size(max = 45) @Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$") String customer_email, @NotEmpty @Size(max = 45) String customer_address) {
//        this.customer_id = customer_id;
//        this.customerType = customerType;
//        this.customer_name = customer_name;
//        this.customer_birthday = customer_birthday;
//        this.customer_gender = customer_gender;
//        this.customer_id_card = customer_id_card;
//        this.customer_phone = customer_phone;
//        this.customer_email = customer_email;
//        this.customer_address = customer_address;
//    }


    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
}
