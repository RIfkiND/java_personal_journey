public class TestScore {
   public static void main(String[] args) {
   
    int nilai = 120;

    if (nilai >= 90 && nilai<= 100) {
        System.out.println("Nilai A");
    } else if (nilai >=  80 && nilai < 90) {
        System.out.println("Nilai B");
    } else if (nilai >= 70&& nilai < 80) {
        System.out.println("Nilai C");
    } else if (nilai >= 60 && nilai < 70) {
        System.out.println("Nilai D");
      } else if (nilai < 60 && nilai >= 0) {
        System.out.println("Nilai F");
    } else {
        System.out.println("Nilai tidak valid");
    }
   }
}