package com.excelsiortechie.formValidation.entity;


import jakarta.validation.constraints.*;

public class GeekEmployee {

    @NotBlank(message = "Please enter proper employee name")
    @Size(min = 5, message = "Name should be atleast 5 characters")
    @Size(max = 12, message = "Name should not be greater than 12 characters")
    private String geekEmployeeName;

    @NotNull(message = "Please enter a valid salary")
    @Min(value = 1000, message = "Salary must be atleast 1000.00")
    @Max(value = 40000, message = "Salary should not be greater than 40000.00")
    private Double salary;

    @Email(message = "Please enter a valid email Id", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
    @NotNull(message = "Please enter a valid email Id")
    private String geekEmailId;

    @NotBlank(message = "Please enter qualifications")
    @NotNull(message = "Please enter qualifications")
    private String qualifications;

    public String getGeekEmployeeName() {
        return geekEmployeeName;
    }

    public void setGeekEmployeeName(String geekEmployeeName) {
        this.geekEmployeeName = geekEmployeeName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getGeekEmailId() {
        return geekEmailId;
    }

    public void setGeekEmailId(String geekEmailId) {
        this.geekEmailId = geekEmailId;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}