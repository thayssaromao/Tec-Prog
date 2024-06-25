package POO;

public class PacienteMarasmo extends Pessoa {
  private double pesoUsual;
  private double pesoAtual;

    public PacienteMarasmo(String nome, char sexo, Data dtNasc, double pesoUsual, double pesoAtual) {
        super(nome, sexo, dtNasc);
        this.pesoUsual = pesoUsual;
        this.pesoAtual = pesoAtual;
    }

    public double getPesoUsual() {
        return pesoUsual;
    }

    public void setPesoUsual(double pesoUsual) {
        this.pesoUsual = pesoUsual;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
    
    public double calcularMarasmo() {
      return(pesoAtual / pesoUsual * 100);  
    }
    
    public String interpretarMarasmo() {
      double valorMarasmo = calcularMarasmo();
      
      if (valorMarasmo < 80.00)
          return("Marasmo Grave");
      else if (valorMarasmo < 90.00)
              return("Marasmo Moderado");
           else if (valorMarasmo < 95)
                   return("Marasmo Leve");
                else return("Nenhuma");
    }

    @Override
    public String toString() {
        String result;
        
        result = super.toString() +
          String.format("Peso Atual...: %.3f kgs\n", pesoAtual) +
          String.format("Peso Usual...: %.3f kgs\n", pesoUsual) +
          String.format("Marasmo......: %.2f%% (%s)", calcularMarasmo(), 
            interpretarMarasmo());
        
        return result;
    }
    
    
  
  
}
