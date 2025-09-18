package essay_1_math;

import java.util.Scanner;
import java.lang.Math;

public class problem_three {

    // return the digit of three digit number
    // below or same ass 999
    // into an indiviudal number it self

    public static void main(String[] args) {
        int number;
        int num1;
        int num2;
        int num3;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan 3 digit angka: ");
        number = input.nextInt();

        if (number <= 999) {
             num1 = number % 10;
             num2 = number / 10 % 10;
             num3 = number / 100 % 10;

            System.out.println("angka individu: " + num1 + " " + num2 + " " + num3);
        } else {
            System.out.println("Input tidak valid");
        }

        input.close();
    }

}
