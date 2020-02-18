package com.napier.sem;

import java.util.Scanner;

public class menuMain {

    String menu = "Please choose from the following options\n\n1 - Country Reports\n2 - City Reports\n3 - Capital City Reports\n4 - Population Reports\n5 - Language Report\n6 - Exit\n";
    int choice = 0;

    public menuMain(){
        //displays menu options and takes in user input, parsing the string to int as it comes in
        Scanner input = new Scanner(System.in);
        System.out.println(menu);
        choice = Integer.parseInt(input.nextLine());

        //checking for inputs, 1-6 if none of them are chosen, it reruns the class
        switch(choice)
        {
            case 1:
                //to be implemented
                //new countryReport();
                break;
            case 2:
                //to be implemented
                //new cityReport();
                break;
            case 3:
                //to be implemented
                //new capReport();
                break;
            case 4:
                //to be implemented
                //new popReport();
                break;
            case 5:
                //to be implemented
                // new langReport();
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input, please try again");
                new menuMain();
        }

        //for testing purposes, the below line should not be reachable
        System.out.println("ruh roh");
    }
}
