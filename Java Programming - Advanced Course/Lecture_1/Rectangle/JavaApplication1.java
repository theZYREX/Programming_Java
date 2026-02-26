/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Ilia30
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 4);
        
        System.out.println(r1);
        System.out.println(r2);
        
        Rectangle[] rectArr = new Rectangle[10];
        rectArr[0] = new Rectangle(1,3);
        rectArr[1] = new Rectangle(3,1);
        rectArr[2] = new Rectangle(4,5);
        rectArr[3] = new Rectangle(10,3);
        rectArr[4] = new Rectangle(2,3);
        rectArr[5] = new Rectangle(3,8);
        rectArr[6] = new Rectangle(4,7);
        rectArr[7] = new Rectangle(5,2);
        rectArr[8] = new Rectangle(9,2);
        rectArr[9] = new Rectangle(8,2);
    
    
    for(int i =0; i < rectArr.length; i++){
        System.out.println(rectArr[i]);
    }
    }
}
