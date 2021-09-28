package ex25;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
public class exercise25 {
    public static void main(String[] args){

        System.out.println("Enter a password");
        Scanner a = new Scanner(System.in);
        String PASSWORD = a.nextLine();
        System.out.println(PASSWORD+ " ");
        PassStrength(PASSWORD);


    }
    public static void PassStrength(String Pass){

    int a = Pass.length();
    boolean letter=false,special=false,num=false;
        Set<Character> specialchars = new HashSet<Character>(Arrays.asList('!','@','#'));
        for (char i : Pass.toCharArray())
        {
            if (Character.isLetter(i))
                letter = true;
            if (Character.isDigit(i))
                num = true;
            if (specialchars.contains(i))
                special = true;

        }
        if (num && letter && special
                && (a >= 8))
            System.out.print(" is a VERY STRONG password.");
        else if (letter && num
                && (a >= 8))
            System.out.print(" is a STRONG Password ");
        else if (letter && (a<8))
            System.out.print(" is WEAK password");
        else if (num && (a<8))
            System.out.print(" is a VERY WEAK password");
        else
            System.out.print(" Input a password, nothing came up");

    }
}
