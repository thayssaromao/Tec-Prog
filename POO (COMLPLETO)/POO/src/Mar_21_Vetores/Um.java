package Mar_21_Vetores;

import java.util.Scanner;

public class Um {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      int n = 7;            // tamanho do vetor
      int a[] = new int[n]; // declaração e instanciação do vetor
      int i;                // índice (ou posição)
      
      for(i=0; i<n; i++) {
        System.out.printf("%do. item de %d, a[%d] = ", (i+1), n, i);
        a[i] = ler.nextInt();
      }
      
      System.out.println();
      System.out.print("a { ");
      for(i=0; i<n; i++) {
        System.out.printf("%d ", a[i]);
      }
      System.out.println("}");
      
      System.out.println();
      int sm = 0, maior = a[0];
      for(i=0; i<n; i++) {
        sm = sm + a[i];
        if (a[i] > maior) {
           maior = a[i];
        }
      }
      double media = sm / (double)n;
      
      System.out.printf("Soma.......: %d\n", sm);
      System.out.printf("Valor médio: %.2f\n", media);
      System.out.printf("Maior valor: %d\n", maior);      
    }
    
}
