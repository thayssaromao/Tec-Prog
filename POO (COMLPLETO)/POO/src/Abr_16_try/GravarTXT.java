package Abr_16_try;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravarTXT {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      String nome;
      double pc, alt;
      
      try {
        FileWriter arq = new FileWriter("pacientes.txt", true);
        PrintWriter gravarArq = new PrintWriter(arq);
      
        while (true) {
          System.out.println("Nome do Paciente (FIM para encerrar):");
          nome = ler.nextLine();
          if (nome.equalsIgnoreCase("FIM"))
              break;
      
          System.out.println();
          System.out.print("Peso Corporal (em kgs): ");
          pc = ler.nextDouble();
      
          System.out.print("Altura (em metros)....: ");
          alt = ler.nextDouble();
          
          System.out.println();
        
          ler.nextLine(); // limpa o buffer de entrada de dados
          
          gravarArq.printf("%s;%f;%f\n", nome, pc, alt);
        }
        
        gravarArq.close();
      }
      catch (IOException e1) {
        System.out.println("Erro com o arquivo de saída 'pacientes.txt'.");
      }
    }

}
