import java.util.Scanner;

public class Soal46 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n_awal: ");
        int awal = input.nextInt();

        System.out.print("n_akhir: ");
        int akhir = input.nextInt();

        int total = 0;

        for (int i = awal; i <= akhir; i++) {
            if (i > 0) {
                total += i;
            }
        }

        System.out.println("Total: " + total);
    }
}