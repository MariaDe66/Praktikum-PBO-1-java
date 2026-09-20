import  java.util.Scanner;
public class Soal22 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        int hasil = 1;

        System.out.print(n + "! = ");

        for (int i = n; i >= 1; i--) {
            System.out.print(i);

            if (i > 1) {
                System.out.print(" x ");
            }

            hasil *= i;
        }

        System.out.println(" = " + hasil);
    }
}
