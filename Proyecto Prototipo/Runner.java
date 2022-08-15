import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner extends MOVEs
{
    int vidas = 3;
    int puntos = 0;
    /**
     * Act - do whatever the Runner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //Constructor
    public Runner(int lives)
    {
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4);
        vidas = lives;
    }
    public void act()
    {
        MoverseSinGirar();
        MPuntos();
        TenerBoost();
        VelocidadMax();
        PerderVida();
        JugadorGolpeado();
        Ganar();
        Perder();
        
    }
    public void JugadorGolpeado(){
     if(Golpear() == true){
        setLocation(40, 560);
         
        }
    }
    public void PerderVida(){
    if(Golpear()){
    vidas--;
    }
    }
    public void Perder(){
    if(vidas == 0){
        getWorld().addObject(new YouLose(), getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.stop();
    }
    }
    public void MPuntos(){
     if (isTouching(boost.class)){
         puntos = puntos + 1;
     }
    }
    public void Ganar(){
    if(puntos == 7){
        getWorld().addObject(new YouWin(), getWorld().getWidth()/2,getWorld().getHeight()/2);
        Greenfoot.stop();
    }
    }
}
