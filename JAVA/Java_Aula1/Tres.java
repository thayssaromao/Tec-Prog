import java.util.Scanner;

public class Tres {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vlr, m, i;
        
        System.out.println();
        
        System.out.printf("Quantos valores? ");
        m = input.nextInt();
        
        for(i=0; i<m;i++){
            System.out.printf("numero > ");
            vlr = input.nextInt();
            
            if(vlr > 0)
                System.out.printf("%d.o valor: %d eh POSITIVO\n", m, vlr);
            else if(vlr == 0)
                System.out.printf("%d.o valor: %d eh NEUTRO\n", m, vlr);
            else
                System.out.printf("%d.o valor: %d eh NEGATIVO\n", m, vlr);
        }
        
    }
    
}
