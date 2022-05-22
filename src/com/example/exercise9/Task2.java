package com.example.exercise9;

public class Task2 {
    public static void createException(int numb){
        int k;
        int digits[] = new int[2];
        System.out.println("Input no." + numb);
        try{
            switch(numb){
                case 0:
                    k = 10/numb;
                    break;
                case 1:
                    digits[5] = 5;
                    break;
                case 2:
                    return;
            }
        } catch(ArithmeticException e){
            System.out.println("Indivisible by zero.");
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("There is no similar element that can be found.");
        } finally{
            System.out.println("Trial complete.");
        }
    }
}

class FinallyDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Task2.createException(i);
            System.out.println();
        }
    }
}