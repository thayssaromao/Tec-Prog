package POO;

public class Usando_Time {

    public static void main(String[] args) {
      Time meuTime = new Time("ABC", new Pessoa("XXX", 'M', new Data(11, 1, 1985)));
      
      meuTime.adicionarJogador(new Jogador("AAA", 'M', new Data(10, 5, 2000), 1, 4000.00));
      meuTime.adicionarJogador(new Jogador("BBBBBB", 'M', new Data(10, 5, 2001), 2, 14000.00));
      meuTime.adicionarJogador(new Jogador("CCCCCCCCC", 'M', new Data(10, 5, 1999), 2, 140000.00));
      
      meuTime.mostrarTime();
    }

}
