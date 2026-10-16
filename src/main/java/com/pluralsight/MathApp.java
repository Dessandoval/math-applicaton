package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        int bobSalary;
        int garySalary;
        int highestSalary;

        bobSalary = 20000;
        garySalary = 45000;

        highestSalary = Math.max(bobSalary,  garySalary);
        System.out.println("The highest salary is " + highestSalary);

        double carPrice = 60000;
        double truckPrice = 80000;
        double lowestPrice;

        lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);


    }
}
