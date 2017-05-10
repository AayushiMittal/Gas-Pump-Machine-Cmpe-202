import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Creditcard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creditcard extends Card
{
    /**
     * Act - do whatever the Creditcard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Creditcard(){
    
        GreenfootImage img = getImage();
        img.scale( 200, 100 );         
        setImage(img);
    }
    CardSlot cSlot=new CardSlot();
    public void act() 
    {   
        int mouseX=0,mouseY=0;
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouseInfo = Greenfoot.getMouseInfo();  
            mouseX=mouseInfo.getX();  
            mouseY=mouseInfo.getY();  
            setLocation(mouseX, mouseY);  
            cSlot = (CardSlot)getOneIntersectingObject(CardSlot.class);
            if(cSlot!=null){                              
                World wrld = getWorld();
                List<GasPumpMachine> gasPumpMachines=wrld.getObjects(GasPumpMachine.class);
                    gasPumpMachines.get(0).receiveButton("credit_card");
                    getWorld().removeObject(this);
                    gasPumpMachines.get(0).refresh();
                    Creditcard c=new Creditcard();
                    wrld.addObject(c, 677, 500);
                    
               

        } 
       
    }
}    
}
