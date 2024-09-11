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
 *En esta clase estamos creando los operadores aritmeticos , utilizamos el metodo de encapsulamiento.
 * 
 */
public class OperadoresArit {
    private double resultado; // Variable privada que almacena el resultado de las operaciones aritméticas.

    // Constructor
    public OperadoresArit() {
        this.resultado = 0;
    }

    // Método para obtener el resultado
    public double getResultado() {
        return resultado;
    }

    // Métodos sobrecargados para sumar
    public void sumar(double a, double b) {
        this.resultado = a + b;
    }
    
    // Este método suma un número al valor actual de resultado.
    public void sumar(double a) {
        this.resultado += a;
    }

    // Métodos sobrecargados para restar
    public void restar(double a, double b) {
        this.resultado = a - b;
    }

    // Este método resta un número al valor actual de resultado.
    public void restar(double a) {
        this.resultado -= a;
    }

    // Método para multiplicar dos números y almacenar el resultado.
    public void multiplicar(double a, double b) {
        this.resultado = a * b;
    }
    
    // Método para dividir dos números y almacenar el resultado.
    public void dividir(double a, double b) {
        this.resultado = a / b;
    }
    
    
    // Método para calcular la potencia y almacenar el resultado.
    public void potenciar(double base, double exponente) {
        this.resultado = Math.pow(base, exponente);
    }
    
    // Método para calcular la raíz cuadrada de un número y almacenar el resultado.
    public void raizCuadrada(double a){  
        this.resultado = Math.sqrt(a);
    }
}

