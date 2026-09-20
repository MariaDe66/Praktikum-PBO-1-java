public class Soal37 {
    public static void main(String[] args) throws Exception {

        for (int i = 20; i >= 0; i--) {
            System.out.print("\r");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("0");
            Thread.sleep(100);
        }

        for (int i = 0; i <= 20; i++) {
            System.out.print("\r");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("0");
            Thread.sleep(100);
        }
    }
}