/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

/**
 *
 * @author admin
 */
/**
 * En esta clase estamos creando los operadores para bits, utilizamos el metodo de encapsulamiento.
 * 
 */
public class OperadoresBit {
    private int resultado; // Variable privada que almacena el resultado de las operaciones.

    // Constructor
    public OperadoresBit() {
        this.resultado = 0;
    }

    // Método para obtener el resultado
    public int getResultado() {
        return resultado;
    }

    // Método para realizar la suma de dos números y almacenar el resultado.
    public void sumar(int a, int b) {
        this.resultado = a + b;
    }
    
    // Método para realizar la resta de dos números y almacenar el resultado.
    public void restar(int a, int b) {
        this.resultado = a - b;
    }
    
    // Método para realizar la multiplicación de dos números y almacenar el resultado.
    public void multiplicar(int a, int b) {
        this.resultado = a * b;
    }
    
    // Método para realizar la división de dos números y almacenar el resultado.
    public void dividir(int a, int b) {
        
        this.resultado = a / b;
    }
    
    // Método para realizar la operación AND a nivel de bits entre dos números.
    public void and(int a, int b) {
        
        this.resultado = a & b;
    }
    
    // Método para realizar la operación OR a nivel de bits entre dos números.
    public void or(int a, int b) {
        
        this.resultado = a | b;
    }
    
    // Método para realizar la operación XOR (exclusivo o) a nivel de bits entre dos números.
    public void xort(int a, int b) {
        
        this.resultado = a ^ b;
    }
    
     // Método para realizar el desplazamiento de bits hacia la derecha.
    public void desplazarDer(int a, int b) {
        
        this.resultado = a >> b;
    }
    
      // Método para realizar el desplazamiento de bits hacia la izquierda.
    public void desplazarIzq(int a, int b) {
        
        this.resultado = a << b;
    }
   
}

