package Mar_28_Metodos;

public class Numeros_Sequencial {

  public static void main(String[] args) {
    int i, n, sm;
    
    n = 7;
    
    System.out.print("{ ");
    for(i=1; i<=n; i++) {
      System.out.printf("%d", i);
      if (i == n)
         System.out.println(" }");
      else System.out.print(", ");
    }
    
    sm = 0;
    for(i=1; i<=n; i++) {
      sm = sm + i;
    } 
    System.out.printf("Soma = %d.\n\n", sm);
    
    n = 10;
    
    System.out.print("{ ");
    for(i=1; i<=n; i++) {
      System.out.printf("%d", i);
      if (i == n)
         System.out.println(" }");
      else System.out.print(", ");
    }
    
    sm = 0;
    for(i=1; i<=n; i++) {
      sm = sm + i;
    } 
    System.out.printf("Soma = %d.\n\n", sm);    
  }

}
