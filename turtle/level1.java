import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{

    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    
      {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super( 1000, 800 ,1); 
        
        addObject(new scorebanana(),100,40);
        addObject(new turtle(),20,100);
        addObject(new banana(),20,200);
        addObject(new banana(),100,750);
        addObject(new banana(),750,200);
        
        prepare();
    }
    private void prepare()
    {
        bola bola = new bola();
        addObject(bola,218,26);
        bola.setRotation(90);
}
{
    bola bola = new bola();
    addObject(bola,750,100);
    bola.setRotation(90);
}
}
