import java.util.Scanner;

public class Um {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, soma, mult;
        
        System.out.printf("a: ");
        a = ler.nextInt();
        System.out.printf("b: ");
        b = ler.nextInt();
      
        soma = a + b;
        mult = a * b;
        
        System.out.println();
        System.out.printf("%d + %d = %d\n", a, b, soma);
        System.out.printf("%d * %d = %d\n", a, b, mult);
        
    }
    
}

//metodo -> função
//métodos DA classe, estáticos(metodo da classe) e não estáticos.
//nome externo PRECISA ser igual ao nome interno
//classe é o equivalente ao arquivo.h em C
//estancia significa um instante, onde se inicia a vida do objeto (variavel)
//'new' -> aloca memória para o objeto
//evitar usar %f, variaveis tipo float, optar por double
//java nao gera codigo executavel
//.class é o resultado bytecode (codigo binario)
//python -> script
//c -> executavel
//java -> bytecode