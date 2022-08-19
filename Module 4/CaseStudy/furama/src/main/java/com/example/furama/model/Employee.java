package com.example.furama.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeId;

    @NotEmpty
    @Size(max = 45)
    private String employeeName;

    @NotEmpty
    @Size(max = 45)
    @DateTimeFormat
    private String employeeBirthday;

    @NotEmpty
    @Size(max = 45)
    private String employeeIdCard;

    @NotEmpty
    @NumberFormat
    private String employeeSalary;

    @NotEmpty
    @Size(max = 45)
    private String employeePhone;

    @NotEmpty
    @Size(max = 45)
    @Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")
    private String employeeEmail;

    @NotEmpty
    @Size(max = 45)
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position positionId;

    @ManyToOne
    @JoinColumn(name = "education_degree_id")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division divisionId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    public Employee() {
    }

    public Employee(@NotEmpty @Size(max = 45) String employee_name, @NotEmpty @Size(max = 45) String employee_birthday,
                    @NotEmpty @Size(max = 45) String employee_id_card, @NotEmpty String employee_salary, @NotEmpty @Size(max = 45) String employee_phone,
                    @NotEmpty @Size(max = 45) @Email(regexp = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$") String employee_email,
                    @NotEmpty @Size(max = 45) String employee_address, Position position, EducationDegree education_degree, Division division, User user) {
        this.employeeName = employee_name;
        this.employeeBirthday = employee_birthday;
        this.employeeIdCard = employee_id_card;
        this.employeeSalary = employee_salary;
        this.employeePhone = employee_phone;
        this.employeeEmail = employee_email;
        this.employeeAddress = employee_address;
        this.positionId = position;
        this.educationDegree = education_degree;
        this.divisionId = division;
        this.userId= user;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(Division divisionId) {
        this.divisionId = divisionId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}