/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author admin
 */
import static com.mycompany.calculadora.Validaciones.pedirDivisor;
import static com.mycompany.calculadora.Validaciones.pedirRadicando;
import static com.mycompany.calculadora.Validaciones.tecladoNumero;
import static com.mycompany.calculadora.Validaciones.validarEntero;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *La clase menu maneja la interfaz y llama las funciones que necesite segun la opcion que haya
 * elejido el usuario.
 * 
 */
public class Menu {
    
    // Creamos las instancias estáticas de las clases OperadoresArit y OperadoresBit
    public static OperadoresArit calc = new OperadoresArit();
    public static OperadoresBit calc2 = new OperadoresBit();
    
    //Método que presenta el menú principal y llama a las funciones correspondientes.
    public static void menu(BufferedReader bIn) throws IOException
    {
        //Mensaje de bienvenida
        System.out.println("Bienvenido a la calculadora");
         // Solicitamos al usuario que elija entre operaciones aritméticas o de bits.
        int respuesta1 = (int) tecladoNumero(bIn, "Eliga que tipo de operador necesita: \n 1.Aritmetico \n 2.Bits \n");
        
         // Si el usuario elige las operaciones aritméticas.
        if(respuesta1 == 1){
             // Solicita al usuario que elija una operación aritmética.
            int respuesta = (int) tecladoNumero(bIn, "Eliga la operacion que necesite: \n 1.Suma \n 2.Resta"
                + " \n 3.Multiplicación \n 4.División \n 5. Potenciacion \n 6. Raiz cuadrada \n");
            
            // Ejecuta la operación seleccionada.
            switch(respuesta){
                case(1)->{
                    // Suma
                    int num1 = (int) tecladoNumero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) tecladoNumero(bIn,"Ingrese el segundo número: ");
                    calc.sumar(num1, num2);
                    System.out.println("Resultado de la suma: " + calc.getResultado());
                }
                case(2)->{
                    // Resta
                    int num1 = (int) tecladoNumero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) tecladoNumero(bIn,"Ingrese el segundo número: ");
                    calc.restar(num1, num2);
                    System.out.println("Resultado de la resta: " + calc.getResultado());
                
                }
                case(3)->{
                    // Multiplicación
                    int num1 = (int) tecladoNumero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) tecladoNumero(bIn,"Ingrese el segundo número: ");
                    calc.multiplicar(num1, num2);
                    System.out.println("Resultado de la multiplicación: " + calc.getResultado());
                }
                case(4)->{
                    // División
                    int num1 = (int) tecladoNumero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) pedirDivisor(bIn,"Ingrese el segundo número: ");
                    calc.dividir(num1, num2);
                    System.out.println("Resultado de la división: " + calc.getResultado()); 
                }
                case(5)->{
                    // Potenciación
                    int num1 = (int) tecladoNumero(bIn,"Ingrese la base: ");
                    int num2 = (int) tecladoNumero(bIn,"Ingrese el exponente: ");
                    calc.potenciar(num1, num2);
                    System.out.println("Resultado de la potencia: " + calc.getResultado());
              
                }
                case(6)->{
                    //Raíz cuadrada
                    int num = (int) pedirRadicando(bIn,"Ingrese el número: ");
                    calc.raizCuadrada(num);
                    System.out.println("Resultado de la raiz cuadrada: " + calc.getResultado());
              
                }
            
            }
           
            
        // Si el usuario elige las operaciones de bits.     
        }else if(respuesta1 == 2){
            // Solicita al usuario que elija una operación con bits.
            int respuesta = (int) tecladoNumero(bIn, "Eliga la operacion que necesite: \n 1.Suma \n 2.Resta"
                + " \n 3.Multiplicación \n 4.División \n 5.AND \n 6.OR \n 7.XORT \n 8.Desplazamiento a la derecha"
                    + "\n 9.Desplazamiento a la izquierda \n");
            // Ejecuta la operación seleccionada.
            switch(respuesta){
                case(1)->{
                     // Suma (Bits)
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) validarEntero(bIn,"Ingrese el segundo número: ");
                    calc2.sumar(num1, num2);
                    System.out.println("Resultado de la suma: " + calc.getResultado());
                }
                case(2)->{
                    // Resta (Bits)
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) validarEntero(bIn,"Ingrese el segundo número: ");
                    calc2.restar(num1, num2);
                    System.out.println("Resultado de la resta: " + calc.getResultado());
                
                }
                case(3)->{
                    // Multiplicación (Bits)
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) validarEntero(bIn,"Ingrese el segundo número: ");
                    calc2.multiplicar(num1, num2);
                    System.out.println("Resultado de la multiplicación: " + calc.getResultado());
                }
                case(4)->{
                    // División (Bits)
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) pedirDivisor(bIn,"Ingrese el segundo número: ");
                    calc2.dividir(num1, num2);
                    System.out.println("Resultado de la división: " + calc.getResultado()); 
                }
                case(5)->{
                    // Operación AND
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) validarEntero(bIn,"Ingrese el segundo número: ");
                    calc2.and(num1, num2);
                    System.out.println("Resultado de AND: " + calc2.getResultado());
              
                }
                case(6)->{
                     // Operación OR
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) validarEntero(bIn,"Ingrese el segundo número: ");
                    calc2.or(num1, num2);
                    System.out.println("Resultado de OR: " + calc2.getResultado());
                }
                case(7)->{
                    // Operación XOR
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) validarEntero(bIn,"Ingrese el segundo número: ");
                    calc2.xort(num1, num2);
                    System.out.println("Resultado de XORT: " + calc2.getResultado());
                }
                case(8)->{
                    // Desplazamiento a la derecha
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) validarEntero(bIn,"Ingrese el segundo número: ");
                    calc2.desplazarDer(num1, num2);
                    System.out.println("Resultado de desplazamiento a la derecha: " + calc2.getResultado());
                }
                case(9)->{
                   // Desplazamiento a la izquierda 
                    int num1 = (int) validarEntero(bIn,"Ingrese el primer número: ");
                    int num2 = (int) validarEntero(bIn,"Ingrese el segundo número: ");
                    calc2.desplazarIzq(num1, num2);
                    System.out.println("Resultado de desplazamiento a la izquierda: " + calc2.getResultado());
                }
            
            }
        }
        
        
    }
    
}

