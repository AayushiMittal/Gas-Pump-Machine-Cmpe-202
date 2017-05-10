import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CarWashHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarWashHandler extends Handler
{
   
    public void handle(GasPumpMachine gasPumpMachine,String state,String buttonValue){
     if(state=="car_wash"){
               if(buttonValue.equals("yes")){
                   gasPumpMachine.setWash(true);
                   gasPumpMachine.setReceipt(true);
                   gasPumpMachine.setState("select_gas");
                   gasPumpMachine.setMessage("");
                }
                else if(buttonValue.equals("no")) {
                    gasPumpMachine.setState("print_receipt");
                    gasPumpMachine.setWash(false);
                    gasPumpMachine.setMessage("");
                }
     }
      else  next.handle(gasPumpMachine,state,buttonValue);
}
}