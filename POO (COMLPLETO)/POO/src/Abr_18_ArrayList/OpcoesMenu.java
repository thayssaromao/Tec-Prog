package Abr_18_ArrayList;

import MeuPacote.Str;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class OpcoesMenu {
  
  public static void cadastrar(ArrayList<String> patota) {
    Scanner ler = new Scanner(System.in);
    String nome;
    String cf;
    
    while (true) {
      System.out.println("Nome (FIM para encerrar):");
      nome = ler.nextLine();
      if (nome.equalsIgnoreCase("FIM"))
         break;
      
      System.out.println();
        
      System.out.println();
      System.out.print("Confirma o cadastro? (S/*): ");
      cf = ler.next();
      if (cf.equalsIgnoreCase("S")) {
         patota.add(nome);
         System.out.printf("<<<< Confirmado >>>>\n\n\n");
      }
      else {
         System.out.printf("<<<< Não Confirmado >>>>\n\n\n\n");
      }
      
      ler.nextLine(); // esvazia o buffer de entrada de dados
     }
     System.out.println();
  }
  
  public static void listar(ArrayList<String> patota) {
    System.out.println("<<<<------- MEUS AMIGOS ------->>>>");
        
    int i = 0;
    for(String item: patota) {
      System.out.printf("%d: %s\n", i, item);
      i++;
    }
        
    System.out.println("-----------------------------------\n");
  }
  
  public static void excluir(ArrayList<String> patota) {
    Scanner ler = new Scanner(System.in);
    int i, n = patota.size(), pos;
    
    System.out.println("Posição Nome do(a) Amigo(a)________________");
    for(i=0; i<n; i++) {
      System.out.printf("%7d %s\n", 
        i, 
        patota.get(i) + Str.repetir(".", 35-patota.get(i).length()));
    }
    System.out.println("-------------------------------------------");
    
    System.out.print("Excluir Posição: ");
    pos = ler.nextInt();
    
    System.out.println();
    
    if ((pos < 0) || (pos >= n))
       System.out.println("Erro: " + pos + ", posição inválida!!!");
    else {
      String cf;
      
      System.out.println(patota.get(pos));
      System.out.print("Confirma a Exclusão? (S/*): ");
      cf = ler.next();
      if (cf.equalsIgnoreCase("S")) {
         patota.remove(pos);
         System.out.println("<<< Excluído >>>");
      }
      else {
         System.out.println("<<< Mantido >>>");
      }
    }
    System.out.println();
  }
  
  public static void exportar(ArrayList<String> patota) {
    try {
      FileWriter arq = new FileWriter("patota.txt");
      PrintWriter gravarArq = new PrintWriter(arq);
    
      for(String amigo: patota) {
        gravarArq.printf("%s\n", amigo);
      }
    
      gravarArq.close();
    }
    catch(IOException e) {
      System.out.println("Erro: Exportação dos dados!!!");
    }
  }
  
  public static void importar(ArrayList<String> patota) {
    try {
      FileReader arq = new FileReader("patota.txt");
      BufferedReader lerArq = new BufferedReader(arq);
    
      String nome;
    
      nome = lerArq.readLine(); // lê a primeira linha do arquivo
      while (nome != null) {
        patota.add(nome);
      
        nome = lerArq.readLine(); // lê da segunda até a última linha do arquivo
      }
    
      lerArq.close();
    }
    catch (IOException e) {
      System.out.println("Arquivo 'patota.txt' está vazio!!!");
    }
  }
}
