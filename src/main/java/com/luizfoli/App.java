package com.luizfoli;

import com.luizfoli.actions.Execution;
import com.luizfoli.config.DirConfig;

/**
 * The principal project's class. In this context the class only start the
 * workflow calling the mthod start from Execution class.
 * 
 * @author luizfoli
 * @since 15/08/2020
 */

public class App {

    private static Execution execution = new Execution();

    public static void main(String[] args) {
        execution.start();
    }
}
