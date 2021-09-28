package ex34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
public class Exercise34 {
    public static void main(String args[]){

        List<String> al = new ArrayList<>();
        al.add("John S");
        al.add("Jackie J");
        al.add("Chris J");
        al.add("Amanda C");
        al.add("Jeremy G");
        System.out.println(al+"\n");
        System.out.println("Type a name to remove it!!");
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();

        al.remove(new String(name));
        System.out.println(al);
    }
}
