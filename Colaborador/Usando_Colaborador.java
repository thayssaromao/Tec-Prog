package POO;


public class Usando_Colaborador {

   
    public static void main(String[] args) {
        Colaborador thayssa = new Colaborador("Thayssa Romao", 'F', new Data(19, 7, 2004), 
                1, 890);
        
         System.out.println(thayssa.toString());
         
         
         Colaborador joao = new Colaborador("Joao Hernandes", 'M', new Data(5,11 , 1986), 
                10, 1400);
         
         System.out.println(joao.toString());
         
         
         
    }
      
}
