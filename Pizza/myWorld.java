import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myWorld extends World
{

    /**
     * Constructor for objects of class myWorld.
     * 
     */
    public myWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pizza pizza = new Pizza();
        addObject(pizza,300,300);
        pizza.setLocation(342,186);
        Topping topping = new Topping("Cheese");
        addObject(topping,0,0);
        Topping topping2 = new Topping("Pepperoni");
        addObject(topping2,599,399);
        Topping topping3 = new Topping("Mushrooms");
        addObject(topping3,350,150);
        Topping topping4 = new Topping("Olives");
        addObject(topping4,200,200);
    }
}
