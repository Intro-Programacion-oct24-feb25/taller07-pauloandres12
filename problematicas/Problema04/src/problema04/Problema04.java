/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int num1 = 1;
        int contador = 3;
        int limite = 15;
        String resultado = "";
        String signo = "";
   
        while(contador<=limite){
        
        resultado = String.format("%s - %s/%s",
                        resultado,
                        num1,
                        contador);
                        
            contador = contador + 2;
            resultado = String.format("%s",resultado);
        
        }
        System.out.printf("%s%s\n",
                num1,
                resultado);
        
    }
    
}
