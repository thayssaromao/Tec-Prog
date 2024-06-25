package POO;

import java.util.Calendar;

public class Data {
  private int dia;
  private int mes;
  private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data() {
        Calendar hoje = Calendar.getInstance();
        
        dia = hoje.get(Calendar.DAY_OF_MONTH);
        mes = hoje.get(Calendar.MONTH) + 1;
        ano = hoje.get(Calendar.YEAR);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int calcularIdade() {
      Data hj = new Data();  
      int idade;
      
      idade = hj.getAno() - ano;
      if ((hj.getMes() < mes) ||
          ((hj.getMes() == mes) && (hj.getDia() < dia)))
          idade = idade - 1;
      
      return(idade);
    }
    
    public String nomeDoMes() {
      String abrMes[] = {"", "JAN", "FEV", "MAR", "ABR",
        "MAI", "JUN", "JUL", "AGO", "SET", "OUT",
        "NOV", "DEZ"};
      
      return(abrMes[mes]);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }
    
    public String toString(boolean mesAbreviado, boolean mostrarIdade) {
      if (mesAbreviado && mostrarIdade)
         return(String.format("%02d/%s/%d (%d anos)", 
                  dia, nomeDoMes(), ano, calcularIdade()));
      else if (mesAbreviado)
              return(String.format("%02d/%s/%d", 
                  dia, nomeDoMes(), ano));
           else if (mostrarIdade)
                   return(String.format("%02d/%02d/%d (%d anos)", 
                     dia, mes, ano, calcularIdade()));
                else return(toString());
    }
   
}
