public class Soal18 {
       public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 12; i++) {
            System.out.print(n + " ");

            if (i % 2 == 1)
                n -= 3;
            else
                n += 5;
        }
    }
}
