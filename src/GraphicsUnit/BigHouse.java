package GraphicsUnit;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.JFrame;

public class BigHouse extends Canvas
{
    
        public static void main(String[] args) {
              
        // TODO code application logic here
        
        JFrame myframe = new JFrame("Title: Big House");
        Canvas canvas = new BigHouse();       
        
        myframe.add(canvas);
        myframe.pack();
        
        myframe.setVisible(true);               
    }
        JFrame myframe = new JFrame("Title: Big House");
        Canvas canvas = new BigHouse();       
        
        myframe.add(canvas);
        myframe.pack();
        
        myframe.setVisible(true); 
        
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );

   }
}