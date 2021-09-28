package ex36;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Scanner;
import java.lang.Math;

public class Exercise36 {
    public static void main(String args[]){

        float[] nums;
        float temp;
        nums = new float[100];
        int counter = 0;
        Scanner a = new Scanner(System.in);
        String str = "";

        while(!str.equals("done")){

           System.out.println("Enter value or done if finished");
            str = a.nextLine();
            if(str.equals("done")){break;}
            temp = Float.parseFloat(str);
            nums[counter] = temp;
            counter++;
        }
        System.out.println(counter);
        System.out.printf("numbers:\n");
        for(int i=0;i<counter;i++){
            System.out.println(nums[i]);
        }
        float avg=average(nums,counter);
        System.out.println("average: "+avg);
        float min = min(nums,counter);
        System.out.println("min: "+min);
        float max = max(nums,counter);
        System.out.println("max: "+max);
        float std = std(nums, counter,avg);
        System.out.println("standard dev: "+std);

        }
    public static float average(float num[],int size){
        float total=0;
        for(int i=0;i<size;i++)
        {
            total += num[i];

        }
        total = total / size;
        return total;
    }
    public static float min(float num[],int size)
    {
        float min=num[0];
        for(int i=0;i<size;i++)
        {
            if(min>num[i]){min = num[i];}
        }
        return min;
    }
    public static float max(float num[],int size)
    {
        float max = num[0];
        for(int i=0;i<size;i++){
            if(max<num[i]){max = num[i];}
        }
        return max;
    }
    public static float std(float num[],int size,float average){
        float total =0;
        for(int i=0;i<size;i++){
            total += Math.pow((num[i]-average),2);
        }
        total = total /size;
        total = (float) Math.sqrt(total);
        return total;

    }




}
