package Day1_ProgrammingElements.Level2_practice;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, height;

        System.out.print("Enter the base of the triangle in cm: ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        height = input.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / 6.4516;

        System.out.println("The Area of the triangle in sq inch is " + areaInch + " and sq cm is " + areaCm);

        input.close();
    }
}
