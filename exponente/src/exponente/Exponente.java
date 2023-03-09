/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exponente;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exponente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        int doble = num * 2;
        int triple = num * 3;
        System.out.println(doble);
        System.out.println(triple);
        System.out.println(Math.sqrt(num));
                
    }
    
}
