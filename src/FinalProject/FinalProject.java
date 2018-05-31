package FinalProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
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
public class FinalProject extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 1000;
    static final int HEIGHT = 700;
    //Title of the window
    String title = "My Game";
    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    // YOUR GAME VARIABLES WOULD GO HERE
    Color grass = new Color(23, 183, 31);
    //Making Character and enemies
    Rectangle mainChar = new Rectangle(400, 350, 50, 50);
    Rectangle enemy = new Rectangle(500, 10, 50, 50);
    Rectangle enemy2 = new Rectangle(680, -50, 50, 50);
    Rectangle eliteEnemy = new Rectangle(250, -100, 75, 75);
    Rectangle eliteEnemy2 = new Rectangle(50, -100, 75, 75);
    Rectangle eliteEnemy3 = new Rectangle(700, -100, 75, 75);
    Rectangle boulder = new Rectangle(-100, 350, 40, 40);
    Rectangle sword = new Rectangle(mainChar.x + 50, mainChar.y + 15, 50, 10);
    //Control variables
    boolean charRight = false;
    boolean charLeft = false;
    //Speed of Character
    int charSpeed = 5;
    //Monster's fall speed
    int mobFallSpeed = 4;
    int originalPosX = 500;
    int originalPosY = 350;
    boolean movingRight = true;
    int stopPosLeft = enemy.x - 100;
    int stopPosRight = enemy.x + 100;
    int stopPosLeft2 = enemy2.x - 100;
    int stopPosRight2 = enemy2.x + 100;
    int eStopPosLeft2 = eliteEnemy2.x - 100;
    int eStopPosRight2 = eliteEnemy2.x + 100;
    int eStopPosLeft = eliteEnemy.x - 200;
    int eStopPosRight = eliteEnemy.x + 200;
    int eStopPosLeft3 = eliteEnemy3.x - 200;
    int eStopPosRight3 = eliteEnemy3.x + 200;
    //Score and Health
    int health = 3;
    int score = 0;
    Font BiggerFont = new Font("arial", Font.BOLD, 36);
    //Getting hit (flashing)
    long flashUntil = System.currentTimeMillis();
    int flashDelay = 50;
    boolean flash = false;
    boolean facingLeft = false;
    //Temporary game over screen
    String gameOver = new String("Game Over");
    //Hitting
    boolean hitting = false;
    boolean swordApperance = false;
    int swordPosLeft = mainChar.x - 50;
    //Jumping
    boolean jumping = false;
    boolean onGround = true;
    //Adding gravity
    int gravity = 1;
    int velocity = 0;
    boolean boulderGoingRight = true;

    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public FinalProject() {
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

        gameTimer = new Timer(desiredTime, this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.GRAY);
        g.fillRect(0, 400, WIDTH, 650);


        g.setColor(Color.WHITE);
        g.fillRect(mainChar.x, mainChar.y, mainChar.width, mainChar.height);
        //If hitting, make sword appear
        if (swordApperance && !facingLeft) {
            g.setColor(Color.YELLOW);
            //Sword
            g.fillRect(mainChar.x + 50, mainChar.y + 15, sword.width, sword.height);
            sword.x = mainChar.x + 50;
            sword.y = mainChar.y + 15;
        }
        if (swordApperance && facingLeft) {
            g.setColor(Color.YELLOW);
            //Sword
            g.fillRect(mainChar.x - 50, mainChar.y + 15, sword.width, sword.height);
            sword.x = mainChar.x - 50;
            sword.y = mainChar.y + 15;
        }

        //Drawing enemies
        g.setColor(Color.RED);
        g.fillRect(enemy.x, enemy.y, enemy.width, enemy.height);
        g.fillRect(eliteEnemy.x, eliteEnemy.y, eliteEnemy.width, eliteEnemy.height);
        g.fillRect(enemy2.x, enemy2.y, enemy2.width, enemy2.height);
        g.fillRect(eliteEnemy2.x, eliteEnemy2.y, eliteEnemy2.width, eliteEnemy2.height);
        g.fillRect(eliteEnemy3.x, eliteEnemy3.y, eliteEnemy3.width, eliteEnemy3.height);
        g.setColor(Color.GRAY);
        g.fillRect(boulder.x, boulder.y, boulder.width, boulder.height);
        g.setColor(Color.GREEN);
        g.setFont(BiggerFont);
        g.drawString("" + health, 50, 50);
        g.drawString("Points: " + score, 800, 50);
        if (flash) {
            g.setColor(Color.RED);
            g.fillRect(0, 0, WIDTH, HEIGHT);
        }
        if (health <= 0) {
            g.clearRect(0, 0, WIDTH, HEIGHT);
            g.setFont(BiggerFont);
            g.drawString(gameOver, 400, 350);
        }




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
        moveChar();
        enemy();
        sword();
        healthBar();
        jump();
        boulder();

        collisionWithGround();
    }

    private void moveChar() {
        if (charRight) {
            mainChar.x = mainChar.x + charSpeed;
        } else if (charLeft) {
            mainChar.x = mainChar.x - charSpeed;
        }

        if (mainChar.x > WIDTH) {
            mainChar.x = WIDTH - mainChar.width;
        } else if (mainChar.x < 0) {
            mainChar.x = 0;
        }
    }

    private void enemy() {
        //Causes the enemy to fall
        if (enemy.y < 350) {
            enemy.y = enemy.y + mobFallSpeed;
        }
        //Makes the enemy roam right and left
        if (movingRight) {
            enemy.x++;

        } else {
            enemy.x--;

        }
        if (enemy.x == stopPosRight) {
            movingRight = false;
        } else if (enemy.x == stopPosLeft) {
            movingRight = true;
        }
        if (enemy.x > WIDTH) {
            enemy.x = WIDTH - enemy.width;
        } else if (enemy.x < 0) {
            enemy.x = 0;
        }
        if (enemy.x <= 0) {
            movingRight = true;
        } else if (enemy.x >= WIDTH) {
            movingRight = false;
        }
        //When player reaches 1000 points, an elite enemy spawns

        if (score >= 1000) {
            if (eliteEnemy.y < 325) {
                eliteEnemy.y = eliteEnemy.y + mobFallSpeed;
            }

            //Elite enemy movements
        }
        if (eliteEnemy.x == eStopPosRight) {
            movingRight = false;

        } else if (eliteEnemy.x == eStopPosLeft) {
            movingRight = true;
        }
        if (movingRight) {
            eliteEnemy.x++;
        } else {
            eliteEnemy.x--;
        }
        //Enemy 2 movements
        if (score >= 500) {
            if (enemy2.y < 350) {
                enemy2.y = enemy2.y + mobFallSpeed;
            }

        }
        if (movingRight) {
            enemy2.x++;
        } else {
            enemy2.x--;
        }
        if (enemy2.x > WIDTH) {
            enemy2.x = WIDTH - enemy2.width;
        } else if (enemy2.x < 0) {
            enemy2.x = 0;
        }
        if (enemy2.x <= 0) {
            movingRight = true;
        } else if (enemy2.x >= WIDTH) {
            movingRight = false;
        }


        if (enemy2.x == stopPosRight) {
            movingRight = false;
        } else if (enemy2.x == stopPosLeft) {
            movingRight = true;
        }
        if (enemy2.x > WIDTH) {
            enemy2.x = WIDTH - enemy2.width;
        } else if (enemy2.x < 0) {
            enemy2.x = 0;
        }
        if (enemy2.x <= 0) {
            movingRight = true;
        } else if (enemy2.x >= WIDTH) {
            movingRight = false;
        }
        //When over 4000 points, spawn 2 more enemies (max amount of enemies on screen now.. 5)
        if (score >= 4000) {
            if (eliteEnemy2.y < 325) {
                eliteEnemy2.y = eliteEnemy2.y + mobFallSpeed;
            }
            if (eliteEnemy3.y < 325) {
                eliteEnemy3.y = eliteEnemy3.y + mobFallSpeed;
            }
        }
        if (movingRight) {
            eliteEnemy2.x++;
            eliteEnemy3.x++;
        } else {
            eliteEnemy2.x--;
            eliteEnemy3.x--;
        }
        if (eliteEnemy2.x > WIDTH) {
            eliteEnemy2.x = WIDTH - eliteEnemy2.width;
        } else if (eliteEnemy2.x < 0) {
            eliteEnemy2.x = 0;
        }
        if (eliteEnemy2.x <= 0) {
            movingRight = true;
        } else if (eliteEnemy2.x >= WIDTH) {
            movingRight = false;
        }
        if (eliteEnemy2.x == stopPosRight) {
            movingRight = false;
        } else if (eliteEnemy2.x == stopPosLeft) {
            movingRight = true;
        }
        if (eliteEnemy2.x > WIDTH) {
            eliteEnemy2.x = WIDTH - eliteEnemy2.width;
        } else if (eliteEnemy2.x < 0) {
            eliteEnemy2.x = 0;
        }
        if (eliteEnemy2.x <= 0) {
            movingRight = true;
        } else if (eliteEnemy2.x >= WIDTH) {
            movingRight = false;
        }

        if (eliteEnemy3.x > WIDTH) {
            eliteEnemy3.x = WIDTH - eliteEnemy3.width;
        } else if (eliteEnemy3.x < 0) {
            eliteEnemy3.x = 0;
        }
        if (eliteEnemy3.x <= 0) {
            movingRight = true;
        } else if (eliteEnemy3.x >= WIDTH) {
            movingRight = false;
        }
        if (eliteEnemy3.x == stopPosRight) {
            movingRight = false;
        } else if (eliteEnemy3.x == stopPosLeft) {
            movingRight = true;
        }
        if (eliteEnemy3.x > WIDTH) {
            eliteEnemy3.x = WIDTH - eliteEnemy3.width;
        } else if (eliteEnemy3.x < 0) {
            eliteEnemy3.x = 0;
        }
        if (eliteEnemy3.x <= 0) {
            movingRight = true;
        } else if (eliteEnemy3.x >= WIDTH) {
            movingRight = false;
        }

    }

    private void sword() {

        if (hitting) {
            //When sword touches enemy, it "dies" and another spawns on top of screen.
            if (swordApperance) {
                if (sword.intersects(enemy)) {
                    enemy.x = (int) (Math.random() * 1000) + 0;
                    enemy.y = 0;
                    score = score + 100;
                }
                if (sword.intersects(enemy2)) {
                    enemy2.x = (int) (Math.random() * 1000) + 0;
                    enemy2.y = 0;
                    score = score + 100;
                }
                if (sword.intersects(eliteEnemy)) {
                    score = score + 250;
                    eliteEnemy.y = -100;
                }
                if (sword.intersects(eliteEnemy2)) {
                    score = score + 250;
                    eliteEnemy2.y = -100;
                }
                if (sword.intersects(eliteEnemy3)) {
                    score = score + 250;
                    eliteEnemy3.y = -100;
                }



            }



        }

    }

    private void healthBar() {
        //If character is touching enemy, lose one health
        if (mainChar.intersects(enemy)) {
            health--;
            //If enemy is on the right of the main char and is touched, bounce back
            if (enemy.x > mainChar.x) {
                mainChar.x = mainChar.x - 50;
            }//If enemy is on the left of the main char and is touched, bounce back
            else if (enemy.x < mainChar.x) {
                mainChar.x = mainChar.x + 50;

            }
            flash = true;
            flashUntil = System.currentTimeMillis() + flashDelay;
        }
        if (mainChar.intersects(eliteEnemy)) {
            health--;
            //If enemy is on the right of the main char and is touched, bounce back
            if (eliteEnemy.x > mainChar.x) {
                mainChar.x = mainChar.x - 50;
            }//If enemy is on the left of the main char and is touched, bounce back
            else if (eliteEnemy.x < mainChar.x) {
                mainChar.x = mainChar.x + 50;
            }

            flash = true;
            flashUntil = System.currentTimeMillis() + flashDelay;
        }
        if (mainChar.intersects(enemy2)) {
            health--;
            //If enemy is on the right of the main char and is touched, bounce back
            if (enemy2.x > mainChar.x) {
                mainChar.x = mainChar.x - 50;
            }//If enemy is on the left of the main char and is touched, bounce back
            else if (enemy2.x < mainChar.x) {
                mainChar.x = mainChar.x + 50;
            }
            flash = true;
            flashUntil = System.currentTimeMillis() + flashDelay;
        }

        if (System.currentTimeMillis() > flashUntil) {
            flash = false;
        }


    }

    private void jump() {
        velocity = velocity + gravity;
        if (jumping && onGround) {
            velocity = -15;
            onGround = false;
        }
        mainChar.y = mainChar.y + velocity;
        if (mainChar.y >= 350) {
            onGround = true;
        }

    }

    private void collisionWithGround() {
        if (mainChar.y > 350) {
            mainChar.y = 350;
        }

    }

    private void boulder() {
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
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_RIGHT) {
                charRight = true;
                facingLeft = false;
            } else if (keyCode == KeyEvent.VK_LEFT) {
                charLeft = true;
                facingLeft = true;

            }
            if (keyCode == KeyEvent.VK_UP) {
                jumping = true;

            }
            if (keyCode == KeyEvent.VK_SPACE) {
                hitting = true;
                swordApperance = true;





            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode == KeyEvent.VK_RIGHT) {
                charRight = false;
                facingLeft = false;
            } else if (keyCode == KeyEvent.VK_LEFT) {
                charLeft = false;
                facingLeft = true;
            }

            if (keyCode == KeyEvent.VK_SPACE) {
                hitting = true;
                swordApperance = false;
            }
            if (keyCode == KeyEvent.VK_UP) {
                jumping = false;

            }


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
        FinalProject game = new FinalProject();
    }
}