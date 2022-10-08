package at.ac.fhcampuswien;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scan = new Scanner(System.in);

        double max = 0;
        double input = 10e10;
        int count = 1;

        while(input > 0){
            System.out.print("Number " + count + ": ");
            input = scan.nextDouble();
            if(input < 0 && count == 1){
                System.out.println("No number entered.");
                max = input;
                break;
            }
            if(input > max) max = input;
            count++;
        }
        if(max >= 0){
            System.out.println("The largest number is " + String.format("%.2f",max));
        }
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int numberOfRows = scan.nextInt();
        if(numberOfRows <= 0){
            System.out.println("Invalid number!");
        } else {
            int count = 1;
            for (int i = 1; i <= numberOfRows; i++) {
                String output = "";
                for (int j = numberOfRows - i; j < numberOfRows; j++) {
                    output += count + " ";
                    count++;
                }
                System.out.println(output);
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int numberOfRows = 6;
        for (int i = 1; i <= 6; i++) {
            String output = "";
            for (int j = 1; j <= 11; j++) {
                if(j <= numberOfRows - i) output += " ";
                if(j > numberOfRows - i && j < 2*numberOfRows - (numberOfRows - i)) output += "*";
            }
            System.out.println(output);
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("h: ");
        int numberOfRows = scan.nextInt();
        System.out.print("c: ");
        String input = scan.next();
        char c = input.charAt(0);

        if(numberOfRows%2 != 1){
            System.out.println("Invalid number!");
            return;
        }

        int count = numberOfRows / 2 - 1;

        for (int i = 1; i <= numberOfRows/2 + 1 ; i++) {
            String output = "";

            for (int j = 0; j <= count; j++) {
                output += " ";
            }
            for (int j = count + 1; j < numberOfRows - (count + 1); j++) {
                if((char)(c - (numberOfRows/2 - j)) <= c) {
                    output += (char) (c - (numberOfRows / 2 - j));
                } else {
                    output += (char) (c + (numberOfRows / 2 - j));
                }
            }
            System.out.println(output);
            count--;
        }
        count = 1;
        for (int i = 1; i <= numberOfRows/2; i++) {
            String output = "";

            for (int j = 0; j < count; j++) {
                output += " ";
            }
            for (int j = count; j <= numberOfRows - (count + 1); j++) {
                if((char)(c - (numberOfRows/2 - j)) <= c) {
                    output += (char) (c - (numberOfRows / 2 - j));
                } else {
                    output += (char) (c + (numberOfRows / 2 - j));
                }
            }
            System.out.println(output);
            count++;
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        double input;
        int count = 1;
        int countFive = 0;
        double countGoodInput = 0;

        while(true){
            System.out.print("Mark " + count + ": ");
            input = scan.nextDouble();

            if(input < 0 || input > 5){
                System.out.println("Invalid mark!");
                count--;
            }
            else if (input != 0){
                sum += input;
                countGoodInput++;
                if(input == 5) countFive++;
            } else {
                break;
            }
            count++;
        }
        if(countGoodInput == 0) countGoodInput++;
        System.out.println("Average: " + String.format("%.2f",sum/countGoodInput));
        System.out.println("Negative marks: " + countFive);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");
        int input = scan.nextInt();

        while(true){
            int sum = 0;

            while (input > 0) {
                double digit = input%10.0;
                sum += Math.pow(digit,2);
                input /= 10;
            }
            input = sum;
            if(input == 1){
                System.out.println("Happy number!");
                break;
            }
            if (input == 4){
                System.out.println("Sad number!");
                break;
            }
        }

    }

    public static void main(String[] args){
        App exercise2 = new App();
/*
        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();*/

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

       // System.out.println("\nTask 6: Fröhliche Zahlen");
       // exercise2.happyNumbers();
    }
}