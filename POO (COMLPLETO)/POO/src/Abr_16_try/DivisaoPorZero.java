package Abr_16_try;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoPorZero {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
          
      int a, b, divInt, resto;
      double divReal;
      
      
      //TRY -> BLOCO EM QUE PODE ACONTECER UMA EXCEÇÃO
      try {
        System.out.print("a: ");
        a = ler.nextInt();
      
        System.out.print("b: ");
        b = ler.nextInt();
      
        System.out.println();
      
        divInt = a / b;
        resto = a % b;
      
        divReal = a / (double)b;
      
        System.out.printf("%d / %d = %d (divisão inteira)\n", a, b, divInt);
        System.out.printf("%d (resto da divisão inteira)\n\n", resto);
        System.out.printf("%d / %d = %.2f (divisão real)\n", a, b, divReal); 
      }
      
      //CATCH -> BLOCO DE TRATAMENTO DE UMA EXCEÇÃO (TRY) 
      catch (ArithmeticException e1) {
        System.out.println("Erro: divisão por zero.");
      }
      catch (InputMismatchException e2) {
        System.out.println("Erro na entrada de dados (tipo incompatíveis).");
      }
    }

}
