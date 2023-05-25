package org.example;
public class Fibonacci100 {
    public static void main(String[] args){
        System.out.println("The Fibonacci series below 100 is ");
        int a =0;
        int b =1;
        int sum = 0;
        System.out.print(a +" " +b);
        for(int i=1;i<100;i++){
            sum = a + b;
            if(sum<700) {
                System.out.print(" " + sum);
                a = b;
                b = sum;
            }
        }
    }
}
