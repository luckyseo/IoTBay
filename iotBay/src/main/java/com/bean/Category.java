package com.bean;

import java.util.List;

public class Category {
    private Long categoryId;
    private String category;

    public Category() {
    }

    public Category(Long categoryId, String category) {
        this.categoryId = categoryId;
        this.category = category;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}