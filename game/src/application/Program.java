package application;

import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Random choice = new Random();
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        char round = 'N';
        while(game){
            int correctNumber = choice.nextInt(101);
            System.out.println("===== Guessing game =====");
            System.out.println("Play? [s/n]");
            round = sc.next().charAt(0);
            System.out.println(correctNumber);

            while(round != 'N'){
                System.out.println("type a number from 1 to 100");
                int number = sc.nextInt();

                if(number == correctNumber){
                    System.out.println("Correct!");
                    round = 'N';
                }

                else if(number > correctNumber){
                    System.out.println("your number is higher than correct number");
                }
                else {
                    System.out.println("your number is lower than correct number");
                }
            }
        }
    }
}
