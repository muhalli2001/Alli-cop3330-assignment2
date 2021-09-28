package ex33;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
public class Exercise33 {

    public static void main(String args[]){
        int i;
        String[] eightball = {"yes", "no", "maybe","ask again later"};

        Random r = new Random();
        i = r.nextInt(4);

        System.out.println(eightball[i]);


    }
}
