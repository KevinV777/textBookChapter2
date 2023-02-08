/**
 * @class: Cylinder
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: February 5, 2023
 * description: This program calculates the base area and volume of a cylinder after being given
 * the values of its radius and length. The volume equation is the base area multiplied by the length.
 */
import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter the radius: ");

        double radius = r.nextDouble();

        Scanner l = new Scanner(System.in);
        System.out.print("Enter the length: ");

        double length = l.nextDouble();

        double areaOfCylinder = 3.1416 * radius * radius;
        System.out.println("This is the base area of the cylinder: " + areaOfCylinder);

        double volumeOfCylinder = areaOfCylinder * length;
        System.out.println("This is the volume of the cylinder: " + volumeOfCylinder);
    }
}
