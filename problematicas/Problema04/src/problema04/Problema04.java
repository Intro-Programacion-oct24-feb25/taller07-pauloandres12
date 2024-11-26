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
        
        int num = 1;
        int den = 1;
        String cadena = "";
        String signo = "";
        
        cadena = String.format("%s%d ",
                cadena,
                num);
        
        while (den <= 13) {
            
            signo = switch (den) {
                case 1 -> "-";
                case 5 -> "-";
                case 9 -> "-"; 
                case 13 -> "-";
                default -> "+";
            };
            
         den = den + 2;
         cadena = String.format("%s %s %d/%d",
                 cadena,
                 signo,
                 num,
                 den);
        }
        
        System.out.printf("%s\n",
                cadena);
    }
    
}