import java.util.Scanner;

public class Soal43 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int terkecil = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = input.nextInt();

            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("Bilangan terkecil: " + terkecil);
    }
}