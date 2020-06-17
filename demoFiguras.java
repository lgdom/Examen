/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenp1;
import java.util.Scanner;

/**
 *
 * @author luisf
 */
public class demoFiguras {
    public static void main(String[] args) {
        int opt;
        Scanner choose = new Scanner (System.in);
        Scanner rad = new Scanner (System.in);
        Scanner lados = new Scanner(System.in);
        
        System.out.println("Menú \n");
        System.out.println("1. Crear circulo");
        System.out.println("2. Crear cuadrado");
        System.out.println("3. Salir\n");
        System.out.println("Selecciona una opción: ");
         
        opt = choose.nextInt();
        
        while (opt != 3){
        switch (opt){
            
            case (1):
                double r ;
                String color1;
                
                System.out.println("Introduce el valor del radio en cm: ");
                r = rad.nextDouble();
                System.out.println("Introduce el color de la figura: ");
                color1 = rad.next();
          
                Circulo fig1 = new Circulo(r, color1);
                
                System.out.println("\nEl area del circulo es: " +fig1.area());
                System.out.println("El perimetro del circulo es: " +fig1.perimetro());
                System.out.println("El color del circulo es: " +color1 +"\n");
             
                System.out.println("Menú \n");
                System.out.println("1. Crear circulo");
                System.out.println("2. Crear cuadrado");
                System.out.println("3. Salir\n");
                System.out.println("Selecciona una opción: ");
         
                opt = choose.nextInt();
                break;
                
            case (2):
                double x;
                double y;
                String color2;
                
                System.out.println("Introduce el valor de un lado en cm: ");
                x = lados.nextDouble();
                System.out.println("Introduce el valor del otro lado en cm: ");
                y = lados.nextDouble();
                System.out.println("Introduce el color de la figura: ");
                color2 = rad.next();
                
                Cuadrado fig2 = new Cuadrado (x, y, color2);
                
                System.out.println("\nEl area del cuadrado es: " +fig2.area());
                System.out.println("El perimetro del cuadrado es: " +fig2.perimetro());
                System.out.println("El color del cuadrado es: " +color2 +"\n");
                
                System.out.println("Menú \n");
                System.out.println("1. Crear circulo");
                System.out.println("2. Crear cuadrado");
                System.out.println("3. Salir\n");
                System.out.println("Selecciona una opción: ");
         
                opt = choose.nextInt();
                
                break;
                
            case (3):
                break;            
            }
        }    
    }  
}
