package POO;

public class Ponto {
  private int x;
  private int y; 

  public Ponto(int x, int y) {
    this.x = x;
    this.y = y;
  }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public String posicao() {
      if ((x > 0) && (y > 0))
         return("Q1");
      else if ((x < 0) && (y > 0))
         return("Q2");
      else if ((x < 0) && (y < 0))
         return("Q3");
      else if ((x > 0) && (y < 0))
         return("Q4");
      else if ((x == 0) && (y != 0))
         return("Eixo y");
      else if ((x != 0) && (y == 0))
         return("Eixo x");
      else return("Origem");
    }

  @Override
    public String toString() {
      String result;
      result = String.format("(%d, %d) %s\n", x, y, posicao());
      return(result);
    }

}
