package practice;

import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        int a ;
        int b ;
        // kalo di  bahasa low level pake concept pointer kalo gak salah
        // kalo di java pakai temp jadi dia kaya nyimpen nilai sementara
        
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        a = input.nextInt();
        System.out.print("Enter value for b: ");
        b = input.nextInt();
        
        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
        input.close();
    }
}
