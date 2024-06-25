package Mar_19_Introducao;

import java.util.Scanner;

public class Tres {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      int i, n, vlr;
      
      System.out.print("Quantos valores? ");
      n = ler.nextInt();
      
      System.out.println();
      
      for(i=1; i<=n; i++) {
        System.out.printf("%do. valor de %d: ", i, n);
        vlr = ler.nextInt();
        
        if (vlr < 0)
            System.out.printf("NEGATIVO\n\n");
        else if (vlr == 0)
                System.out.printf("NEUTRO\n\n");
             else System.out.printf("POSITIVO\n\n");
      }
    }
    
}
