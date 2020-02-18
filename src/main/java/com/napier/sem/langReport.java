package com.napier.sem;

import java.util.Scanner;

public class langReport
{

    public langReport()
    {
        String menu = "-----Language Reports-----\nPlease choose from the following\n1 - Chinese\n2 - English\n3 - Hindi\n4 - Spanish\n5 - Arabic\n6 - Main Menu\n7 - Exit";
        int choice = 0;

        //Outputs options for language reports and takes in user input, parsing to int as it comes in
        Scanner input = new Scanner(System.in);
        System.out.println(menu);
        choice = Integer.parseInt(input.nextLine());

        //checks choice against menu option and will take to subsquent report
        switch(choice)
        {
            case 1:
                //chinese();
                break;
            case 2:
                //english();
                break;
            case 3:
                //hindi();
                break;
            case 4:
                //spanish();
                break;
            case 5:
                //arabic();
                break;
            case 6:
                new menuMain();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                //if no valid choice, reruns the class
                System.out.println("Invalid input, please try again");
                new langReport();
        }

    }

}
