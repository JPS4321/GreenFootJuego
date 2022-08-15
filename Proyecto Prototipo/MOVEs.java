import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MOVEs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MOVEs extends Actor
{
    int velocidad = 4;
    int puntos = 0;
    /**
     * Act - do whatever the MOVEs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        // Add your action code here.
    }
    ///Muestra la velocidad maxima a la que el personaje puede llegar.
    public void VelocidadMax(){
        if (velocidad>=7){
            velocidad = 7;
        }
    }
    public void MoverseYGirar()
    {
        if(Greenfoot.isKeyDown("right")){
        
            setRotation(0);
            move(4);
        }
        if(Greenfoot.isKeyDown("left")){
        
            setRotation(180);
            move(4);
        }
        if(Greenfoot.isKeyDown("up")){
        
            setRotation(270);
            move(4);
        }
        if(Greenfoot.isKeyDown("down")){
        
            setRotation(90);
            move(4);
        }
    }
    /// Esto permite que el personaje se mueva
    public void MoverseSinGirar(){
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right")){
        
            setLocation(x + velocidad,y);
            if(HitWalls())
            {
            setLocation(x - velocidad,y);
            }
        }
        if(Greenfoot.isKeyDown("left")){
        
            setLocation(x - velocidad,y);
            if(HitWalls())
            {
            setLocation(x + velocidad,y);
            }
        }
        if(Greenfoot.isKeyDown("up")){
        
            setLocation(x,y - velocidad);
            if(HitWalls())
            {
            setLocation(x,y + velocidad);
            }
        }
        if(Greenfoot.isKeyDown("down")){
        
            setLocation(x,y + velocidad);
            if(HitWalls())
            {
            setLocation(x,y - velocidad);
            }
        }
    }
    ///evita que el actor no pueda moverse atravez de las paredes
    public boolean HitWalls()
    {
     if(isTouching(MazeBlock.class))
    {
        return true;
    }
    else
    {
     return false;
    }
    }
    ///Hace que cuando se coma la "fruta" se mueva más rapido el personaje
    public void TenerBoost(){
     if (isTouching(boost.class)){
         
         velocidad = velocidad + 1;
         removeTouching(boost.class);
         
     }
    }
    //Detecta cuando objeto enemigo toco al personaje
    public boolean Golpear(){
     if (isTouching(Enemigoss.class)){
           return true; 
        }
     else{   
      return false;    
     }
    }
}
