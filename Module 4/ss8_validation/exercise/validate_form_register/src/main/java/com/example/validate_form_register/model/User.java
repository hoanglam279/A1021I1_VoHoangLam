package com.example.validate_form_register.model;

import javax.validation.constraints.*;

public class User {
    @NotEmpty(message = "not empty")
    @Size(min = 5, max = 45)
    private String firstName;
    @NotNull(message = "not empty")
    @Size(min = 5, max = 45)
    private String lastName;
    @NotNull(message = "not empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "phone number invalid")
    private String phoneNumber;
    @NotNull(message = "not empty")
    @Min(18)
    private int age;
    @NotNull(message = "not empty")
    @Email(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "email invalid")
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String firstName, String lastName, String phoneNumber, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public User() {
    }


}
