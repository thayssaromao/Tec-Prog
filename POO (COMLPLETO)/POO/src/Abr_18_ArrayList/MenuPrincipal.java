package Abr_18_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    ArrayList<String> patota = new ArrayList();
    OpcoesMenu.importar(patota);
    
    int opcao;
    
    do {
      System.out.println("*** MENU PRINCIPAL ***");
      System.out.println("[ 1 ] Cadastrar Amigos");
      System.out.println("[ 2 ] Excluir Amigos");
      System.out.println("[ 3 ] Listar Amigos");
      System.out.println("[ 9 ] Encerrar");
      System.out.println("**********************");
           
      do {
        System.out.print("Opção Desejada? ");
        opcao = ler.nextInt();
      } while ((opcao != 1) && (opcao != 2) &&
               (opcao != 3) && (opcao != 9));

      System.out.println();
      
      if (opcao == 1)
         OpcoesMenu.cadastrar(patota);
      else if (opcao == 3)
         OpcoesMenu.listar(patota);
      else if (opcao == 2)
         OpcoesMenu.excluir(patota);
      
    } while (opcao != 9); 
    
    OpcoesMenu.exportar(patota);
  }

}
