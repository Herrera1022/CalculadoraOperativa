/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author admin
 */
import java.io.BufferedReader; // Importamos la clase BufferedReader para leer texto del input.
import java.io.InputStreamReader; // Importamos la clase InputStreamReader para convertir el input del sistema en un stream de caracteres.
import java.io.IOException; // Importamos la clase IOException para manejar errores.


public class Calculadora {

    
    public static void main(String[] args) {
        
        // Crea un objeto BufferedReader que toma un InputStreamReader como argumento para leer los datos que el usuario ingrese desde la consola.
        BufferedReader bIn = new BufferedReader( new InputStreamReader (System.in) );
        
            try
            {
             // Llama al método estático "menu" de la clase "Menu" y le pasa el objeto BufferedReader (bIn) como argumento.
            Menu.menu(bIn);

            }
            catch(IOException e)
            {    
            // Captura y maneja las excepciones de tipo IOException.
            System.err.println("Ocurrio un error de IO" + e);

            }
            catch(Exception e)
            {
            // Captura y maneja cualquier otra excepción que no sea de tipo IOException.
            System.err.println("Ocurrio un error grave " + e);

            }
            
    }
}
    