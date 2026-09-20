public class Soal19 {
        public static void main(String[] args) {
        int n = 3;

        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " ");

            if (i % 2 == 1)
                n *= 3;
            else
                n -= 5;
        }
    }
}
