package MeuPacote;

import java.util.Scanner;

public class Vetor {
    
  public static void entrada(String nome, int x[]) {
    Scanner ler = new Scanner(System.in);
    
    int i;
    
    for(i=0; i<x.length; i++) {
      System.out.printf("%do. item de %d, %s[%d] = ", (i+1), x.length, nome, i);
      x[i] = ler.nextInt();
    }
    
    System.out.println();
  }
  
  public static int sum(int x[]) {
    int i, sm = 0;
    for(i=0; i<x.length; i++) {
      sm = sm + x[i];  
    }
    return(sm);
  }
  
  public static double avg(int x[]) {
    return(sum(x) / (double)x.length);
  }
  
  public static int min(int x[]) {
    int i, menor = x[0];
    for(i=1; i<x.length; i++) {
      if (x[i] < menor)
         menor = x[i];
    }
    return(menor);
  }

  public static int max(int x[]) {
    int i, maior = x[0];
    for(i=1; i<x.length; i++) {
      if (x[i] > maior)
         maior = x[i];
    }
    return(maior);
  }
  
  public static String mostrar(String nome, int x[]) {
    int i;
    String result;
    
    result = String.format("%s = { ", nome);
    for(i=0; i<x.length; i++) {
      result = result + String.format("%d ", x[i]);
    }
    result = result + "}\n";
    
    return(result);
  }
  
  public static String toString(String nome, int x[]) {
    String result = mostrar(nome, x);
    
    result = result + "\n" + String.format("Soma....: %s\n", sum(x)) +
                             String.format("Média...: %.2f\n", avg(x)) +
                             String.format("Menor...: %d\n", min(x)) +
                             String.format("Maior...: %d\n", max(x));
    
    return(result);    
  }
  
  
}
