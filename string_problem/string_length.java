package string_problem;

import java.util.Scanner;

public class string_length {
    public static void main(String[] args) {

        //length of string
        String text ;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        text = input.nextLine();
        System.out.println("The length of the string \"" + text + "\" is " + text.length());

        input.close();


    }
}