package com.example.demo.model;

public enum VarietyComputers {
    PC("Персональный компьютер"),
    Laptop("Ноутбук"),
    Monoblok("Моноблок");

    private String title;

    VarietyComputers(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
