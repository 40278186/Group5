package com.napier.sem;

import java.util.Scanner;

public class countryReport
{

    public countryReport()
    {

        String menu = "-----Country Reports-----\nPlease choose from the following\n";
        int choice = 0;

        //will take in input after displaying menu options, still to implement both reports and subsequent option handling
        Scanner input = new Scanner(System.in);
        System.out.println(menu);
        choice = Integer.parseInt(input.nextLine());

        switch(choice)
        {
            //to implement routes based on user choice
        }

    }

}
