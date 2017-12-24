package com.pluralsight;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        int x;
        do {
            System.out.println("Count from: ");

            try {
                x = keyboard.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Wrong kind of input.");
                keyboard.next();
            }
        }
        while(true);

        int y;
        do {

            System.out.println("Count to: ");

            try {
                y = keyboard.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Wrong kind of input.");
                keyboard.next();
            }
        }
        while(true);

        int z;
        do {

            System.out.println("Count by: ");

            try {
                z = keyboard.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.out.println("Wrong kind of input.");
                keyboard.next();
            }
        }
        while(true);



        for (int n = x; n <= y; n+=z ){
            System.out.print(n + " ");
        }
    }
}
