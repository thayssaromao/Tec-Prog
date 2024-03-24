package Mar_21_Vetores;

import java.util.Scanner;

public class Matriz {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //'ler' é uma estancia de um objeto 
        
        int n = 3;
        int M[][] = new int[n][n];
        int i, j = 0;
        
        for(i=0; i<n; i++){
            System.out.printf("%do. linha\n", (i+1));
            for(j=0; j<n; j++){
               System.out.printf("M[%d][%d] = ",i,j );
               M[i][j] = ler.nextInt();
            }
            System.out.println("------------------");
        }
        
        System.out.println();
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                System.out.printf("%2d ", M[i][j]);
            }
             System.out.println();
        }
        
        System.out.println();
        
        
        System.out.print("Diagonal Principal { ");
        
        int smDP = 0;
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){
                if(i == j){
                    smDP = smDP + M[i][j];
                    System.out.printf("%d ", M[i][j]);
                }  
            }
        }
    
         System.out.printf("} Soma = %d\n ", smDP);
        
    }
    

}

//Scanner -> método construtor da classe do pacote java.util
//