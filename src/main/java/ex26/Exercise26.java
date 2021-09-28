package ex26;
import java.lang.Math;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */

public class Exercise26 {
    public static void main(String args[]){

    Scanner a = new Scanner(System.in);

    double i = a.nextDouble();
    i = i/100;
    double b = a.nextDouble();
    double p = a.nextDouble();
    double result;

    Payment_Calculator calc = new Payment_Calculator();
    result = calc.calculateMonths(i,b,p);
    System.out.println(result);

    }
   public static class Payment_Calculator{



       public double calculateMonths(double i, double b, double p){
            float a=0;
            a = -((float)1/30);
            return a;
        }
    }
}
