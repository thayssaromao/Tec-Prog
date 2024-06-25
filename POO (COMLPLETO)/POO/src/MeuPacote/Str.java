package MeuPacote;

public class Str {
  
  public static boolean ehAlfabetico(char c) {
    return(((c >= 'A') && (c <= 'Z')) ||
           ((c >= 'a') && (c <= 'z')));
  }
  
  public static boolean ehVogal(char c) {
    return((c == 'a') || (c == 'A') ||
           (c == 'e') || (c == 'E') ||
           (c == 'i') || (c == 'I') ||
           (c == 'o') || (c == 'O') ||
           (c == 'u') || (c == 'U'));
  }
  
  public static boolean ehConsoante(char c) {
    return(ehAlfabetico(c) && !ehVogal(c));
  }
  
  // polimorfismo de sobrecarga (overload)
  public static String repetir() {
    int i;
    String result = "";
    
    for(i=1; i<=10; i++) {
      result = result + ".";
    }
    
    return(result);
  }
  
  public static String repetir(char tipo) {
    int i;
    String result = "";
    
    for(i=1; i<=10; i++) {
      result = result + tipo;
    }
    
    return(result);      
  }
  
  public static String repetir(char tipo, int tam) {
    int i;
    String result = "";
    
    for(i=1; i<=tam; i++) {
      result = result + tipo;
    }
    
    return(result);       
  }
  
  public static String repetir(String tipo, int tam) {
    int i;
    String result = "";
    
    for(i=1; i<=tam; i++) {
      result = result + tipo;
    }
    
    return(result);       
  }
  
  public static String center(String s, int tam, char c) {
    int esq, dir, n = s.length();
    
    esq = (tam - n) / 2;
    dir = (tam - n) / 2;
    esq = esq + (tam - (esq + dir + n));
    
    return(repetir(c, esq) + s + repetir(c, dir));
  }
  
}
