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
        
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 300, 30 );
      
      //green top
      window.setColor(Color.GREEN);
      window.fillRect( 100, 50, 600, 150 );
      
      //blue hut
      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );
      
      
      window.setColor(Color.YELLOW);
      window.fillRect( 260, 270, 80, 105 );
      
      window.fillRect( 445, 270, 80, 105);
      
      window.setColor(Color.WHITE);
      window.fillRect( 350, 450, 100, 300 );
      
      window.setColor(Color.GREEN);
      window.fillOval( 50, 450, 100, 500 );
      
      window.setColor(Color.GREEN);
      window.fillOval( 650, 450, 100, 500 );
      
      
      

   }
}