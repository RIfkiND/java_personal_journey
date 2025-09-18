package essay_1_math;

import java.util.Scanner;
import java.lang.Math;

public class problem_one {
    public static void main(String[] args) {
        int x;
        int y;
        double value_a;
        double value_b;
        double final_value;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x value: ");
        x = input.nextInt();
        System.out.print("Enter the y value: ");
        y = input.nextInt();

        value_a = (double) (1 / (3 * Math.pow(x, 2) + 10) )  ;
        
        
        // System.out.println("The value of a is: " + value_a);
        
        value_b = (double) (10 * y + 7);
        final_value = (double) value_a + value_b;

        System.out.println("The final value is: " + final_value);
        input.close();


    }
}