public class Soal39 {
    public static void main(String[] args) throws Exception {

        for (int i = 0; i <= 10; i++) {
            System.out.println("0");
            Thread.sleep(100);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.print("\033[1A");
            Thread.sleep(100);
        }
    }
}