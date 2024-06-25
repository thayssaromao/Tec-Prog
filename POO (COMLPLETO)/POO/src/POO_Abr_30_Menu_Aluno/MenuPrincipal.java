package POO_Abr_30_Menu_Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    ArrayList<Aluno> turma = new ArrayList();
    OpcoesMenu.importar(turma);
    
    int opcao;
    
    do {
      System.out.println("*** MENU PRINCIPAL ***");
      System.out.println("[ 1 ] Cadastrar");
      System.out.println("[ 2 ] Excluir ");
      System.out.println("[ 3 ] Listar ");
      System.out.println("[ 9 ] Encerrar");
      System.out.println("**********************");
           
      do {
        System.out.print("Opção Desejada? ");
        opcao = ler.nextInt();
      } while ((opcao != 1) && (opcao != 2) &&
               (opcao != 3) && (opcao != 9));

      System.out.println();
      
      if (opcao == 1)
         OpcoesMenu.cadastrar(turma);
      else if (opcao == 3)
         OpcoesMenu.listar(turma);
      else if (opcao == 2)
         OpcoesMenu.excluir(turma);
      
    } while (opcao != 9); 
    
    OpcoesMenu.exportar(turma);
  }

}