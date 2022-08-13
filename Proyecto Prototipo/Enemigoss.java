import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigoss extends MOVEs
{
    /**
     * Act - do whatever the Enemigoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void FinDelMundo(){
        int x = getX();
        int y = getY();
        int Longitud = getWorld().getWidth() -1;
        int Altura = getWorld().getHeight() -1;
     if (x >= Longitud)
     {
        setLocation(1,y);
        
        }
     if (x <= 0)
     {
        setLocation(Longitud - 1,y);
        
        }
     if (y >= Altura)
     {
        setLocation(x,1);
        
        }
     if (y <= 0)
     {
        setLocation(x, Altura - 1);
        
        }
    }
}
