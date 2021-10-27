
package tiposprimitivos;

import java.util.Scanner;


public class TIposPrimitivos {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("Digite o nome do aluno");
        String nome = teclado.nextLine();
        System.out.println("digite a nota ");
        float nota = teclado.nextFloat();
        
        
        System.out.printf("A nota de %s é %.2f\n",nome ,nota);
    }
    
}
