import java.util.Scanner;

public class Soal26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n_awal: ");
        int awal = input.nextInt();

        System.out.print("n_akhir: ");
        int akhir = input.nextInt();

        for (int tahun = awal; tahun <= akhir; tahun++) {
            if (tahun % 10 == 4  &&
                (tahun % 400 == 0 || (tahun % 4 == 0 && tahun % 100 != 0))) {
                System.out.println(tahun);
            }
        }
    }
}