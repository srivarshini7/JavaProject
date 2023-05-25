package org.example;
import java.util.Scanner;
public class Average {
    public static void main (String [] args){
        System.out.println("Enter the Two Numbers");
        Scanner s =new Scanner(System.in);
        int a, b;
        a= s.nextInt();
        b= s.nextInt();
        float c;
        c = (a+b)/2;
        System.out.println("The Average of two numbers is "+ c);
    }
}
