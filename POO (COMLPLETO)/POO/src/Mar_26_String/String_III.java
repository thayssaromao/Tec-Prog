package Mar_26_String;

import java.util.Scanner;

public class String_III {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      String nome, prenome, sobrenome;
      
      System.out.println("Informe o seu nome:");
      nome = ler.nextLine();
      
      String partes[];
      
      partes = nome.split(" ");
      prenome = partes[0];
      sobrenome = partes[partes.length-1];
      
      System.out.println();
      System.out.printf("Seja bem-vindo(a), Sr(a) %s.\n", prenome);
      System.out.printf("Seja bem-vindo(a), Sr(a) %s.\n", sobrenome);
    }

}
