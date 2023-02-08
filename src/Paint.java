/**
 * @class: Paint
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: February 5, 2023
 * description: This program calculates how many gallons and quarts are necessary to paint a room after the user
 * inputs the length, width, and height of the room as well as how many doors and windows there are. It gives you
 * the total surface area and the amount of paint in gallons rounded and quarts for the leftover.
 */
import java.util.Scanner;
public class Paint {
    public static void main(String[] args){
        Scanner l = new Scanner(System.in);
        System.out.print("Enter the length of the room: ");
        double length = l.nextDouble();

        Scanner w = new Scanner(System.in);
        System.out.print("Enter the width of the room: ");
        double width = w.nextDouble();

        Scanner h = new Scanner(System.in);
        System.out.print("Enter the height of the room: ");
        double height = h.nextDouble();

        Scanner win = new Scanner(System.in);
        System.out.print("Enter how many windows in the room: ");
        double windows = win.nextDouble();

        Scanner d = new Scanner(System.in);
        System.out.print("Enter how many doors in the room: ");
        double doors = d.nextDouble();

        double roomNoCeiling = (length * width) + (2 * length * height) + (2 * width * height)
                + (windows * 15) + (doors * 21);
        System.out.println("Surface area of the room: " + roomNoCeiling + "ft");

        double gallons = (int) roomNoCeiling / 350;
        double quarts = (roomNoCeiling % 350) / 87.5;
        System.out.println("You will need " + gallons + " gallons and "+ quarts + " quarts to paint this room.");

    }
}
