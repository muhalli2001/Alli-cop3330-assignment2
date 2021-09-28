package ex35;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Exercise35 {
    public static void main(String args[]){
        int win;
        int count=0;
        List<String> al = new ArrayList<>();
        Scanner a = new Scanner(System.in);
        String name = "a";

        while(!name.equals("")){
            System.out.println("enter name: (to exit, hit enter)");
            name = a.nextLine();
            al.add(name);
            count++;


        }
        al.remove(count-1);
        System.out.println(al);
        System.out.println(count);
        Random r = new Random();
        win = r.nextInt(count-1);
        System.out.println("The winner is:");
        System.out.println(al.get(win));




    }
}
