package POO;

public class Usando_PacienteMarasmo {

    public static void main(String[] args) {
      PacienteMarasmo juca = new PacienteMarasmo("Juca Bala", 'M', 
        new Data(11, 5, 1982), 97.500, 95.400);
      
      System.out.println(juca.toString());
    }

}
