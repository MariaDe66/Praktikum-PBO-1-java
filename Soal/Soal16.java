public class Soal16 {
        public static void main(String[] args) {
        int n = 1;

        for (int i = 1; i <= 12; i++) {
            System.out.print( n + " ");

            if (i % 2 != 0){
                 n = n+= 4;
            }
            else{
                n = n-= 2;
            }
        }
    }
}
