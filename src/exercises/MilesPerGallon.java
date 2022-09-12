package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How far did you drive (miles):");
        float miles = input.nextInt();
        System.out.println("How much gas did you use (gallons):");
        float gallons = input.nextInt();
        float mpg = miles / gallons;
        System.out.println("Your miles-per-gallon is  " + mpg);
    }
}

