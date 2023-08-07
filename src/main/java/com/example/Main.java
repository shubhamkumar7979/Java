package com.example;

public class Main {
    public static void main(String[] args){

        int n = 222;

        while(n > 9){
            int x = 1;
            int temp = n;

            while(temp != 0){
                int digit = temp % 10;
                x *= digit;
                temp /=10;
            }
            n = x;
        }
        System.out.println("Final number" + n);
    }
}
