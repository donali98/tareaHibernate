package com.dona.tarea.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
    @NotEmpty(message="El codigo esta vacío")
    @Size(min =  12, max = 12, message = "El codigo debe ser de 12 digitos")
    private String code;

    @NotEmpty(message="El nombre esta vacío")
    @Size(min = 1, max = 100)
    private String name;

    @NotEmpty(message="La marca esta vacía")
    @Size(min = 1, max = 100)
    private String brand;
    
    @NotEmpty(message="La descripción esta vacía")
    @Size(min = 1, max = 500)
    private String description;
    
    // @NotEmpty(message="Las existencias estan vacías")
    @Min(value = 0l, message = "No negativos")
    // @Pattern(regexp = "^\\d+$", message = "Solo enteros")
    private Integer stock;
    
    @NotEmpty(message="La fecha esta vacía")
    @Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$",message = "La fecha no cumple con el formato dd/mm/yyyy")
    private String inDate;

    public Integer getStock() {
        return this.stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
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