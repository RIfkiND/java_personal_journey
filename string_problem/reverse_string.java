package string_problem;

import java.util.Scanner;

public class reverse_string {

    public static void main(String[] args) {
        String originalsString;
        String reversedString = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        originalsString = input.nextLine();

        for (int i = originalsString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalsString.charAt(i);
        }

        System.out.println("The reversed string of \"" + originalsString + "\" is \"" + reversedString + "\"");
        input.close();
    }

}
