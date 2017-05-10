import greenfoot.*;
/**
 * Write a description of class KeyPadHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MembershipHandler extends Handler {
    // instance variables - replace the example below with your own
//    GasPumpMachine gpm= new GasPumpMachine();
    public void handle(GasPumpMachine gasPumpMachine, String state,String buttonValue) {
        if(state=="membership"){
          if(buttonValue.equals("credit_card")) gasPumpMachine.setState("zipcode");
          else if(buttonValue.equals("restart")){ 
              gasPumpMachine.setState("start");             
            }
        }
        else
            next.handle(gasPumpMachine,state,buttonValue);
    }
}
