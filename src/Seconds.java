/**
 * @class: Seconds
 * @author: Kevin Vergara
 * @verison 1.0
 * @course: ITEC 2140 - 04, Spring 20023
 * @written: February 5, 2023
 * description: this program converts any amount of seconds into hours, minutes, and seconds. The hours is found
 * by dividing the number by 3600 to represent the seconds in a hour. The minutes are found by dividing by 60
 * since there are 60 seconds in a minute but then producing the remainder of dividing by 10. Seconds are found
 * by producing the remainder of the total seconds by dividing it by 60
 */
import java.util.Scanner;
public class Seconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;

        int minutes = (totalSeconds / 60) % 10;

        int seconds = totalSeconds % 60;

        System.out.println("The total amount of seconds is " + totalSeconds + ",so" + " it is "
                + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
    }
}
