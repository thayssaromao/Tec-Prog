//atributos da classe Paciente

public class Paciente {
    private String nome;
    private double pesoAtual;
    private double pesoUsual;


//metodo construtor da classe Paciente

public Paciente(String nome, double pesoAtual, double pesoUsual) {
        this.nome = nome;
        this.pesoAtual = pesoAtual;
        this.pesoUsual = pesoUsual;
    }

 // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }

    public double getPesoUsual() {
        return pesoUsual;
    }

    public void setPesoUsual(double pesoUsual) {
        this.pesoUsual = pesoUsual;
    }

// Outros métodos

public static double Calcular_Marasmo(double pesoUsual, double pesoAtual){
    return((((double)pesoUsual - pesoAtual)/pesoUsual)*100);
}


public static String InterpretarMarasmo(double pesoUsual,double pesoAtual){
   double valor;
   
   valor = Calcular_Marasmo(pesoUsual, pesoAtual);
   if (valor >= 50 && valor < 80)
        return "Marasmo Grave";
    else if (valor >= 30 && valor < 50)
        return "Marasmo Moderado";
    else if (valor >= 20 && valor < 30)
        return "Marasmo Leve";
    else
        return "Nenhum";
            
}

//Polimorfismo de sobrecarga
public static String toString(String nome, double pesoAtual, double pesoUsual){
    String result;
    double valor;
   
   valor = Calcular_Marasmo(pesoUsual, pesoAtual);
   
   result = String.format("Nome.........: %s\n", nome) +
            String.format("Peso Atual...: %.2f\n", pesoAtual)+
            String.format("Peso Usual...: %.2f\n", pesoUsual)+
            String.format("Marasmo......: %.2f%%(%s)\n\n------------------------\n", valor, InterpretarMarasmo(pesoUsual,pesoAtual));
            
              
           
    return result;       
           
}

}