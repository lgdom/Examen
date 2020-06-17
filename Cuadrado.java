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
public class Cuadrado extends Figura{
    
    private double x;
    private double y;

    public Cuadrado(double x, double y, String color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public double area(){
        return x * y;
    }
    
    @Override
    public double perimetro(){
        return (2*x) + (2*y);
    }
    
}
