package ex31;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
public class Exercise31 {
    public static void main(String args[]){

    Scanner a = new Scanner(System.in);
    System.out.printf("What is your age");
    int age = a.nextInt();
    System.out.printf("What is your resting heart rate?");
    float resting = a.nextFloat();
    float result;
    System.out.printf("Age:%d\tResting Heart Rate:%.1f\n",age,resting);
    System.out.printf("Intensity\tRate\n");
    for(int i=55;i<100;){
        System.out.printf("%4d%%\t",i);
        result = CKarvonen(age,resting,i);
        System.out.printf("\t%.1f\n",result);
        i=i+5;
    }


    }
    public static float CKarvonen(int age, float resting, int intensity){
        float dintensity = intensity;
        dintensity = dintensity/100;
        float target = (((220-age)-resting)*(dintensity))+resting;
        return target;
    }
}
