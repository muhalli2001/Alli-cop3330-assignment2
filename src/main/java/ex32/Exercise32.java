package ex32;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Alli
 */
import java.util.Random;
import java.util.Scanner;
public class Exercise32 {
    public static void main(String args[]){
        String response;
        int range=0;
        int correct=0;
        int counter=0;
        int guess=0;
        int closeloop=0;
        String y_n = "y";
        System.out.println("Let's play Guess the number!\n");
        while(y_n.equals("y")) {
            while (closeloop == 0) {
                System.out.printf("Enter the difficulty level 1,2,3:");
                Scanner a = new Scanner(System.in);
                int level = a.nextInt();


                if (level == 1) {
                    range = 11;
                }
                if (level == 2) {
                    range = 101;
                }
                if (level == 3) {
                    range = 1001;
                }
                Random r = new Random();
                correct = r.nextInt(range);
                closeloop = 0;
                int stopinner =0;
                while(stopinner==0){
                System.out.printf("Guess a number\n");
                guess = a.nextInt();
                if (guess < correct) {
                    System.out.printf("Too low, guess again:\n");
                    counter++;
                }
                if (guess > correct) {
                    System.out.printf("Too high, guess again\n");
                    counter++;
                }
                if (guess == correct) {
                    System.out.printf("Correct in %d try/tries\n", counter + 1);

                    closeloop = 1;
                    stopinner=1;
                }

                }

            }
            closeloop=0;
            System.out.printf("play again?");
            Scanner b = new Scanner(System.in);
            y_n = b.nextLine();
        }


    }
}
