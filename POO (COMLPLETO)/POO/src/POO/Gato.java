package POO;

public class Gato extends Animal {
  public static int ct = 0;

    public Gato(String nome) {
        super(nome);
        ct = ct + 1;
    }

    @Override
    public void som() {
      System.out.println("Miauuuuuuuuuuuuuuuuuu!!!");  
    }

    @Override
    public String toString() {
        return "Gato{" + getNome() + '}';
    }   

}
