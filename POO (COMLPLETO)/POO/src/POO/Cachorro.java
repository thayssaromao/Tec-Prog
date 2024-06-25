package POO;

public class Cachorro extends Animal {
  public static int ct = 0;

    public Cachorro(String nome) {
        super(nome);
        ct = ct + 1;
    }

    @Override
    public void som() {
      System.out.println("Au!!! Au!!! Au!!!");  
    }
    
    public void rosnar() {
      System.out.println("Grrrrrrrrrrrrr!!!");  
    }

    @Override
    public String toString() {
        return "Cachorro{" + getNome() + '}';
    }
    

}
