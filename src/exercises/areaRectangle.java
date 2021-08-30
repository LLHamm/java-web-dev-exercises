package exercises;
import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = input.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        width = input.nextInt();
        input.close();

        area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }
}
