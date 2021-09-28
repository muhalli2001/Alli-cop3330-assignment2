package ex24;
import java.io.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
 class Exercise24{

    public static void main(String[] args){
        System.out.printf("Enter 2 words, I will tell you if they are anagrams.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word 1: ");
        String a = scan.nextLine();
        System.out.println("Enter word 2: ");
        String b = scan.nextLine();
        if(isAnagram(a,b)){System.out.println("These are anagrams");}
        else System.out.println("They're not");

    }
     static boolean isAnagram(String a, String b){

        int c = a.length();
        int d = b.length();
         if(a.length()==b.length())
         {
             int c_arr[]=new int[26];
             for(int i=0;i<c;i++){
                 c_arr[(int)(a.charAt(i)-97)]++;
             }

             int d_arr[]=new int[26];
             for(int j=0;j<d;j++){
                 d_arr[(int)(b.charAt(j)-97)]++;
             }

             for(int k=0;k<26;k++){
                 if(c_arr[k]!=d_arr[k]) return false;
             }
             return true;
         }
         else{
             return false;
         }
     }
 }



