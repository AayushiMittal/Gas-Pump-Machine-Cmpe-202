import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FuellingStartHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuellingStartHandler extends Handler
{
     public void handle(GasPumpMachine gasPumpMachine,String state,String buttonValue){
        if(state=="fueling_start"){
             if(buttonValue.equals("gas_pump")){ 
                 
                 if(gasPumpMachine.hasReceipt() && gasPumpMachine.hasWash())
                 gasPumpMachine.setState("thankyou_3");
                 else if(gasPumpMachine.hasReceipt() && !gasPumpMachine.hasWash())
                 gasPumpMachine.setState("thankyou_1");
                 else
                 gasPumpMachine.setState("thankyou_2");                
             }
        }
        else next.handle(gasPumpMachine,state,buttonValue);
    }
}
