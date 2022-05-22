package com.example.exercise9;

public class Task1 {
    static Number generateException(){
        Number n = null;

        return n;
    }
}

class ThrowException{
    public static void main(String[] args){
        try {
            Number o = Task1.generateException();
            o.toString();
        }
        catch(NullPointerException e){
            System.out.println("This is a null value.");
            System.out.println("\n" + e.toString());
            System.out.println("\nThe call stack: ");
            e.printStackTrace();
        }
    }
}