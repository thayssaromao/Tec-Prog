package POO;

import MeuPacote.Str;
import java.util.ArrayList;

public class Time {
  private String nomeTime;
  private Pessoa tecnico; // associação
  private ArrayList<Jogador> jogadores; // agregação: todo - parte

    public Time(String nomeTime, Pessoa tecnico) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        jogadores = new ArrayList();
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Pessoa getTecnico() {
        return tecnico;
    }

    public void setTecnico(Pessoa tecnico) {
        this.tecnico = tecnico;
    }
    
    public void adicionarJogador(Jogador novoJogador) {
      jogadores.add(novoJogador);
    }
    
    public void mostrarTime() {
      System.out.println("Time...: " + nomeTime);
      System.out.println("Técnico: " + tecnico.getNome() + " " +
         tecnico.getDtNasc().calcularIdade() + " anos.");
      
      System.out.println();
      
      double totSal = 0; 
      for(Jogador item: jogadores) {
        System.out.printf("%-30s %-15s %d anos R$ %9.2f\n",
          item.getNome()+Str.repetir('.', 30-item.getNome().length()), 
          item.nomePosicao(), item.getDtNasc().calcularIdade(),
          item.getSalario());  
        
        totSal += item.getSalario();
      }
      System.out.println();
      System.out.printf("Total dos Salários = R$ %.2f\n", totSal);      
    }

}
