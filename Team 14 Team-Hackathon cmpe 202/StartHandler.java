/**
 * Write a description of class StartHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartHandler extends Handler 
{
    // instance variables - replace the example below with your own

    public void handle(GasPumpMachine gasPumpMachine, String state,String buttonValue){
       
    if(state=="start"){
        if(buttonValue.equals("credit_card")){
                    gasPumpMachine.setState("zipcode");
                    gasPumpMachine.setMessage("");
                }
                else if(buttonValue.equals("member_card")){
                    gasPumpMachine.setState("membership");
                    gasPumpMachine.setMessage("");
                }
    }
    else {
        next.handle(gasPumpMachine,state,buttonValue);
    }
    }
   
}
