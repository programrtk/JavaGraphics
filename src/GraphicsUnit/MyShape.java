/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicsUnit;

/**
 *
 * @author SumitGaurav
 */

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Canvas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyShape extends Canvas
{

    public static void main(String[] args) {
              
        // TODO code application logic here
        
        JFrame myframe = new JFrame("Title: MyShape");
        Canvas canvas = new SmileyFace();       
        
        myframe.add(canvas);
        myframe.pack();
        
        myframe.setVisible(true);               
    }

    public MyShape()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      Shape shape_1 = new Shape(100, 100, 100, 100); 
      shape_1.draw(window);
   }

}