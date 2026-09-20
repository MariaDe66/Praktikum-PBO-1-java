public class Soal51 {
    public static void main(String[] args) {
        int n = 6; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            
    
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            
         
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}