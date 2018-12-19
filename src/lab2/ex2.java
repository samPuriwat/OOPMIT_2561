package lab2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        System.out.println("What is your name?: ");
        name = scanner.nextLine();
        System.out.print("How old are you?: ");
        age = scanner.nextInt();
        //Display
        System.out.println("Hi, "+name);
        System.out.println("You are "+age+" year old.");

    }//main
}//class
