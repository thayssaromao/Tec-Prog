package POO_Abr_30_Menu_Aluno;

import MeuPacote.Str;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class OpcoesMenu {
  
  public static void cadastrar(ArrayList<Aluno> turma) {
    Scanner ler = new Scanner(System.in);
    String nome;
    double freq, nf;
    String cf;
    
    while (true) {
      System.out.println("Nome (FIM para encerrar):");
      nome = ler.nextLine();
      if (nome.equalsIgnoreCase("FIM"))
         break;
      
      System.out.println();
      
      System.out.print("% de Frequência: ");
      freq = ler.nextDouble();
      
      System.out.print("Nota Final.....: ");
      nf = ler.nextDouble();
        
      System.out.println();
      System.out.print("Confirma o cadastro? (S/*): ");
      cf = ler.next();
      if (cf.equalsIgnoreCase("S")) {
         turma.add(new Aluno(nome, freq, nf));
         System.out.printf("<<<< Confirmado >>>>\n\n\n");
      }
      else {
         System.out.printf("<<<< Não Confirmado >>>>\n\n\n\n");
      }
      
      ler.nextLine(); // esvazia o buffer de entrada de dados
     }
     System.out.println();
  }
  
  public static void listar(ArrayList<Aluno> turma) {
    System.out.println("<<<<------- MEUS ALUNOS ------->>>>");
        
    int i = 1;
    for(Aluno item: turma) {
      System.out.printf("%do. aluno\n%s\n", i, item.toString());
      i++;
    }
        
    System.out.println("-----------------------------------\n");
  }
  
  public static void excluir(ArrayList<Aluno> turma) {
    Scanner ler = new Scanner(System.in);
    int i, n = turma.size(), pos;
    
    System.out.println("Posição Nome do(a) Aluno(a)________________");
    for(i=0; i<n; i++) {
      System.out.printf("%7d %s\n", 
        i, 
        turma.get(i).getNome() + Str.repetir(".", 35-turma.get(i).getNome().length()));
    }
    System.out.println("-------------------------------------------");
    
    System.out.print("Excluir Posição: ");
    pos = ler.nextInt();
    
    System.out.println();
    
    if ((pos < 0) || (pos >= n))
       System.out.println("Erro: " + pos + ", posição inválida!!!");
    else {
      String cf;
      
      System.out.println(turma.get(pos).toString());
      System.out.print("Confirma a Exclusão? (S/*): ");
      cf = ler.next();
      if (cf.equalsIgnoreCase("S")) {
         turma.remove(pos);
         System.out.println("<<< Excluído >>>");
      }
      else {
         System.out.println("<<< Mantido >>>");
      }
    }
    System.out.println();
  }
  
  public static void exportar(ArrayList<Aluno> turma) {
    try {
      FileWriter arq = new FileWriter("turma.txt");
      PrintWriter gravarArq = new PrintWriter(arq);
    
      for(Aluno aluno: turma) {
        gravarArq.printf("%s;%f;%f\n", aluno.getNome(), 
          aluno.getFreq(), aluno.getNf());
      }
    
      gravarArq.close();
    }
    catch(IOException e) {
      System.out.println("Erro: Exportação dos dados!!!");
    }
  }
  
  public static void importar(ArrayList<Aluno> turma) {
    try {
      FileReader arq = new FileReader("turma.txt");
      BufferedReader lerArq = new BufferedReader(arq);
    
      String nome, linha, partes[];
      double freq, nf;
    
      linha = lerArq.readLine(); // lê a primeira linha do arquivo
      while (linha != null) {
        partes = linha.split(";");
        
        nome = partes[0];
        freq = Double.parseDouble(partes[1].replace(",", "."));
        nf = Double.parseDouble(partes[2].replace(",", "."));
        
        turma.add(new Aluno(nome, freq, nf));
      
        linha = lerArq.readLine(); // lê da segunda até a última linha do arquivo
      }
    
      lerArq.close();
    }
    catch (IOException e) {
      System.out.println("Arquivo 'turma.txt' está vazio!!!");
    }
  }
}