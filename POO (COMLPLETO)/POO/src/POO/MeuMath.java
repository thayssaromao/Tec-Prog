package POO;

public class MeuMath {
  private int a;
  private int b;

  public MeuMath(int a, int b) {
    this.a = a;
    this.b = b;
  }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public int soma() {
      return(a + b);
    }
    
    public int subtracao() {
      return(a - b);
    }
    
    public int mult() {
      return(a * b);
    }
    
    public int divInteira() {
      return(a / b);
    }
    
    public double divReal() {
      return(a / (double)b);
    }
    
    public String toString() {
      String result;

      result = String.format("Sendo a = %d e b = %d, tem-se:\n" +
                   "Soma = %d\n" +
                   "Subtracao = %d\n" +
                   "Multiplicacao = %d\n" +
                   "Divisao Inteira = %d\n" +
                   "Divisao Real = %.2f\n",
                   a, b, soma(), subtracao(), mult(),
                   divInteira(), divReal());  
      
      return(result);
    }

}
