/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadena = "";
        String nombre;
        String posicion;
        
        int edad = 0;
       
        double estatura;
        boolean bandera = true;
        String salir;
        
        int sumaEdades = 0;
        double sumaEstatura = 0;
        String cadenaEdad = "";
       
        int contador = 0;
        
        int promedioEdad = 0;
        double promedioEstatura = 0;
        
        cadena = String.format("%s%s\n", cadena,
                "Listado de Jugadores");
        

        while(bandera){
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del Jugador: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            
            contador = contador + 1; // primera(0+1=1)
            sumaEdades = sumaEdades + edad;
            sumaEstatura = sumaEstatura + estatura;
            cadenaEdad += "" + edad + "\n";
         
            cadena = String.format("%s%d. %s -%s-, edad: %d, estatura: "
                    + "%.2f "
                    + "\n",
                    cadena,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            
            System.out.println("Desea salir del ciclo, digite: salir");
            salir = entrada.nextLine();
            if(salir.equals("salir")){
                bandera = false;
            }
            
        }
        
        promedioEdad = sumaEdades / contador;
        promedioEstatura = sumaEstatura / contador;
        
        cadena = String.format("%sLista de edades: \n%s",
                 cadena,
                 cadenaEdad);
        cadena = String.format("%s"
                    + "Promedio Edades: %d\n"
                    + "Promedio Estaturas: %.2f\n",
                    cadena,
                    promedioEdad,
                    promedioEstatura);
 
        System.out.printf("%s\n", cadena);

    }
}
