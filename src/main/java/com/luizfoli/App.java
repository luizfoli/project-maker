package com.luizfoli;

import java.util.Scanner;

import com.luizfoli.models.Project;

public class App 
{
    static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.println("✨   Project Maker - Open Sourcer Automation");
        Project project = new Project();

        System.out.println("🔥  What's it's the name of your new project?");
        project.setName(scanner.next());

        System.out.println(project);

    }
}
