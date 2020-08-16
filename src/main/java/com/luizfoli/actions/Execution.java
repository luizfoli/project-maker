package com.luizfoli.actions;

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
        System.out.println("✨       Project Maker - Open Sourcer Automation");

        projectAction.askProjectName();
        projectAction.askProjectLanguage();
    }

}