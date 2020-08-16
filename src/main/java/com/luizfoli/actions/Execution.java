package com.luizfoli.actions;

import com.luizfoli.models.Project;

public class Execution {

    public ProjectAction projectAction = new ProjectAction(new Project());

    public void start() {
        System.out.println("✨       Project Maker - Open Sourcer Automation");

        projectAction.askProjectName();
        projectAction.askProjectLanguage();
    }

}