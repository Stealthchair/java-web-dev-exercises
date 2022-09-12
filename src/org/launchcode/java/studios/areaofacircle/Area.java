package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
//import org.launchcode.java.studios.areaofacircle.Circle;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle:");
        double radius;

        try {
            radius = input.nextDouble();
        }
        catch (Exception err){
            System.out.println("Circle Radius must be a number!");
            return;
        }

        while(radius < 0){
            System.out.println("Circle Radius cannot be negative!");
            System.out.println("What is the radius of the circle:");
            radius = input.nextDouble();
        }
        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}
