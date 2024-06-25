package Mar_21_Vetores;

import java.util.Scanner;

public class Dois {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      int n = 3;
      int M[][] = new int[n][n];
      int i, j;
      
      for(i=0; i<n; i++) {
        System.out.printf("%da. linha\n", (i+1));
        for(j=0; j<n; j++) {
          System.out.printf("M[%d][%d] = ", i, j);
          M[i][j] = ler.nextInt();
        }
        System.out.println("----------------------");
      }
      
      System.out.println();
      for(i=0; i<n; i++) {
        System.out.printf("%da. linha: ", (i+1));
        for(j=0; j<n; j++) {
          System.out.printf("%2d ", M[i][j]);
        }
        System.out.println();
      }
      
      System.out.println();
      
      int smDP = 0;      
      System.out.print("Diagonal Principal { ");
      for(i=0; i<n; i++) {
        for(j=0; j<n; j++) {
          if (i == j) {
             smDP = smDP + M[i][j];
             System.out.printf("%d ", M[i][j]);
          }
        }
      }
      System.out.printf("} Soma = %d\n", smDP);

      int smDS = 0;      
      System.out.print("Diagonal Secundária { ");
      for(i=0; i<n; i++) {
        for(j=0; j<n; j++) {
          if ((i+j) == (n-1)) {
             smDS = smDS + M[i][j];
             System.out.printf("%d ", M[i][j]);
          }
        }
      }
      System.out.printf("} Soma = %d\n", smDS);        
    }

}