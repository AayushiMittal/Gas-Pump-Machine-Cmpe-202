import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gas87 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gas87 extends GasTypeButton
{
    /**
     * Act - do whatever the Gas87 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gas87(){
        GreenfootImage img = new GreenfootImage("type_87.png");
        img.drawRect(0,0,39,39);
        img.scale( 40, 80 );  
        setImage(img);
    }

    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            World wrld = getWorld();
            for(GasPumpMachine gasPumpMachine: wrld.getObjects(GasPumpMachine.class)){
                gasPumpMachine.receiveButton("#87");
                gasPumpMachine.refresh();
            }
        }
    } 
}
