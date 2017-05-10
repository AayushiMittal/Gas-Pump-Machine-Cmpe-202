import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MemberCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MemberCard extends Card
{
    /**
     * Act - do whatever the MemberCard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MemberCard(){
        
        GreenfootImage img = getImage();
         img.drawRect(0,0,99,59);
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
                List<GasPumpMachine> gm=wrld.getObjects(GasPumpMachine.class);
                    gm.get(0).receiveButton("member_card");
                    getWorld().removeObject(this);
                    gm.get(0).refresh();
                    MemberCard m=new MemberCard();
                    wrld.addObject(m,677,380);
               

          } 
       }
    }
}
