package ex28;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
class Exercise28 {
    public static void main(String[] args){

        int iteration=6;
        int total =0;
        for (int i=0;i<iteration;i++){
            System.out.printf("Enter Number %d: ", i);
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            total += a;

        }
        System.out.printf("%d",total);
    }
}
