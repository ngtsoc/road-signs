package com.pythonjava4teachers.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class RoadSigns extends JPanel {

	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Polygon  b = new Polygon();
	    for (int i = 0; i < 6; i++)
	      b.addPoint((int) (100 + 90 * Math.cos(i * 2 * Math.PI / 6)),
	          (int) (100 + 90 * Math.sin(i * 2 * Math.PI / 6)));

	    g.setColor(Color.WHITE);
	    g.fillPolygon(b);
	    g.drawPolygon(b);
	    
	    Polygon p = new Polygon();
	    for (int i = 0; i < 6; i++)
	      p.addPoint((int) (100 + 80 * Math.cos(i * 2 * Math.PI / 6)),
	          (int) (100 + 80 * Math.sin(i * 2 * Math.PI / 6)));

	    g.setColor(Color.RED);
	    g.fillPolygon(p);
	    g.drawPolygon(p);
	    
	    Graphics2D g2 = (Graphics2D)g;
        
	    g2.setColor(Color.WHITE);
        Font font = new Font("Arial", Font.PLAIN, 40);
        g2.setFont(font);

        g2.drawString("STOP", 45, 110); 
	    
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new RoadSigns();
            panel.setBackground(Color.cyan);
            var frame = new JFrame("Stop Sign");
            frame.setSize(220, 230);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
	
}
