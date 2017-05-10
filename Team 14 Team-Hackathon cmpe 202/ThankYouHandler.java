import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ThankYouHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ThankYouHandler extends Handler
{
     public void handle(GasPumpMachine gasPumpMachine,String state,String buttonValue){
           if(state=="thankyou_1" || state=="thankyou_2" || state=="thankyou_3") gasPumpMachine.setState("start");
           else gasPumpMachine.setState("start");
    }
}
