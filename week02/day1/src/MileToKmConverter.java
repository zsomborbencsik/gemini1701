
import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        // Write a program that asks for an integer that is a distance in kilometers,

        // then it converts that value to miles and prints it

        Scanner sc = new Scanner(System.in);

            double convertNum = 1.6;

        System.out.println("Give me distance number in kilometer please!");

            int userInput = sc.nextInt();

        System.out.println("The distance is: " + (userInput*convertNum));
    }
}
