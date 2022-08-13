import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Caminante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Caminante extends Enemigoss
{
    boolean ArribaAbajo;
    int velocidad = 2;
    public Caminante(boolean ArribaYAbajo)
    {
        getImage().scale(getImage().getWidth()/12, getImage().getHeight()/12);
        ArribaAbajo = ArribaYAbajo;
    }
    public void act()
    {
        rebotar();
        EnemigoPared();
        // Add your action code here.
    }
    public void EnemigoPared(){
        if (HitWalls() || isAtEdge()){
        velocidad = -velocidad;
        }
    }
    
    
    public void rebotar(){
        int x = getX(); 
        int y = getY();
        if (ArribaAbajo)
        {
            setLocation(x,y + velocidad);
        }
        else if (!ArribaAbajo)
        {
            setLocation(x+velocidad,y);
        }
    }
}
