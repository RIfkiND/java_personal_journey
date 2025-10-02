package math;

import java.util.Scanner;
import java.lang.Math;

public class problem_two {
    // find the equation to handle
    // the input of the x or etc

    public static void main(String[] args) {
        float x;
        double value_a;
        double value_b;
        double final_value;


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x value: ");
        x = input.nextFloat();

        value_a = (double) (Math.pow(x,3) + 3 * x);

        value_b = (double) ((Math.pow(x,4) - 3 * Math.pow(x, 2))+4);

        final_value = (double) value_a / value_b;
        System.out.println("The value of a is: " + final_value);

        input.close();
    }

}
