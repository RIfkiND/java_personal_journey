public  class MultipleFiveSum {
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        //sum terus di tambah 5 bsemisal 15 jadi 30 karena + 15
     do {
        sum += 5;
        total += sum;
        System.out.println("( " + "+ "+ sum +" )"+ total);
     } while (total < 105);
        
    }
}