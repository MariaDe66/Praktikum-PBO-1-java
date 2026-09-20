public class Soal35 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 30; i >= 0; i--) {
            System.out.print("\r" + " ".repeat(i) + "0");
            Thread.sleep(100);
        }

        for (int i = 1; i <= 30; i++) {
            System.out.print("\r" + " ".repeat(i) + "0");
            Thread.sleep(100);
        }
    }
}