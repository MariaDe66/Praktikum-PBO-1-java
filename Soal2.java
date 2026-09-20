import java.util.Scanner;
public class Soal2{
     public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Masukan huruf yang dicari: ");
        char huruf = input.next().charAt(0);

        int jumlah = 0;

        for (int i = 0; i<kalimat.length(); i++){
            if (kalimat.charAt(i) == huruf) {
                jumlah++;
            }
            }
            System.out.println("Jumlah huruf:" + jumlah);
            input.close();
        }
}