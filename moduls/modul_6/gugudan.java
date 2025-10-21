public  class  gugudan {
    public static void main(String[] args) {
        int angka = 10; 
    
        while (angka <= 10) {
            for (angka = 1; angka <= 10; angka++) {
                System.out.println("Tabel Perkalian " + angka);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(angka + " x " + i + " = " + (angka * i));
                }
                System.out.println();
            }
        }
        
    }
}