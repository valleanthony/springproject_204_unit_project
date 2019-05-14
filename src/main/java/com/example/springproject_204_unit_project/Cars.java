package com.example.springproject_204_unit_project;

public class Cars {
    private String name;
    private String type;
    private String color;
    private String description;

    public Cars(String name, String type, String color, String description) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.description = description;
    }

    public Cars() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
