package POO;

public class Usando_MeuMath {

    public static void main(String[] args) {
      MeuMath x = new MeuMath(17, 3);

      System.out.println(x.toString());
      
      System.out.println("a: " + x.getA());
      System.out.println("b: " + x.getB());
      System.out.println();
      
      x.setA(5);
      System.out.println(x.toString());
    }

}
