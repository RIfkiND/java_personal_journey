public class GradeTest {
   public static void main(String[] args) {
     int n = 92; 
    // ternary operator java 
     System.out.println("A: " + (n>=90  && n<100? "Nilai A" : "salah"));
     System.out.println("B: " + (n>=80 && n<90 ? "Nilai B" : "salah"));
     System.out.println("C: " + (n>=70 && n<80 ? "benar" : "salah"));
     System.out.println("D: " + (n>=60 && n<70 ? "benar" : "salah"));
     System.out.println("F: " + (n<60 ? "benar" : "salah"));    
   }
}