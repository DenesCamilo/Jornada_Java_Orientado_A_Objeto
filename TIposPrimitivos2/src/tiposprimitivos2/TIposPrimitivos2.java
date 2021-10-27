/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos2;

import java.util.Scanner;

/**
 *
 * @author 55719
 */
public class TIposPrimitivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota : ");
        float nota = teclado.nextFloat();
        System.out.println(nome + nota );
    }
    
}
