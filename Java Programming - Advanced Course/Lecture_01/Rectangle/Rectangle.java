/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Ilia30
 */
public class Rectangle {
    public double width = -1;
    public double height = -1;


    public Rectangle(){

    }

    public Rectangle(double _width , double _height){
    width = _width;
    height = _height;
    }

    public double getArea(){
        return width * height;
    }
    
    public double getPerimeter(){
        return (width + height) *2;
    }
    
    public String toString(){
        return " " + height + "," + width + ","+ getArea() + "," + getPerimeter();   
    }
}
