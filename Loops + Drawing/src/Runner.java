import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Polygon;
public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
//		
//		//variables
//		int lines = 0;
//		int squares = 0;
//		int circles = 0;
//		
		Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
//        
//		 
//		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
//		//portion of the GUI
//		g2.drawRect(10, 10, 765, 540);
//		
//		
//		//2) Draw a horizontal line to bisect the Rectangle
//		g2.drawLine(10, 270, 770, 270);
//		
//		
//		//3) Draw a vertical line to bisect the shape again
//		g2.drawLine(765/2, 10, 765/2,550 );
//		
//		
//		//4) small rectangles on top-left
//		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
//		
//		// Top Left Rectangle
//		while (lines < 100)
//		{
//			int red = (int)(Math.random()*256);
//			int green = (int)(Math.random()*256);
//			int blue = (int)(Math.random()*256);
//			g.setColor(new Color(red, green, blue));
//			int lineX = (int)(Math.random()*365)+15;
//			int lineX2 = (int)(Math.random()*365)+15;
//			int lineY = (int)(Math.random()*255)+15;
//			int lineY2 = (int)(Math.random()*255)+15;
//			g2.setStroke(new BasicStroke(1));
//			g.drawLine(lineX, lineY, lineX2, lineY2);
//			lines += 1;
//		}
//		
//		// Top Right Rectangle
//		while (squares < 100)
//		{
//			int red = (int)(Math.random()*256);
//			int green = (int)(Math.random()*256);
//			int blue = (int)(Math.random()*256);
//			g.setColor(new Color(red, green, blue));
//			int X = (int)(Math.random()*330)+390;
//			int Y = (int)(Math.random()*205)+15;
//			g.fillRect(X, Y, 50, 50);
//			squares += 1;
//		}
//		
//		// Bottom Left Rectangle
//		while (circles < 100)
//		{
//			int red = (int)(Math.random()*256);
//			int green = (int)(Math.random()*256);
//			int blue = (int)(Math.random()*256);
//			g.setColor(new Color(red, green, blue));
//			int circleX = (int)(Math.random()*(395-5+1))+5;
//			int circleY = (int)(Math.random()*(585-275+1))+275;
//			int circleWidthHeight = (int)(Math.random()*201);
//			if (circleX + circleWidthHeight >= 380 || circleX <= 15 || circleY + circleWidthHeight >= 545)
//			{
//				//nothing
//			}
//			else
//			{
//				g.drawOval(circleX, circleY, circleWidthHeight, circleWidthHeight);
//				circles += 1;
//			}
//		}
//		
//		// Bottom Right Rectangle
//		g.setColor(new Color(0, 0, 255));
//		int[] xPoints;
//		int[] yPoints;
//		xPoints = new int[4];
//		xPoints[0] = 625;
//		xPoints[1] = 625;
//		xPoints[2] = 650;
//		xPoints[3] = 650;
//		yPoints = new int[4];
//		yPoints[0] = 375;
//		yPoints[1] = 425;
//		yPoints[2] = 450;
//		yPoints[3] = 400;
//		g.fillPolygon(xPoints, yPoints, 4);
//		
//		g.setColor(new Color(255, 255, 0));
//		g.fillRect(575, 375, 50, 50);
//		
//		g.setColor(new Color(0, 255, 0));
//		xPoints[0] = 575;
//		xPoints[1] = 575;
//		xPoints[2] = 600;
//		xPoints[3] = 600;
//		yPoints[0] = 375;
//		yPoints[1] = 425;
//		yPoints[2] = 450;
//		yPoints[3] = 400;
//		g.fillPolygon(xPoints, yPoints, 4);
//		
//		g.setColor(new Color(255, 0, 0));
//		g.fillRect(600, 400, 50, 50);
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		
		 
//		int y = 0;
//		for (int x = 0; x < 5; x += 1)
//		{
//			x += 1;
//			y = x % 4;
//			System.out.println(x + " + " + y);
//			x -= 1;
//		}
		
//		int x = 1;
//		int y = 0;
//		while (x % 5 > y)
//		{
//			y = x % 4;
//			x += 1;
//			System.out.println(y);
//		}
		
//		int var1 = 0;
//		int var2 = 2;
//		for ( ; var2 != 0 && (var1 / var2) >= 0; var1 += 1, var2 -= 1)
//		{
//			var1 += 1;
//			var2 -= 1;
//		}
//		System.out.println(var1 + " : " + var2);
		
//		int i = 0;
//		int x = 4;
//		while (i < x)
//		{
//			System.out.println(i);
//			i += 1;
//		}

//		int x = 2;
//		int y = 5;
//		for ( ; y > 2 && x < y; x += 1, y -= 1)
//		{
//			x += 1;
//			y -= 1;
//		}
//		System.out.println(x + ":" + y);
		
//		int num = 1;
//		int count = 0;
//		for ( ; num % 2 != 0 && num < 1000; num += 1)
//		{
//			count = count + num;
//			num += 1;
//		}
//		System.out.println(count);
		
//		int num = 1;
//		int count = 0;
//		while (num < 1000)
//		{
//			count += num;
//			num += 2;
//		}
//		System.out.println(count);
	
		
		
	//new assignment
    g2.setStroke(new BasicStroke (1));
    for (int x = 0, y = 600; x < 800 && y <= 600; x += 25, y -= 25)
    {
    	g.drawLine(x, 0, 0, y);
    }
    for (int x = 800, y = 0; x > 0 && y >= 0; x -= 25, y += 25)
    {
    	g.drawLine(x, 600, 800, y);
    }
    int x = 0;
    int y = 0;
	while (x <= 800 || y <= 600)
	{
		g.drawLine(800, y, x, 0);
		x += 25;
		y += 25;
	}
	x = 800;
	y = 600;
	while (x >= 0 || y >= 0)
	{
		g.drawLine(0, y, x, 600);
		x -= 25;
		y -= 25;
	}
		
	}
//	
//	
//	
//	
//	
//	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
