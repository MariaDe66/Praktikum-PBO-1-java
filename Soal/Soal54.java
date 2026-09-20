public class Soal54 {
    public static void main(String[] args) {
        int n = 6; // Jumlah baris

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            

            for (int j = 0; j < 2 * (n - 1 - i); j++) {
                System.out.print(" ");
            }
            

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            

            System.out.println();
        }
    }
}
