package com.example.layeredarchitecture.model;

/**
 * @author ashan
 * @created 12/18/2023 - 4:24 PM
 */

public class CustomDTO {
    String code;
    String description;
    String date;

    public CustomDTO() {
    }

    public CustomDTO(String code, String description, String date) {
        this.code = code;
        this.description = description;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
