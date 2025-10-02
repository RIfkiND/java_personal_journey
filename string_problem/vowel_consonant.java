package string_problem;

import java.util.Scanner;

public class vowel_consonant {

     public static void main(String[] args) {
          // find a vowel and consonant 
          //in a text
          //then find the number of vowels and consonants
          String text;

          Scanner input = new Scanner(System.in);

          System.out.print("Enter a text: ");
          text = input.nextLine();

          int vowelCount = 0;
          int consonantCount = 0;

          for (int i = 0; i < text.length(); i ++){
               char ch = text.charAt(i);
                    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                         // Check if the character is a vowel
                         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                              vowelCount++;
                         } else {
                              consonantCount++;
                         }
                    }
               }

               System.out.println("Number of vowels: " + vowelCount);
               System.out.println("Number of consonants: " + consonantCount);
          



          input.close();
        
     }
}
