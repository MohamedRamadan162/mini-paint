/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author moham
 */
public class LineSegment extends SublimeShape{

    private Point endingCoordinates;
    
    public void setEndPosition(Point position){
        this.endingCoordinates = position;
    }
    
    public Point getEndPosition(){
        return endingCoordinates;
    }
    @Override
    public void draw(Graphics canvas) {
        canvas.setColor(this.getColor());
        canvas.drawLine(this.getPosition().x, this.getPosition().y, this.getEndPosition().x, this.getEndPosition().y);
    }
    
}
