package ex37;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class Exercise37 {
    public static void main(String args[]){


        String pass = "";
        String Letters = "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        String numbers = "0123456789";
        String spechars = "!@#$%^&*()_+";

        ArrayList<Character> characters = new ArrayList<>();

        System.out.println("What is the minimum length of the string?");
        Scanner a = new Scanner(System.in);
        int length = a.nextInt();

        System.out.println("How many numbers?");
        int nums = a.nextInt();

        System.out.println("How many special chars?");
        int spechar = a.nextInt();

        Random rand = new Random();

        for(int i=0; i<spechar; i++)
        {
            characters.add(spechars.charAt(rand.nextInt(spechars.length())));
        }
        for(int i=0;i<nums;i++)
        {

            characters.add(numbers.charAt(rand.nextInt(numbers.length())));

        }
        for(int j = characters.size();j<length;j++)
        {
            characters.add(Letters.charAt(rand.nextInt(Letters.length())));

        }
        Collections.shuffle(characters);
        System.out.println(characters);
        for(Character convert : characters)
        {
            pass += Character.toString(convert);
        }
        System.out.println(pass);




    }

}
