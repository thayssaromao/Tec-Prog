package MeuPacote;

public class Aluno {
    
  public static String situacao(double freq, double nf) {
    if ((nf >= 6.0) && (freq >= 75.0))
       return("APROVADO");
    else if ((nf >= 6.0) && (freq < 75.0))
            return("REPROVADO POR FREQUÊNCIA");
         else if ((nf < 6.0) && (freq >= 75.0))
                 return("REPROVADO POR NOTA");
              else return("REPROVADO POR NOTA E FREQUÊNCIA");   
  }
  
  public static String toString(String nome, double freq, double nf) {
    String result;
    
    result = String.format("Nome......: %s\n", nome) +
             String.format("Frequência: %.2f%%\n", freq) +
             String.format("Nota Final: %.2f\n", nf) +
             String.format("Situação..: %s\n", situacao(freq, nf));
    
    return(result);
  }
    
}
