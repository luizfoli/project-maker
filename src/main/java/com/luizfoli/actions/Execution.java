package com.luizfoli.actions;

import java.io.FileInputStream;
import java.io.InputStream;

import com.luizfoli.models.Project;

/**
 * Class to control all project's workflow.
 * 
 * @author luizfoli
 * @since 15/08/2020
 */

public class Execution {

    public ProjectAction projectAction = new ProjectAction(new Project());

    public void start() {
        this.printHeader();
        projectAction.askProjectName();
        projectAction.askProjectLanguage();
    }

    private void printHeader() {
        try(InputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/logo.txt")) {
            System.out.println(input.toString());
        } catch(Exception e) {
            
        }
    }
 
}