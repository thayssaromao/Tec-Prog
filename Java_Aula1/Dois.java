import java.util.Scanner;

public class Dois {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n, a=1;
        
       
        System.out.printf("n: ");
        n = input.nextInt();
        
        System.out.println();
        
        if((n % 2) == 0)
            System.out.printf("%d, EH UM NUMERO PAR", n);
           
        else
            System.out.printf("%d, EH UM NUMERO IMPAR", n);
           
        System.out.println();
       
    }
    
}
