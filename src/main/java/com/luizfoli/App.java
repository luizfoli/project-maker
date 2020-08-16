package com.luizfoli;

import com.luizfoli.actions.Execution;

public class App 
{
    private static Execution execution = new Execution();


    public static void main( String[] args )
    {
        execution.start();
    }
}
