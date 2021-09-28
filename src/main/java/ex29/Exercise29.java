package ex29;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
public class Exercise29 {
    public static void main(String args[]) {
        boolean valid = false;
        Scanner c = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Rate of Return: ");
                int r = Integer.parseInt(c.next());
                System.out.printf("It will take %d years to double this investment." ,(72 / r));
                valid = true;
            }

            catch (NumberFormatException e)
            {
                System.out.println("Sorry. Invalid input");
            }

            catch (ArithmeticException e)
            {
                System.out.println("Sorry. Invalid input");
            }
            if (valid==true)
            {
                break;
            }
        }
    }}
