package ex30;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
public class Exercise30 {

    public static void main(String args[]){


        for(int i=1;i<13;i++){
            System.out.printf("%5d",i);
            for(int j=2;j<13;j++){
                System.out.printf("%5d",i*j);
            }
            System.out.printf("\n");

        }

    }
}
