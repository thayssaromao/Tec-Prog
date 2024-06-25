package Mar_19_Introducao;

import java.util.Scanner;

public class Dois {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      int n;
      
      System.out.printf("n: ");
      n = ler.nextInt();
      
      System.out.println();
      
      if ((n % 2) == 0) {
         System.out.printf("%d, é um nro par!!!", n);
      }
      
      if ((n % 2) == 1) {
         System.out.printf("%d, é um nro ímpar!!!", n);
      }

      if ((n % 2) == 0) {
         System.out.printf("%d, é um nro par!!!", n);
      }
      else {
         System.out.printf("%d, é um nro ímpar!!!", n);
      }
      
    }
    
}
