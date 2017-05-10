import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PumpGasHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PumpGasHandler extends Handler
{
     public void handle(GasPumpMachine gasPumpMachine,String state,String buttonValue){
        if(state=="pump_gas"){
            if(buttonValue.equals("gas_pump")) gasPumpMachine.setState("fueling_start");
        }
        else next.handle(gasPumpMachine,state,buttonValue);
    }
}
