import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPump here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPump extends Actor
{
    private static GasPump gaspump;
    
    public GasPump(){
        GreenfootImage image = getImage();
        image.drawRect(0,0,169,119);
        image.scale( 170, 120 );  
        setImage(image);
    }
    /**
     * Act - do whatever the GasPump wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            World wrld = getWorld();
            for(GasPumpMachine gasPumpMachine: wrld.getObjects(GasPumpMachine.class)){
                gasPumpMachine.receiveButton("gas_pump");
                gasPumpMachine.refresh();
            }
        }
    }
    
    public static GasPump getInstance() {
        if(gaspump == null) {
            gaspump = new GasPump();
        }
        return gaspump;
    }
}
