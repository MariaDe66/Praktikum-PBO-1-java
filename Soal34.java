public class Soal34 {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i <= 30; i++) {
            System.out.print("\r" + " ".repeat(i) + "0");
            Thread.sleep(100);
        }

        for (int i = 29; i >= 0; i--) {
            System.out.print("\r" + " ".repeat(i) + "0");
            Thread.sleep(100);
        }
    }
}