package Assignment8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author hadim9637
 */
public class A8Q1 extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "Face";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;

    // YOUR GAME VARIABLES WOULD GO HERE
    //Creating a new colour
    Color skin = new Color(247, 215, 128);
    Color purple = new Color(182, 130, 255);


    // GAME VARIABLES END HERE    

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        //Making face structure
        g.setColor(skin);
        g.fillOval(200, 80, 350, 425);
        g.fillOval(365, 415, 100, 100);
        g.fillOval(285, 415, 100, 100);
        g.fillOval(325, 415, 100, 100);
        g.fillOval(325, 450, 100, 100);
        g.fillOval(350, 425, 100, 100);
        g.fillOval(300, 425, 100, 100);
        g.fillOval(305, 435, 100, 100);
        g.fillOval(370, 410, 100, 100);
        g.fillOval(350, 437, 100, 100);
        
        g.setColor(Color.white);
        //Making eyes
        int [] polygonX = {450, 475, 465};
        int [] polygonY = {275, 275, 300};
        g.fillPolygon(polygonX, polygonY, 3);
        g.fillOval(425, 250, 75, 75);
        g.setColor(skin);
        g.fillOval(425, 300, 100, 50);
        g.fillRect(425, 300, 100, 100);
        g.fillOval(480, 255, 25, 100);
        g.setColor(skin);
        g.fillOval(475, 285, 50, 25);
        g.setColor(Color.WHITE);
        g.fillOval(427, 253, 25, 35);
        g.fillOval(430, 253, 25, 35);
        g.setColor(Color.BLACK);
        g.fillOval(435, 260, 35, 35);
        
        
        int [] polygonX2 = {75, 100, 90};
        g2d.translate(375, 0);
        g2d.scale(-1, 1);
        g.setColor(Color.white);
        g.fillPolygon(polygonX2, polygonY, 3);
        g.fillOval(50, 250, 75, 75);
        g.setColor(skin);
        g.fillOval(50, 300, 100, 50);
        g.fillRect(50, 300, 100, 100);
        g.fillOval(105, 255, 25, 100);
        g.setColor(skin);
        g.fillOval(100, 285, 50, 25);
        g.setColor(Color.WHITE);
        g.fillOval(52, 253, 25, 35);
        g.fillOval(55, 253, 25, 35);
        g.setColor(Color.BLACK);
        g.fillOval(60, 260, 35, 35);
        g2d.scale(-1, 1);
        g2d.translate(-375, 0);
        
        //Making ears
        g.setColor(skin);
        int[]earX = {500,700, 475};
        int[]earY ={260,260, 350};
        g.fillPolygon(earX, earY, 3);
        int[]otherEarX = {250,50,275};
        int[]otherEarY = {260,260,350};
        g.fillPolygon(otherEarX, otherEarY, 3);
        
        //Making hood
        g.setColor(purple);
        g.fillOval(280, 60, 200, 100);
        int[] hoodFrontX = {280,480,380};
        int[] hoodFrontY = {100,100,225};
        g.fillPolygon(hoodFrontX, hoodFrontY, 3);
        g.fillOval(450, 100, 75, 100);
        g.fillOval(420, 125, 100, 50);
        g.fillOval(475, 150, 75, 100);
        g.fillOval(490, 175, 75, 100);
        g.fillOval(490, 195, 75, 100);
        g.fillOval(490, 250, 75, 100);
        g.fillOval(485, 275, 75, 100);
        g.fillOval(485, 300, 75, 100);
        g.fillOval(485, 325, 75, 100);
        g.fillOval(475, 350, 75, 100);
        g.fillOval(450, 375, 75, 100);
	g.fillOval(425, 400, 75, 100);	
        g.fillOval(400, 425, 75, 100);	
        g.fillOval(375, 475, 75, 100);
	g.fillOval(340, 475, 100, 100);	
        g.fillOval(320, 450, 75, 100);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8Q1 game = new A8Q1();
    }
}

