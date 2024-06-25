package Mar_26_String;

public class ASCII_I {

  public static void main(String[] args) {
    int i;
    for(i=65; i<=90; i++) {
      System.out.printf("%d: %c\n", i, (char)i);  
    }
    
    System.out.println("-----");
    
    char c;
    for(c='A'; c<='Z'; c++) {
      System.out.printf("%d: %c\n", (int)c, c);  
    }
  }
 
}