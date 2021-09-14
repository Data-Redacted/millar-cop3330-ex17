package org.example;

import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
 */
public class App 
{
    public static void main( String[] args )
    {


        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter 1 if you are male, 2 if you are female" );
        String gegnder = scan.nextLine();
        System.out.println( "How many ounces of alcohol did you drink?" );
        String an = scan.nextLine();
        System.out.println( "What is your weight?" );
        String wn = scan.nextLine();
        System.out.println( "How many hours has it been since your last drink?" );
        String hn = scan.nextLine();


        int gender = 0;
        int a = 0;
        int w = 0;
        int h = 0;
        if(gegnder.matches("[0-9]+")){
            gender = Integer.parseInt(gegnder);
        }
        else{
            System.out.println( "Make sure you only input numbers" );
            System.exit(0);
        }

        if(an.matches("[0-9]+")){
            a = Integer.parseInt(an);
        }
        else{
            System.out.println( "Make sure you only input numbers" );
            System.exit(0);
        }
        if(wn.matches("[0-9]+")){
            w = Integer.parseInt(wn);
        }
        else{
            System.out.println( "Make sure you only input numbers" );
            System.exit(0);
        }
        if(hn.matches("[0-9]+")){
            h = Integer.parseInt(hn);
        }
        else{
            System.out.println( "Make sure you only input numbers" );
            System.exit(0);
        }
        double r = 0;
        if(gender==1){
            r = .73;
        }
        else{
            r=.66;
        }
        double bac1 = (a*5.14) / (w*r);
        double bac2 = (.015*h);
        double bac = bac1-bac2;
        System.out.println( bac);
    }
}
