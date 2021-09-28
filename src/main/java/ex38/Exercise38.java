package ex38;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
public class Exercise38 {
    public static void main(String args[]){
        Integer even[];
        Scanner a = new Scanner(System.in);
        String input = a.nextLine();

        String AllArray[] = input.split(" ");

        even = filterEvenNumbers(AllArray);

        System.out.println("The Even Numbers Are:");
        for(int i=0;i<even.length;i++){
            System.out.println(even[i]);
        }



    }
    public static Integer[] filterEvenNumbers(String arr[]){

        ArrayList<Integer> EvenArray = new ArrayList<>();
        for(int i=0;i<arr.length;i++){

            int integerinput = Integer.parseInt(arr[i]);
            if(integerinput % 2 == 0){EvenArray.add(integerinput);}

        }

        Integer[] a = new Integer[EvenArray.size()];
        a = EvenArray.toArray(a);

        return a;
    }
}
