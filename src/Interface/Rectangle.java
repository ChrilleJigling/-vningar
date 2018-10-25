/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Chris
 */
public class Rectangle implements Rezizable{
    private double height;
    private double width;
    
    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    @Override
    public void downSize(int scaleFactor) {
        height = height/scaleFactor;
        width = width/scaleFactor;
    }
    public String toString() {
        return "Height: "+height+" Width: "+width;
    }
}
