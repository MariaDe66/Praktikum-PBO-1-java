public class Soal17 {
    public static void main(String[] args) {
        int n = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.print(n + " ");

            if (i % 2 == 1)
                n += 10;
            else
                n -= 5;
        }
    } 
}
