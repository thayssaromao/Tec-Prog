package POO;

public class Colaborador extends Pessoa{
    private int faltasMes;
    private double salario;

    public Colaborador(String nome, char sexo, Data dtNasc, int faltasMes, double salario) {
        super(nome, sexo, dtNasc);
        this.faltasMes = faltasMes;
        this.salario = salario;
    }

    public int getFaltasMes() {
        return faltasMes;
    }

    public double getSalario() {
        return salario;
    }

    public void setFaltasMes(int faltasMes) {
        this.faltasMes = faltasMes;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    public double valorPremio(int faltasMes){
                
        if(faltasMes == 0)
            return (200.00);
        else if(faltasMes <= 2)
               return(100.00);
            else if(faltasMes <= 4)
                return(50.00);
            else return 0;
            
    }
    
    public double salarioFinal(double salario, double valorPremio){return(salario+valorPremio);}
    
    @Override
    public String toString() {
        String result;
        
        result = super.toString() +
          String.format("Faltas.......: %d \n", faltasMes) +
          String.format("Salario......: %.2f\n", salario) +
          String.format("Premio.......: %.2f\n", valorPremio(faltasMes))+
          String.format("Total Salario: %.2f\n",salarioFinal(salario, valorPremio(faltasMes)));
        
        return result;
    }
    
}
