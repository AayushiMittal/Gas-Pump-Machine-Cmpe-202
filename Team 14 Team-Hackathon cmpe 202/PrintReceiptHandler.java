import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PrintReceiptHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrintReceiptHandler extends Handler
{
     public void handle(GasPumpMachine gasPumpMachine,String state,String buttonValue){
           if(state=="print_receipt"){
                if(buttonValue.equals("yes")) {
                    gasPumpMachine.setState("select_gas");
                    gasPumpMachine.setMessage("");
                    gasPumpMachine.setReceipt(true);
                }
                else if(buttonValue.equals("no")) {
                    gasPumpMachine.setState("select_gas");
                    gasPumpMachine.setReceipt(false);
                    gasPumpMachine.setMessage("");
                }
                else gasPumpMachine.setState("print_receipt"); 
           }
            else next.handle(gasPumpMachine,state,buttonValue);
     }
     
    
     
}
