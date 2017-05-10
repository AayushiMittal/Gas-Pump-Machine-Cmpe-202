import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectGasHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectGasHandler extends Handler
{
    public void handle(GasPumpMachine gasPumpMachine,String state,String buttonValue){
        if(state=="select_gas"){
               if(buttonValue.equals("#87") || buttonValue.equals("#89") || buttonValue.equals("#93"))
               {
                                gasPumpMachine.setMessage(gasPumpMachine.getMessage() + buttonValue);
                                gasPumpMachine.setState("pump_gas");
                                if (buttonValue.equals("#87")) gasPumpMachine.set_gas_type(2.77);
                                if (buttonValue.equals("#89")) gasPumpMachine.set_gas_type(2.97);
                                if (buttonValue.equals("#93")) gasPumpMachine.set_gas_type(3.2);
               }
        }
        else next.handle(gasPumpMachine,state,buttonValue);
    }
}
