package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How long is the rectangle:");
    int length = input.nextInt();
    System.out.println("How wide is the rectangle:");
    int width = input.nextInt();
    int area = length * width;
    System.out.println("The area of the rectangle is " + area);
    }

}
