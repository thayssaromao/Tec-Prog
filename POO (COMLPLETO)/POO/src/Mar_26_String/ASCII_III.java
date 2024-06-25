package Mar_26_String;

import java.util.Scanner;

public class ASCII_III {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    int n;
    while (true) {
      do {
        System.out.print("Decimal (-1 para encerrar): ");
        n = ler.nextInt();
      } while ((n < -1) || (n > 255));
      
      if (n == -1)
         break;
      
      System.out.printf("%d: %c\n\n", n, (char)n);
    }
  }

}
