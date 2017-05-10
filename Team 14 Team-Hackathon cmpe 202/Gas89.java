import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gas89 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gas89 extends GasTypeButton
{
    /**
     * Act - do whatever the Gas89 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gas89(){
        // GreenfootImage image = getImage();
        GreenfootImage img = new GreenfootImage("type_89.png");
        img.drawRect(0,0,39,39);
        img.scale( 40, 80 );  
        setImage(img);
    }

    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            for(GasPumpMachine gasPumpMachine: world.getObjects(GasPumpMachine.class)){
                gasPumpMachine.receiveButton("#89");
                gasPumpMachine.refresh();
            }
        }
    }    
}
