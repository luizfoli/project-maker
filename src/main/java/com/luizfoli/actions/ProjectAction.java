package com.luizfoli.actions;

import java.util.Scanner;
import com.luizfoli.models.Project;

public class ProjectAction {

    private Scanner scanner = new Scanner(System.in);
    private Project project;

    public ProjectAction(Project project) {
        this.project = project;
    }

    /**
     * Method responsible for ask and wait the user input for project name.
     * 
     * @return object project with name attr setted
     * 
     * @author luizfoli
     * @since 15/08/2020
     */

    public Project askProjectName() {
        System.out.println("🔥      What's it's the name of your new project?");
        this.project.setName(scanner.next());
        return this.project;
    }

    /**
     * Method responsible for ask and wait the user input for project language.
     * 
     * @return object project with language attr setted
     * 
     * @author luizfoli
     * @since 15/08/2020
     */

    public Project askProjectLanguage() {
        System.out.println("🔥      What's language you intend to use?");
        scanner.next();
        return this.project;
    }
}