package Abr_18_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MeusAmigos {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      ArrayList<String> meusAmigos = new ArrayList();
      
      String amigo;
      while (true) {
        mostrarAmigosII(meusAmigos);
        
        System.out.println("Nome do Amigo (FIM para encerrar):");
        amigo = ler.nextLine();
        if (amigo.equalsIgnoreCase("FIM"))
            break;
        
        meusAmigos.add(amigo);
        
        System.out.println();
      }
    }
    
    public static void mostrarAmigos(ArrayList<String> x) {
        System.out.println("<<<<------- MEUS AMIGOS ------->>>>");
        
        int i, n = x.size();
        for(i=0; i<n; i++) {
          System.out.printf("%d: %s\n", i, x.get(i));
        }
        
        System.out.println("-----------------------------------\n");
    }
    
    public static void mostrarAmigosII(ArrayList<String> x) {
        System.out.println("<<<<------- MEUS AMIGOS ------->>>>");
        
        int i = 0;
        for(String item: x) {
          System.out.printf("%d: %s\n", i, item);
          i++;
        }
        
        System.out.println("-----------------------------------\n");
    }
    
}
