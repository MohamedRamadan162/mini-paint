/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.awt.Graphics;

/**
 *
 * @author Blu-Ray
 */
public class Rectangle extends SublimeShape{
    private int width, height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(this.getColor());
        canvas.drawRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getHeight());
        canvas.setColor(this.getFillColor());
        canvas.fillRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getHeight());
    }
    
}
