
package Mar_21_Vetores;

import java.util.Scanner;

public class Um {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       int n = 3;               //tamanho do vetor(objeto)
       int a[] = new int[n];    //declaração e instalação do vetor
       int i;                   //indice (posição)
           
       for(i=0; i<n;i++){
           System.out.printf("%do. item de %d, a[%d] = ", i+1, n, i);
           a[i] = ler.nextInt();
           
       }
       System.out.println();
       System.out.print("a { "); //print -> printa e mantem na mesma linha
       for(i=0; i<n; i++){
           System.out.printf("%d ", a[i]);
       }
       System.out.println("}");
       
       System.out.println();
       
       int sm = 0, maior = a[0];
       for(i=0; i<n; i++){
           sm = sm + a[i];
           if(a[i] > maior){
               maior = a[i];
           }
        }
       double media = sm / (double)n;
       System.out.printf("Soma.....: %d\n", sm);
       System.out.printf("Media....: %.2f\n", media);
       System.out.printf("Maior.....: %d\n", maior);
       
    }
    
}
//Java não tem ponteiros porque não há variáveis declaradas explicitamente como 
//ponteiros para outros objetos, como em C ou Pascal. Porém, 
//todas as variáveis de tipos não primitivos são na verdade referências,
//ou seja, ponteiros.
