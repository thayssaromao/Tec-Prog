package Mar_19_Introducao;

import java.util.Scanner;

public class Um {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      int a, b, soma, mult;
      
      System.out.printf("a: ");
      a = ler.nextInt();
      
      System.out.printf("b: ");
      b = ler.nextInt();
      
      soma = a + b;
      mult = a * b;
      
      System.out.println();
      
      System.out.printf("%d + %d = %d\n", a, b, soma);
      System.out.printf("%d X %d = %d\n", a, b, mult);      
    }
    
}
