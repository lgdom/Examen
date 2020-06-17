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
public abstract class Figura {
    
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public abstract double area();
    
    public abstract double perimetro();
    
}
