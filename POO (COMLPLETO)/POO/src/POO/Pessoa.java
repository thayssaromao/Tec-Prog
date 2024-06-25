package POO;

public class Pessoa {
  private String nome;
  private char sexo;
  private Data dtNasc; // relacionamento de associação

    public Pessoa(String nome, char sexo, Data dtNasc) {
        this.nome = nome;
        this.sexo = sexo;
        this.dtNasc = dtNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Data getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Data dtNasc) {
        this.dtNasc = dtNasc;
    }

    @Override
    public String toString() {
        return String.format("Nome.........: %s\n", nome) +
               String.format("Sexo.........: %c\n", sexo) +
               String.format("Nascimento...: %s\n", dtNasc.toString(true, true));
    }

}
