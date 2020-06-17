/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenp1;

/**
 *
 * @author luisf
 */
public class Circulo extends Figura{
    
    private double r;
    final double PI = 3.1416;

    public Circulo(double r, String color) {
        super(color);
        this.r = r;
    }
    
    @Override
    public double area (){
        return PI * r * r;
    }
    
    @Override
    public double perimetro(){
        return (2 * (PI * r));
    }
    
}
