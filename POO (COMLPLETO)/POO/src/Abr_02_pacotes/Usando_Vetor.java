package Abr_02_pacotes;

import MeuPacote.Vetor;

public class Usando_Vetor {

    public static void main(String[] args) {
      int a[] = new int[5];
      int b[] = new int[7];
      
      Vetor.entrada("a", a);
      Vetor.entrada("b", b);
      
      System.out.println();
      System.out.println(Vetor.toString("a", a));
      System.out.println(Vetor.toString("b", b));
    }

}
