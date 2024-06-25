package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private String CNPJ;
    private String nomeEmpresa;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String CNPJ, String nomeEmpresa, ArrayList<Funcionario> funcionarios) {
        this.CNPJ = CNPJ;
        this.nomeEmpresa = nomeEmpresa;
        this.funcionarios = funcionarios;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    
    public void adicionarFuncionario(Funcionario novoFuncionario){
        funcionarios.add(novoFuncionario);
    }
    
    public void excluirFuncionario(ArrayList<Funcionario> funcionarios){
        Scanner ler = new Scanner(System.in);
        String confirma;
        int n = funcionarios.size(), func_exclui, saida = 0;
        
        System.out.print("Excluir Funcionario: ");
        func_exclui = ler.nextInt() - 1;
         
        System.out.println();
    
        while(saida == 0){
                if ((func_exclui < 0) || (func_exclui >= n))
              System.out.println("\n\nErro: " + func_exclui + ", posição inválida!!!\n\n");
             else {

             System.out.println(">>>>>" + funcionarios.get(func_exclui).toString());
             System.out.print("\nConfirma a Exclusão? (S/*): ");

             confirma = ler.next();

             //equalsIgnoreCase compara duas strings sem levar em conta as 
             //diferenças entre letras maiúsculas e minúsculas.

             if (confirma.equalsIgnoreCase("S")) {
                funcionarios.remove(func_exclui);
                System.out.println("\n<<< Excluído >>>");
             }
             else {
                System.out.println("\n<<< Mantido >>>\n");
             }
           }
           System.out.println("excluir outro funcionario? nao(1)");
           saida = ler.nextInt();
           
        }
       

    }
    
    public void mostrarReajustes (ArrayList<Funcionario> funcionarios){
        
    }
    
    public void mostrarFuncionarios (ArrayList<Funcionario> funcionarios){
    System.out.println("<<<<------- FUNCIONARIOS------->>>>");
        
    int i = 1;
    double total = 0;
    
    for(Funcionario item: funcionarios) {
      System.out.printf("%do. funcionario\n%s\n", i, item.toString());
      total = total + item.getSalario();
      i++;
    }
        
    System.out.printf("Salario total...........: %.2f\n",total);
    System.out.println("-----------------------------------\n"); 
    }
    
    
    
    
    
}
