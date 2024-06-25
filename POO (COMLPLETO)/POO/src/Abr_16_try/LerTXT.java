package Abr_16_try;

import MeuPacote.CalculadoraIMC;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerTXT {

    public static void main(String[] args) {
      String nome, linha, partes[];
      double pc, alt;
      
      try {
        FileReader arq = new FileReader("pacientes.txt");
        BufferedReader lerArq = new BufferedReader(arq);
        
        linha = lerArq.readLine(); // lê a primeira linha do arquivo texto
        while (linha != null) {
            partes = linha.split(";");
            
            nome = partes[0];
            pc = Double.parseDouble(partes[1].replace(",", "."));
            alt = Double.parseDouble(partes[2].replace(",", "."));
            
            System.out.print(CalculadoraIMC.toString(nome, pc, alt));
            System.out.println();
            
            // lê da segunda até a última linha do arquivo texto
            linha = lerArq.readLine();
        }
        
        lerArq.close();
      }
      catch(FileNotFoundException e1) {
        System.out.println("Erro: arquivo 'pacientes.txt' não foi localizado.");  
      }
      catch(IOException e2) {
        System.out.println("Erro com o arquivo de entrada 'pacientes.txt'.");  
      }    
    }

}
