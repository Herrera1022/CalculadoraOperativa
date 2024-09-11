/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import java.io.BufferedReader;
import java.io.IOException;
/**
 *En esta clase manejamos todo tipo de excepciones que puedan presentarse al momento de que el usuario
 * ingrese los datos.
 * 
 */
public class Validaciones {
    
    // Método para solicitar una cadena de texto al usuario.
    public static String tecladoCadena(BufferedReader bIn, String label) throws IOException{
        System.out.print(label); // Muestra la etiqueta (label) al usuario.
        return bIn.readLine();  // Lee la entrada de texto del usuario.
    }
    
    // Método para solicitar un número (double) al usuario, validando que sea un valor numérico.
    public static double tecladoNumero(BufferedReader bIn, String label) throws IOException{
        do
            {
            System.out.print(label); // Muestra la etiqueta (label) al usuario.
            try
            {
            double retornar = Double.parseDouble(bIn.readLine());  // Intenta convertir la entrada a un número double.
            return retornar;
            }
            catch(NumberFormatException e)
            {
            // Si el usuario ingresa un valor no numérico, se muestra un mensaje de error.
            System.err.println("Debe ingresar un dato numerico");
            }
            
    }while(true);  // Sigue pidiendo al usuario hasta que se ingrese un valor válido.
    }
    
    // Método para solicitar un divisor al usuario, validando que no sea cero.
    public static double pedirDivisor(BufferedReader bIn, String label) throws IOException {
        double num;
        do {
            num = tecladoNumero(bIn, label); // Solicita al usuario un número.
            if (num == 0) {
                 // Si el número es cero, se muestra un mensaje de error, ya que no se puede dividir por cero.
                System.err.println("Error: No se puede dividir por cero. Intente de nuevo.");
            }
        } while (num == 0);  // Sigue pidiendo al usuario hasta que se ingrese un número distinto de cero.
        return num;
    }
    
     // Método para solicitar un número al usuario, validando que no sea negativo (para raíces cuadradas).
    public static double pedirRadicando(BufferedReader bIn, String label) throws IOException {
        double num;
        do {
            num = tecladoNumero(bIn, label); // Solicita al usuario un número.
            if (num < 0) {
                 // Si el número es negativo, se muestra un mensaje de error, ya que no se puede calcular la raíz cuadrada de un número negativo.
                System.err.println("Error: No se puede sacar raiz a un numero negativo. Intente de nuevo.");
            }
        } while (num < 0); // Sigue pidiendo al usuario hasta que se ingrese un número positivo.
        return num;
    }
    
     // Método para solicitar un número entero al usuario, validando que se ingrese un valor entero.
    public static double validarEntero(BufferedReader bIn, String label) throws IOException{
        do
            {
            System.out.print(label); // Muestra la etiqueta (label) al usuario.
            try
            {
            int retornar = Integer.parseInt(bIn.readLine()); // Intenta convertir la entrada a un entero.
            return retornar; // Si la conversión es exitosa, retorna el número entero.
            }
            catch(NumberFormatException e)
            {
                 // Si el usuario ingresa un valor no entero, se muestra un mensaje de error.
            System.err.println("Debe ingresar un numero entero");
            }
            
    }while(true); // Sigue pidiendo al usuario hasta que se ingrese un valor válido.
    }
    }