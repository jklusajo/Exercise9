package com.example.exercise9;

class NonIntResultException extends Exception {
    int n, d;

    public NonIntResultException(int n, int d){
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "NewExceptions{" +
                "n=" + n +
                ", d=" + d +
                '}';
    }
}

public class Task4 {
    public static void main(String[] args){
        int number[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < number.length; i++){
            try {
                if((number[i]%2) != 0)
                    throw new
                            NonIntResultException(number[i], denom[i]);
                System.out.println(number[i] + " / " + denom[i] + " is " + number[i]/denom[i]);

            } catch(ArithmeticException | ArrayIndexOutOfBoundsException | NonIntResultException e){
                System.out.println("No whole number detected.");
            }
        }
    }
}
