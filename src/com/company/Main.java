package com.company;

import commands.Command;
import commands.CommandFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu menu=new Menu();
        menu.showMenu();
        Scanner option=new Scanner(System.in);
        System.out.println("Enter an operation: ");
        String operation = option.nextLine();
        CommandFactory commandFactory=new CommandFactory();
        Command command = commandFactory.doCommand(operation);
        System.out.println("Enter numbers: ");
        double a=option.nextDouble();
        double b=option.nextDouble();
        System.out.println("Result: "+command.execute(a,b));

    }
}
