
package aleatorio;
import java.util.Scanner;
//importar primeiro a classe Random para evitar erros
import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random rnd = new Random();
        
        boolean correto = false;//estrutura lógica 
        int n;
//variável para o número aleatório
        int x= rnd.nextInt(100);
//estrutura de repetição para fazer o looping com o tipo boolean
        while(!correto){
            System.out.println("digite um número de 1 a 100:");
            n = ler.nextInt();
            if (x>n){
                System.out.println("MAIOR");
                
            }else if (x<n){
                System.out.println("MENOR");
                
            }else{
                System.out.println("Parabéns! Você acertou!");
                
            correto = true;
            }
        }
    }  
}
       
    
    

