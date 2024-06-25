package Mar_28_Metodos;

import java.util.Scanner;

public class IMC_Sequencial {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    String nome;
    double pc, alt, vlrIMC;
    
    System.out.print("Nome do Paciente......: ");
    nome = ler.nextLine();
    
    System.out.print("Peso Corporal (em Kgs): ");
    pc = ler.nextDouble();
    
    System.out.print("Altura (em metros)....: ");
    alt = ler.nextDouble();
    
    System.out.println();
    
    vlrIMC = pc / (alt * alt);
    
    System.out.printf("Nome do Paciente: %s\n", nome);
    System.out.printf("Peso Corporal...: %.2f kgs\n", pc);
    System.out.printf("Altura..........: %.2f metros\n", alt);
    System.out.printf("IMC.............: %.2f ", vlrIMC);
    if (vlrIMC < 18.5)
        System.out.printf("Magreza\n");
    else if (vlrIMC < 25.0)
            System.out.printf("Normal\n");
         else if (vlrIMC < 30.0)
                 System.out.printf("Sobrepeso\n");
              else if (vlrIMC < 40.0)
                      System.out.printf("Obesidade\n");
              else System.out.printf("Obesidade Grave\n");    
  }
 
}