import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardSlot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardSlot extends Actor
{
    Creditcard creditCard;
     public CardSlot(){
        String image="card_slot.png";
        GreenfootImage img = null;
        img=new GreenfootImage(image);
        img.scale( 110, 80 );         
        setImage(img);
    }
    public void act() 
    {
     
    }    
}
