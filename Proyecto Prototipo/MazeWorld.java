import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MazeWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    /**
     * Constructor for objects of class MazeWorld.
     * 
     */
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }
    
    ///Coloca a todos los actores que se pueden llegar a utilizar
    private void prepare()
    {

        MazeBlock mazeBlock = new MazeBlock();
        addObject(mazeBlock,0*50,0*50);
        MazeBlock mazeBlock2 = new MazeBlock();
        addObject(mazeBlock2,1*50,0*50);
        MazeBlock mazeBlock3 = new MazeBlock();
        addObject(mazeBlock3,2*50,0*50);
        MazeBlock mazeBlock4 = new MazeBlock();
        addObject(mazeBlock4,0*50,2*50);
        MazeBlock mazeBlock5 = new MazeBlock();
        addObject(mazeBlock5,1*50,2*50);
        MazeBlock mazeBlock6 = new MazeBlock();
        addObject(mazeBlock6,1*50,3*50);
        MazeBlock mazeBlock7 = new MazeBlock();
        addObject(mazeBlock7,1*50,4*50);
        MazeBlock mazeBlock8 = new MazeBlock();
        addObject(mazeBlock8,1*50,5*50);
        MazeBlock mazeBlock9 = new MazeBlock();
        addObject(mazeBlock9,1*50,6*50);
        MazeBlock mazeBlock10 = new MazeBlock();
        addObject(mazeBlock10,1*50,8*50);
        MazeBlock mazeBlock11 = new MazeBlock();
        addObject(mazeBlock11,0*50,8*50);
        MazeBlock mazeBlock12 = new MazeBlock();
        addObject(mazeBlock12,0*50,9*50);
        MazeBlock mazeBlock13 = new MazeBlock();
        addObject(mazeBlock13,0*50,10*50);
        MazeBlock mazeBlock14 = new MazeBlock();
        addObject(mazeBlock14,2*50,10*50);
        MazeBlock mazeBlock15 = new MazeBlock();
        addObject(mazeBlock15,2*50,11*50);
        MazeBlock mazeBlock16 = new MazeBlock();
        addObject(mazeBlock16,3*50,11*50);
        MazeBlock mazeBlock17 = new MazeBlock();
        addObject(mazeBlock17,4*50,11*50);
        MazeBlock mazeBlock18 = new MazeBlock();
        addObject(mazeBlock18,5*50,11*50);
        MazeBlock mazeBlock19 = new MazeBlock();
        addObject(mazeBlock19,6*50,11*50);
        MazeBlock mazeBlock20 = new MazeBlock();
        addObject(mazeBlock20,7*50,11*50);
        MazeBlock mazeBlock21 = new MazeBlock();
        addObject(mazeBlock21,8*50,11*50);
        MazeBlock mazeBlock22 = new MazeBlock();
        addObject(mazeBlock22,9*50,11*50);
        MazeBlock mazeBlock23 = new MazeBlock();
        addObject(mazeBlock23,10*50,11*50);
        MazeBlock mazeBlock24 = new MazeBlock();
        addObject(mazeBlock24,11*50,11*50);
        MazeBlock mazeBlock25 = new MazeBlock();
        addObject(mazeBlock25,11*50,10*50);
        MazeBlock mazeBlock26 = new MazeBlock();
        addObject(mazeBlock26,11*50,9*50);
        MazeBlock mazeBlock27 = new MazeBlock();
        addObject(mazeBlock27,11*50,8*50);
        MazeBlock mazeBlock28 = new MazeBlock();
        addObject(mazeBlock28,11*50,7*50);
        MazeBlock mazeBlock29 = new MazeBlock();
        addObject(mazeBlock29,11*50,6*50);
        MazeBlock mazeBlock30 = new MazeBlock();
        addObject(mazeBlock30,11*50,5*50);
        MazeBlock mazeBlock31 = new MazeBlock();
        addObject(mazeBlock31,10*50,6*50);
        MazeBlock mazeBlock32 = new MazeBlock();
        addObject(mazeBlock32,9*50,9*50);
        MazeBlock mazeBlock33 = new MazeBlock();
        addObject(mazeBlock33,9*50,8*50);
        MazeBlock mazeBlock34 = new MazeBlock();
        addObject(mazeBlock34,8*50,8*50);
        MazeBlock mazeBlock35 = new MazeBlock();
        addObject(mazeBlock35,9*50,7*50);
        MazeBlock mazeBlock36 = new MazeBlock();
        addObject(mazeBlock36,9*50,5*50);
        MazeBlock mazeBlock37 = new MazeBlock();
        addObject(mazeBlock37,9*50,4*50);
        MazeBlock mazeBlock38 = new MazeBlock();
        addObject(mazeBlock38,9*50,3*50);
        MazeBlock mazeBlock39 = new MazeBlock();
        addObject(mazeBlock39,9*50,2*50);
        MazeBlock mazeBlock40 = new MazeBlock();
        addObject(mazeBlock40,8*50,2*50);
        MazeBlock mazeBlock41 = new MazeBlock();
        addObject(mazeBlock41,10*50,2*50);
        MazeBlock mazeBlock42 = new MazeBlock();
        addObject(mazeBlock42,11*50,0*50);
        MazeBlock mazeBlock43 = new MazeBlock();
        addObject(mazeBlock43,10*50,0*50);
        MazeBlock mazeBlock44 = new MazeBlock();
        addObject(mazeBlock44,9*50,0*50);
        MazeBlock mazeBlock45 = new MazeBlock();
        addObject(mazeBlock45,8*50,0*50);
        MazeBlock mazeBlock46 = new MazeBlock();
        addObject(mazeBlock46,7*50,1*50);
        mazeBlock31.setLocation(9*50,6*50);
        MazeBlock mazeBlock47 = new MazeBlock();
        addObject(mazeBlock47,6*50,1*50);
        MazeBlock mazeBlock48 = new MazeBlock();
        addObject(mazeBlock48,5*50,1*50);
        MazeBlock mazeBlock49 = new MazeBlock();
        addObject(mazeBlock49,6*50,3*50);
        MazeBlock mazeBlock50 = new MazeBlock();
        addObject(mazeBlock50,3*50,1*50);
        MazeBlock mazeBlock51 = new MazeBlock();
        addObject(mazeBlock51,3*50,2*50);
        MazeBlock mazeBlock52 = new MazeBlock();
        addObject(mazeBlock52,4*50,3*50);
        MazeBlock mazeBlock53 = new MazeBlock();
        addObject(mazeBlock53,3*50,4*50);
        MazeBlock mazeBlock54 = new MazeBlock();
        addObject(mazeBlock54,3*50,5*50);
        MazeBlock mazeBlock55 = new MazeBlock();
        addObject(mazeBlock55,3*50,6*50);
        MazeBlock mazeBlock56 = new MazeBlock();
        addObject(mazeBlock56,4*50,5*50);
        MazeBlock mazeBlock57 = new MazeBlock();
        addObject(mazeBlock57,4*50,6*50);
        MazeBlock mazeBlock58 = new MazeBlock();
        addObject(mazeBlock58,5*50,6*50);
        MazeBlock mazeBlock59 = new MazeBlock();
        addObject(mazeBlock59,5*50,5*50);
        MazeBlock mazeBlock60 = new MazeBlock();
        addObject(mazeBlock60,6*50,5*50);
        MazeBlock mazeBlock61 = new MazeBlock();
        addObject(mazeBlock61,6*50,6*50);
        mazeBlock56.setLocation(5*50,3*50);
        mazeBlock60.setLocation(6*50,5*50);
        mazeBlock61.setLocation(3*50,7*50);
        mazeBlock61.setLocation(3*50,8*50);
        MazeBlock mazeBlock62 = new MazeBlock();
        addObject(mazeBlock62,4*50,9*50);
        MazeBlock mazeBlock63 = new MazeBlock();
        addObject(mazeBlock63,5*50,9*50);
        MazeBlock mazeBlock64 = new MazeBlock();
        addObject(mazeBlock64,6*50,8*50);
        MazeBlock mazeBlock65 = new MazeBlock();
        addObject(mazeBlock65,6*50,7*50);
        Runner runner = new Runner(3);
        addObject(runner,49,505);
        runner.setLocation(25,554);
        removeObject(runner);
        MazeBlock mazeBlock66 = new MazeBlock();
        addObject(mazeBlock66,101,590);
        mazeBlock66.setLocation(100,597);
        mazeBlock15.setLocation(90,586);
        mazeBlock66.setLocation(89,596);
        MazeBlock mazeBlock67 = new MazeBlock();
        addObject(mazeBlock67,598,246);
        mazeBlock67.setLocation(594,248);
        MazeBlock mazeBlock68 = new MazeBlock();
        addObject(mazeBlock68,594,2);
        removeObject(mazeBlock66);
        mazeBlock15.setLocation(61,588);
        mazeBlock15.setLocation(109,576);
        MazeBlock mazeBlock69 = new MazeBlock();
        addObject(mazeBlock69,100,548);
        mazeBlock69.setLocation(107,539);
        mazeBlock69.setLocation(103,556);
        mazeBlock15.setLocation(101,582);
        mazeBlock15.setLocation(113,554);
        mazeBlock15.setLocation(109,552);
        mazeBlock15.setLocation(103,614);
        mazeBlock15.setLocation(102,593);
        mazeBlock69.setLocation(108,561);
        mazeBlock69.setLocation(98,540);
        mazeBlock14.setLocation(86,524);
        Runner runner2 = new Runner(3);
        addObject(runner2,30,561);
        mazeBlock14.setLocation(87,551);
        mazeBlock14.setLocation(83,496);
        mazeBlock69.setLocation(89,535);
        mazeBlock69.setLocation(349,481);
        mazeBlock14.setLocation(105,541);
        mazeBlock69.setLocation(95,488);
        mazeBlock14.setLocation(111,545);
        removeObject(mazeBlock14);
        removeObject(mazeBlock69);
        boost boost = new boost();
        addObject(boost,170,487);
        boost.setLocation(250,355);
        EnemigoLeaf enemigoLeaf = new EnemigoLeaf();
        addObject(enemigoLeaf,42,448);
        enemigoLeaf.setLocation(93,404);
        boost boost2 = new boost();
        addObject(boost2,191,214);
        boost2.setLocation(101,227);
        boost2.setLocation(89,209);
        boost.setLocation(289,440);
        EnemigoLeaf enemigoLeaf2 = new EnemigoLeaf();
        addObject(enemigoLeaf2,62,487);
        enemigoLeaf2.setLocation(52,489);
        EnemigoLeaf enemigoLeaf3 = new EnemigoLeaf();
        addObject(enemigoLeaf3,19,44);
        Caminante caminante1 = new Caminante(true);
        Caminante caminante = new Caminante(true);
        addObject(caminante,347,252);
        caminante.setLocation(360,296);
        caminante.setLocation(359,106);
        Caminante caminante2 = new Caminante(false);
        addObject(caminante2,199,11);
        caminante2.setLocation(196,13);
        caminante2.setLocation(226,21);
        caminante2.setLocation(253,13);
        caminante2.setLocation(395,63);
        caminante.setLocation(358,202);
        caminante2.setLocation(552,56);
        caminante.setLocation(102,361);
        caminante2.setLocation(493,55);
        Caminante caminante3 = new Caminante(false);
        addObject(caminante3,212,60);
        caminante3.setLocation(208,9);
        enemigoLeaf.setLocation(300,189);
        caminante3.setLocation(210,6);
        caminante3.setLocation(208,7);
        caminante3.setLocation(185,2);
        Caminante caminante4 = new Caminante(true);
        addObject(caminante4,365,307);
        caminante4.setLocation(356,298);
        caminante4.setLocation(344,302);
        caminante4.setLocation(353,307);
        boost boost3 = new boost();
        addObject(boost3,509,154);
        boost3.setLocation(499,150);
        boost boost4 = new boost();
        addObject(boost4,250,88);
        boost4.setLocation(252,103);
        boost boost5 = new boost();
        addObject(boost5,187,38);
        boost5.setLocation(212,12);
        enemigoLeaf.setLocation(303,196);
        boost5.setLocation(194,7);
    }
}