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

        //Find and display the smallest of two variables named carPrice and
        //truckPrice. Set the variables to any value you want.
        double carPrice = 60000;
        double truckPrice = 80000;
        double lowestPrice;

        lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        // Find and display the area of a circle whose radius is 7.25
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);



    }
}
