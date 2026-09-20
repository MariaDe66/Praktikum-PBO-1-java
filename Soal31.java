import java.util.Scanner;

public class Soal31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n_awal:");
        int awal = input.nextInt();

         System.out.print("n_akhir:");
        int akhir = input.nextInt();

        for (int i = awal; i <= akhir; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}