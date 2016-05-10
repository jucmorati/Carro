/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Camilo
 */
import com.sun.prism.shader.FillCircle_Color_AlphaTest_Loader;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Usuario14
 */
public class Carro extends JPanel implements ActionListener, KeyListener{
    private int x;
    private int y;
    private Timer timer;
    public Carro(){
        this.x=90;
        this.y=100;
        this.setFocusable(true);
        this.addKeyListener(this);
        this.timer=new Timer(20,this);
        this.timer.start();
                
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
         g.setColor(Color.WHITE);
        g.fillOval(this.x+3, this.y, 20, 20);
        g.fillOval(this.x+42, this.y, 20, 20);
        
        g.setColor(Color.GRAY);
        g.fillOval(this.x, this.y, 25, 25);
        g.fillOval(this.x+40, this.y, 25, 25);
        
        g.setColor(Color.lightGray);
        Polygon poligon=new Polygon();
        poligon.addPoint(this.x-5, this.y-10);
        poligon.addPoint(this.x+10,this.y-30);
        poligon.addPoint(this.x+40,this.y-30);
        poligon.addPoint(this.x+70,this.y-10);
        g.fillPolygon(poligon);
       
        g.setColor(Color.BLACK);
        g.fillRect(this.x-5, this.y-10, 95, 20);
        
        
     
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (this.x>150|| this.x<0)
            this.x=30;
        if(this.y>200||y<0)
            this.y=100;
        repaint();
    }

    

    @Override
    public void keyPressed(KeyEvent e) {
         switch (e.getKeyCode()) {
            case KeyEvent.VK_DOWN: y += 10; break;
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10; break;
            
           
          } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

   
    
    
}
    

