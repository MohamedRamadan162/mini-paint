/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author moham
 */
public abstract class SublimeShape implements Shape{

    private Point startingCordinates;
    private Color color;
    private Color fillColor;
    
    @Override
    public void setPosition(Point position) {
        this.startingCordinates.x = position.x;
        this.startingCordinates.y = position.y;
    }
    @Override
    public Point getPosition() {
        return new Point(this.startingCordinates.x, startingCordinates.y);
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }
    @Override
    public abstract void draw(Graphics canvas);
    
}
