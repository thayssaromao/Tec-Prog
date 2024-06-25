package POO;

import MeuPacote.CalculadoraIMC;

public class PacienteIMC extends Pessoa {
  private double pesoCorporal;
  private double altura; // em metros

    public PacienteIMC(String nome, char sexo, Data dtNasc, double pesoCorporal, double altura) {
        super(nome, sexo, dtNasc);
        this.pesoCorporal = pesoCorporal;
        this.altura = altura;
    }

    public double getPesoCorporal() {
        return pesoCorporal;
    }

    public void setPesoCorporal(double pesoCorporal) {
        this.pesoCorporal = pesoCorporal;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
      String result;
      double vlrIMC = CalculadoraIMC.calcularIMC(pesoCorporal, altura);
      
      result = super.toString() +
        String.format("Peso Corporal: %.3f kgs\n", pesoCorporal) +
        String.format("Altura.......: %.2f metros\n", altura) +
        String.format("IMC..........: %.2f (%s)\n", vlrIMC,
          CalculadoraIMC.interpretarIMC(pesoCorporal, altura));
      
      return(result);
    } 

}
