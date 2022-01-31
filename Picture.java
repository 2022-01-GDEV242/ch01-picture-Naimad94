/**
 * The image that is being represented is a classic situation in soccer, a 
 * penalty kick. These two people are playing together on a lovely day at their local soccer field.
 * The kicker is preparing to take the shoot as the goalie hopes to save it! 
 * 
 * @author  Damian Nunez
 * @version 01.30.2022
 */

// I editted the class to create my images.
// I had to delete edit the fields.
public class Picture
{
    private Square field;
    private Square sky;
    private Square house;
    private Triangle roof;
    private Person human;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    
    //I had to edit the constructor class to match my image.
    public Picture()
    {
	field = new Square();
        sky = new Square();
        house = new Square();
        roof = new Triangle();
        human = new Person();
        sun = new Circle();		
    }

    /**
     * Draw this picture.
     */
    
    /**
     *I deleted and editted somethings to make my change. This was annoying because i had to keep playing with the draw() method
     *to see how everything aligns.
     */
    
    public void draw()
    {  
        field.changeColor("green");
        field.moveHorizontal(-320);
        field.changeSize(550);
        field.makeVisible();

        sky.changeColor("skyblue");
        sky.moveHorizontal(-340);
        sky.moveVertical(-550);
        sky.changeSize(550);
        sky.makeVisible();
        
        house.changeColor("red");
        house.moveHorizontal(5);
        house.moveVertical(-50);
        house.changeSize(51);
        house.makeVisible();
        
        roof.changeColor("blue");
        roof.moveHorizontal(130);
        roof.moveVertical(-100);
        roof.changeSize(40,80);
        roof.makeVisible();
        
        human.changeSize(49,26);
        human.moveHorizontal(-25);
        human.moveVertical(-77);
        human.makeVisible();

        sun.changeColor("yellow");
        sun.moveHorizontal(-95);
        sun.moveVertical(-100);
        sun.changeSize(50);
        sun.makeVisible();
        
        //I guess i have to put this in the bottom because it reads the scrypt in an order.
        sun.slowMoveHorizontal(400);
        human.slowMoveVertical (250);
    }

    /**
     * Change this picture to black/white display
     * 
     */
    public void setBlackAndWhite()
    {
        if (sky!= null)   // only if it's painted already...
        {
            field.changeColor("black");
            sky.changeColor("grey");
            house.changeColor("white");
            roof.changeColor("black");
            human.changeColor("white");
            sun.changeColor("grey");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (sky!= null)   // only if it's painted already...
        {
            field.changeColor("green");
            sky.changeColor("skyblue");
            house.changeColor("red");
            roof.changeColor("blue");
            human.changeColor("black");
            sun.changeColor("yellow");
        }
    }
}