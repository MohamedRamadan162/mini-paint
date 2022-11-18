/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.awt.Graphics;

/**
 *
 * @author moham
 */
public class Circle extends SublimeShape{
    
    int raduis;
    
    public Circle(int raduis) {
        this.raduis = raduis;
    }
    
    
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(this.getColor());
        canvas.drawOval(this.getPosition().x, this.getPosition().y, 2*raduis, 2*raduis);
        canvas.setColor(this.getFillColor());
    }
    
}
