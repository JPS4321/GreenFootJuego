import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemigoLeaf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemigoLeaf extends Enemigoss
{
    /**
     * Act - do whatever the EnemigoLeaf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public EnemigoLeaf()
    {
        getImage().scale(getImage().getWidth()/5, getImage().getHeight()/5);
    }
    
    public void act()
    {
        move(5);
        FinDelMundo();
        // Add your action code here.
    }
}
