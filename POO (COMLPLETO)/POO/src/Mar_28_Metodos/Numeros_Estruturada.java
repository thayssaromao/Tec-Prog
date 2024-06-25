package Mar_28_Metodos;

public class Numeros_Estruturada {

    public static void main(String[] args) {
      toString(7);
      toString(10);
    }
    
    public static void mostrar(int n) {
      int i;
      
      System.out.print("{ ");
      for(i=1; i<=n; i++) {
        System.out.printf("%d", i);
        if (i == n)
           System.out.println(" }");
        else System.out.print(", ");
      }  
    }
    
    public static int somar(int n) {
      int i, sm;
      
      sm = 0;
      for(i=1; i<=n; i++) {
        sm = sm + i;
      }
      
      return(sm);
    }
    
    public static void toString(int n) {
      mostrar(n);
      System.out.printf("Soma = %d.\n\n", somar(n));
    }

}
