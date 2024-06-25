package Mar_26_String;

public class ASCII_II {

  public static void main(String[] args) {
    String nros = "", maius = "", minus = "";
    
    char c;
    
    for(c='0'; c<='9'; c++) {
       nros = nros + c; 
    }
    
    for(c='A'; c<='Z'; c++) {
       maius = maius + c; 
    }
    
    for(c='a'; c<='z'; c++) {
       minus = minus + c;
    }  
    
    System.out.println(nros);
    System.out.println(maius);   
    System.out.println(minus);     
  }
 
}