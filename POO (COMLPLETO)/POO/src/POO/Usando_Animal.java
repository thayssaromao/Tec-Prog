package POO;

import java.util.ArrayList;

public class Usando_Animal {

    public static void main(String[] args) {
      ArrayList<Animal> a = new ArrayList();  
      
      a.add(new Gato("Judy"));
      a.add(new Gato("Cosmos"));
      a.add(new Gato("Farofa"));
      
      a.add(new Cachorro("Juca"));
      a.add(new Cachorro("Pluto"));
      a.add(new Cachorro("Bidu"));
      a.add(new Cachorro("Viramundo"));
      
      a.add(new Vaca("Mimosa"));
      
      for(Animal item: a) {
        item.som();
        System.out.println(item.toString());
        if (item instanceof Cachorro) {
           ((Cachorro)item).rosnar();
        }
        System.out.println();
      }
      
      System.out.println();
      System.out.printf("Aqui temos %d cachorros.\n", Cachorro.ct);
      System.out.printf("E temos %d gatos.\n", Gato.ct);
      System.out.printf("E temos %d vacas.\n", Vaca.ct);
    }

}
