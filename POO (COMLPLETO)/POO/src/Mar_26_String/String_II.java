package Mar_26_String;

import java.util.Scanner;

public class String_II {

    public static void main(String[] args) {
      Scanner ler = new Scanner(System.in);
      
      String s;
      System.out.println("Informe uma String:");
      s = ler.nextLine();
      
      System.out.println();
      
      for(int i=0; i<s.length(); i++) {
        System.out.printf("%d: %c %c %c\n", 
          i, 
          s.charAt(i),
          Character.toLowerCase(s.charAt(i)),
          Character.toUpperCase(s.charAt(i)));
      }
    }

}
