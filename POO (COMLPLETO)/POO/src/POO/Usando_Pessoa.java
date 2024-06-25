package POO;

import java.util.ArrayList;

public class Usando_Pessoa {

    public static void main(String[] args) {
      ArrayList<Pessoa> turma = new ArrayList();
      
      turma.add(new Pessoa("ALYSSON DE PAULO VELOSO", 'M', new Data(3, 9, 1994)));
      turma.add(new Pessoa("MATHEUS MORENO MARTINS", 'M', new Data(2, 2, 2003)));
      turma.add(new Pessoa("THAYSSA DANIELE PACHECO ROMAO", 'F', new Data(19, 7, 2004)));
      turma.add(new Pessoa("YOHAN FRAGA SANTOS", 'M', new Data(21, 8, 2000)));
      
      for(Pessoa item: turma) {
        System.out.println(item.toString());
      }
      
    }

}
