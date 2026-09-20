import java.util.Scanner;

public class Soal50 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n_awal: ");
        int awal = input.nextInt();

        System.out.print("n_akhir: ");
        int akhir = input.nextInt();

        int jumlah = 0;

        for (int angka = awal; angka <= akhir; angka++) {

            if (angka < 2) {
                continue;
            }

            boolean prima = true;

            for (int i = 2; i < angka; i++) {
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
            }

            if (prima) {
                jumlah++;
            }
        }

        System.out.println("Jumlah bilangan prima: " + jumlah);
    }
}