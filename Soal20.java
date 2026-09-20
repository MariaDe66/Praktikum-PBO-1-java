public class Soal20 {
      public static void main(String[] args) {
        int n = 1;

        for (int i = 1; i <= 13; i++) {
            System.out.print(n + " ");

          if (i % 3 == 1){
                n += 1; 
            }else if (i%3==2){
                n +=2;
            }
            else{
                n += 3;}
        }
    }
}
