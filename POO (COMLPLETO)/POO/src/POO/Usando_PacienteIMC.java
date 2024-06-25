package POO;

public class Usando_PacienteIMC {

    public static void main(String[] args) {
      PacienteIMC matheus = new PacienteIMC("MATHEUS MORENO MARTINS", 'M',
        new Data(2, 2, 2003), 78.000, 1.81);
      
      System.out.println(matheus.toString());
    }

}
