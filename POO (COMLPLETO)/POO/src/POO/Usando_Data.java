package POO;

public class Usando_Data {

    public static void main(String[] args) {
      Data hj = new Data();
      
      System.out.printf("Hoje é %s.\n", hj.toString());
      System.out.printf("Hoje é %s.\n", hj.toString(true, false));
      
      System.out.println();
      
      Data matheus = new Data(2, 2, 2003);
      System.out.printf("Matheus nasceu em %s.\n", matheus.toString(true, true));
      System.out.printf("Matheus nasceu em %s.\n", matheus.toString(true, false));
      System.out.printf("Matheus nasceu em %s.\n", matheus.toString(false, true));
      System.out.printf("Matheus nasceu em %s.\n", matheus.toString(false, false));
    }

}
