package POO;

public class Jogador extends Pessoa {
  private int posicao;
  private double salario;

  public Jogador(String nome, char sexo, Data dtNasc, int posicao, double salario) {
    super(nome, sexo, dtNasc);
    this.posicao = posicao;
    this.salario = salario;
  }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String nomePosicao() {
      String posicoes[] = {"", "Goleiro", "Lateral Direito", "Lateral Esquerdo",
        "Zagueiro", "Meio campo", "Centroavante"};
      return(posicoes[posicao]); 
    }

    @Override
    public String toString() {
      String result = super.toString() +
        String.format("Posição......: %d- %s\n", posicao, nomePosicao()) +
        String.format("Salário......: R$ %.2f\n", salario);
      
      return result; 
    }

}
