package com.luizfoli.models;

public class Project {

    private String name;
    private String language;

    public Project() {
        this.name = "";
        this.language = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", language: " + language + " }";
    }

}