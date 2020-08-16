package com.luizfoli.models;

import com.luizfoli.models.languages.ILanguage;

public class Project {

    private String name;
    private ILanguage language;

    public Project() {
        this.name = "";
        this.language = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ILanguage getLanguage() {
        return language;
    }

    public void setLanguage(ILanguage language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "{name: " + name + ", language: " + language + " }";
    }

}