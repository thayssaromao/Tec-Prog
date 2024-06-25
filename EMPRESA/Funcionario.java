package POO;

//para criar a classe funcionario podemos criar uma extensao da classe pessoa já criada no projeto.

public class Funcionario extends Pessoa{

    //adicionamos novos atributos a classe
    // atributos privados
    
    private String CPF;
    private double salario;
    private Data admissao;
    
    //ativando o metodo construtor de funcionario
    //o método construtor "ativa"  ou "inicializa" objetos recém criados
    public Funcionario(String nome, char sexo, Data dtNasc, String CPF, double salario, Data admissao) {
        //super inicializa atributos pertencentes a uma classe pai
        super(nome, sexo, dtNasc);
        //this  Refere-se ao objeto atual da classe.
        this.salario = salario;
        this.CPF = CPF;
        this.admissao = admissao;
        
    }
    
    
    //apos inicializar a nova classe, chamamos os geters e seters

    //GET 
    public String getCPF() {
        return CPF;
    }

    public double getSalario() {
        return salario;
    }

    public Data getAdmissao() {
        return admissao;
    }
    
    
    //SET

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAdmissao(Data admissao) {
        this.admissao = admissao;
    }
    
    
    public void aumentarSalario(double reajuste) {
      this.salario = this.salario + (this.salario * reajuste);
      
  }
 
     @Override
    public String toString() {
        String result;
        
        result = super.toString() +
          String.format("Salario......: %.2f\n", salario) +
          String.format("Data de admissao: %s\n", admissao); 
        
        return result;
    }
}
