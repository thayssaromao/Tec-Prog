package Mar_26_String;

import java.util.Scanner;

public class String_IV {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      String nomes;
      String partes[];
      int i;
      
      while (true) {
        System.out.println("Informe uma lista de nomes (FIM para encerrar):");
        nomes = ler.nextLine();
        if (nomes.equalsIgnoreCase("FIM"))
            break;
        
        System.out.println();
        
        partes = nomes.split(";");
        for(i=0; i<partes.length; i++) {
          System.out.printf("%do. nome: %s\n", (i+1), partes[i]);
        }      
        System.out.println("----------------------------");
      }

    }

}
