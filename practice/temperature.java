package practice;

import java.util.Scanner;

public class temperature {

    public static void main(String[] args) {
        float celcous;
        float fahrenheit;
        float kelvin;
        float reamur;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in celcous: ");
        celcous = input.nextFloat();

        fahrenheit = (float) ((9.0 / 5) * celcous + 32);
        kelvin = celcous + 273;
        reamur = (float) (4.0 / 5 * celcous);

        
        System.out.println("The temperature in celcous is: " + celcous);
        System.out.println("The temperature in fahrenheit is: " + fahrenheit);
        System.out.println("The temperature in kelvin is: " + kelvin);
        System.out.println("The temperature in reamur is: " + reamur);
        input.close();

    }

}
