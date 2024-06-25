package POO;

import java.util.ArrayList;

public class Usando_Ponto {

    public static void main(String[] args) {
      ArrayList<Ponto> pontos = new ArrayList();
      
      pontos.add(new Ponto(0, 0));
      pontos.add(new Ponto(2, -3));
      pontos.add(new Ponto(0, 5));
      pontos.add(new Ponto(-1, 2));
      pontos.add(new Ponto(5, 4));
      
      for(Ponto item: pontos) {
        System.out.print(item.toString());  
      }      
    }

}
