package com.dona.tarea.domain;

public class Product {
    
    private Integer code;
    private String name;
    private String brand;
    private String description;
    private Integer stock;
    private String inDate;

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInDate() {
        return this.inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

}