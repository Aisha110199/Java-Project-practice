/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameprojectbreakbang;

import java.awt.Color;
import java.awt.Graphics2D;
import sun.applet.Main;


public class Paddle {
    private double x;
    private int Width,Height;
    Main main=new Main();
    public final int YPOS=main.height=100;
    public Paddle()
    {
    Width=100;
    Height=20;
    
    x=main.weight-Width/2;
    }
    
public void update()
    {
    
    }
public void draw(Graphics2D g)
{
    
    
    g.setColor(Color.yellow);
    g.fillRect((int)x,YPOS, Height, Width);
    
    
    
    
    

}
}
