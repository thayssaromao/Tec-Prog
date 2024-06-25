package MeuPacote;

public class CalculadoraIMC {
    public static double calcularIMC(double pc, double alt) {
      return(pc / (alt * alt));
    }
    
    public static String interpretarIMC(double pc, double alt) {
      double vlrIMC;
      
      vlrIMC = calcularIMC(pc, alt);
      if (vlrIMC < 18.5)
         return("Magreza");
      else if (vlrIMC < 25.0)
              return("Normal");
           else if (vlrIMC < 30.0)
                   return("Sobrepeso");
                else if (vlrIMC < 40.0)
                        return("Obesidade");
                     else return("Obesidade Grave"); 
    }
    
    public static String toString(String nome, double pc, double alt) {
      String result; 
      double vlrIMC = calcularIMC(pc, alt);
      
      result = String.format("Nome.........: %s\n", nome) +
               String.format("Peso Corporal: %.3f kgs\n", pc) +
               String.format("Altura.......: %.2f metros\n", alt) +
               String.format("IMC..........: %.2f (%s)\n", vlrIMC,
                 interpretarIMC(pc, alt));
               
      return(result);        
    }
    
}
