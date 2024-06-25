package POO;

import java.util.ArrayList;
import java.util.Scanner;


public class Usando_Empresa {

   
    public static void main(String[] args) {
        //inicializa a lista de funcionarios
        //inicializa a classe empresa e seus atributos
        Scanner ler = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Empresa empresa = new Empresa("12345678901234", "XYZ", funcionarios);
      
        
        // Cria e adiciona funcionários à empresa
        Funcionario funcionario1 = new Funcionario("Funcionário 1", 'M', new Data(7, 5, 1968),
                                                    "12345678901", 890.00, new Data(12, 2, 1998));
        empresa.adicionarFuncionario(funcionario1);
        Funcionario funcionario2 = new Funcionario("Funcionário 2", 'F', new Data(13, 11, 2000),
                                                    "12343243906", 1200.00, new Data(5, 1, 2024));
        empresa.adicionarFuncionario(funcionario2);
        Funcionario funcionario3 = new Funcionario("Funcionário 3", 'F', new Data(15, 11, 1980),
                                                    "12345678901", 3500.00, new Data(17, 3, 2013));
        empresa.adicionarFuncionario(funcionario3);
        
        int opcao;

        do {
          System.out.println("*** MENU PRINCIPAL ***");
          System.out.println("[ 1 ] Excluir ");
          System.out.println("[ 2 ] Listar ");
          System.out.println("[ 3 ] REAJUSTE");
          System.out.println("[ 0 ] Encerrar");
          System.out.println("**********************");

          do {
            System.out.print("Opçao Desejada? ");
            opcao = ler.nextInt();
          } while ((opcao != 1) && (opcao != 2) && 
                  (opcao != 0)&& (opcao != 3));


           if (opcao == 2)
             empresa.mostrarFuncionarios(funcionarios);
          else if (opcao == 1)
            empresa.excluirFuncionario(funcionarios);
          else if (opcao == 3){               
             // Aumenta o salário dos funcionários admitidos depois de 2000 em 7.5%
            System.out.println("\n\n>>>>>>>>>>APOS REAJUSTE<<<<<<<<<<\nn");
            funcionario1.aumentarSalario(0.1);
            funcionario2.aumentarSalario(0.075);
            funcionario3.aumentarSalario(0.075);
            empresa.mostrarFuncionarios(funcionarios);  
          }
           
        } while (opcao != 0); 

    }

}
