/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

import java.util.Scanner;

/**
 *
 * @author A286931
 */
public class Prueba3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre por favor:");
        nombre = leer.next();
        
        System.out.println("Ingrese su apellido por favor:");
        String apellido = leer.next();
        
        System.out.println("Ingrese su edad por favor:");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese su peso con 2 decimales por favor:");
        double peso = leer.nextDouble();
        
        System.out.println("¿es mayor de edad? S/N");
        String mayorEdad = leer.next();
        if(mayorEdad == "s"){
            boolean mayor = true;
            System.out.println("¿Mayor de edad? " + mayor);
        } else {
            boolean mayor = false;
            System.out.println("¿Mayor de edad? " + mayor);
        }
        
        System.out.println("Tu apeliido es " + apellido + ", tu edad es " + edad + ", tu peso es " + peso);
        
        double num1 = 10;
        double num2 = 20;
        double suma = num1 + num2;
        double division = num1/num2;
        boolean comparacion = num2 > num1;
        System.out.println("El primer numero es: " + num1 + ". El 2do numero es: " + num2 + ". La suma es: " + suma + ". La division es: " + division + ". El 2do numero es mas grande que el 1ro? " + comparacion);
        num1++;
        num2--;
        System.out.println(num1 + " --- " + num2);
    }
}