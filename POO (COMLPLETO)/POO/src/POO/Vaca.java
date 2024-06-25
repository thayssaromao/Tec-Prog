package POO;

public class Vaca extends Animal {
  public static int ct = 0;

    public Vaca(String nome) {
        super(nome);
        ct = ct + 1;
    }

    @Override
    public void som() {
      System.out.println("Muuuu!!!");  
    }
    
    @Override
    public String toString() {
        return "Vaca{" + getNome() + '}';
    }
}
