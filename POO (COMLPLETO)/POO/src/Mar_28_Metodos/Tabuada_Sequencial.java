package Mar_28_Metodos;

public class Tabuada_Sequencial {

  public static void main(String[] args) {
    int i, n;

    n = 5;
    System.out.println("+-------------+");
    for(i=1; i<=10; i++) {
      System.out.printf("| %d x %2d = %2d |\n", 
        n, i, (n*i));  
    }
    System.out.println("+-------------+");
    
    n = 7;
    System.out.println("+-------------+");
    for(i=1; i<=10; i++) {
      System.out.printf("| %d x %2d = %2d |\n", 
        n, i, (n*i));  
    }
    System.out.println("+-------------+");
    
    n = 9;
    System.out.println("+-------------+");
    for(i=1; i<=10; i++) {
      System.out.printf("| %d x %2d = %2d |\n", 
        n, i, (n*i));  
    }
    System.out.println("+-------------+");
  } 
}