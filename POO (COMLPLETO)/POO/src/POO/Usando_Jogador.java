package POO;

import java.util.ArrayList;

public class Usando_Jogador {

    public static void main(String[] args) {
      ArrayList<Jogador> meuTime = new ArrayList();
      
      meuTime.add(new Jogador("Pezão", 'M', new Data(11, 7, 2000), 1, 5000.00));
      meuTime.add(new Jogador("Dedão", 'M', new Data(3, 10, 2001), 2, 3500.00));
      meuTime.add(new Jogador("Valdir", 'M', new Data(5, 1, 1998), 3, 6000.00));
      meuTime.add(new Jogador("Nestor", 'M', new Data(22, 5, 1997), 3, 7500.00));
      
      double totSal = 0;
      
      for(Jogador item: meuTime) {
        System.out.println(item.toString());
        
        totSal = totSal + item.getSalario();
      }
      
      System.out.printf("Total dos Salários: R$ %.2f\n", totSal);
    }

}
