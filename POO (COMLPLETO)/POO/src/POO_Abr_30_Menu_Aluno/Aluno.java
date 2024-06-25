package POO_Abr_30_Menu_Aluno;

public class Aluno {
  private String nome;
  private double freq;
  private double nf;

  public Aluno(String nome, double freq, double nf) {
    this.nome = nome;
    this.freq = freq;
    this.nf = nf;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public double getNf() {
        return nf;
    }

    public void setNf(double nf) {
        this.nf = nf;
    }

  public String situacao() {
    if ((nf >= 6.0) && (freq >= 75.0))
       return("APROVADO");
    else if ((nf >= 6.0) && (freq < 75.0))
            return("REPROVADO POR FREQUÊNCIA");
         else if ((nf < 6.0) && (freq >= 75.0))
                 return("REPROVADO POR NOTA");
              else return("REPROVADO POR NOTA E FREQUÊNCIA");   
  }
  
  @Override
  public String toString() {
    String result;
    
    result = String.format("Nome......: %s\n", nome) +
             String.format("Frequência: %.2f%%\n", freq) +
             String.format("Nota Final: %.2f\n", nf) +
             String.format("Situação..: %s\n", situacao());
    
    return(result);
  }
  
}
