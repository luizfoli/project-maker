package com.luizfoli.models;

import com.luizfoli.models.languages.ILanguage;

/**
 * Model class for object 'Project'. To control and deal with getters and
 * setters.
 * 
 * @author luizfoli
 * @since 15/08/2020
 */

public class Project {

    private String dir;
    private String name;
    private ILanguage language;

    public Project() {
        this.dir = "";
        this.name = "";
        this.language = null;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
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
        return "{name: " + name + ", language: " + language + ", dir: " + dir + " }";
    }

}