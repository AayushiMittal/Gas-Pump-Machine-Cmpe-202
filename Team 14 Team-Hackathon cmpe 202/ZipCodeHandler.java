import greenfoot.*;
/**
 * Write a description of class ZipCodeHandler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZipCodeHandler extends Handler 
{

    public void handle(GasPumpMachine gasPumpMachine,String state,String buttonValue){
    if(state=="zipcode"){
    if(buttonValue.equals("enter") && (gasPumpMachine.getMessage().length() == 5)){
         gasPumpMachine.setState("car_wash");
//         gasPumpMachine.setMessage("");    
    }
    else if(buttonValue.equals("cancel")){
        gasPumpMachine.setState("zipcode");
        gasPumpMachine.setMessage("");//gasPumpMachine.getMessage();
    }
    else if(buttonValue.matches("[-+]?\\d*\\.?\\d+")){
      if(Integer.parseInt(buttonValue) >= 0 && Integer.parseInt(buttonValue) <= 9)
      {
       if (gasPumpMachine.getMessage().length() != 5) gasPumpMachine.setMessage(gasPumpMachine.getMessage() + buttonValue);
                        // System.out.println(message);
      }
    }
    else if(buttonValue.equals("restart")) 
    {
        gasPumpMachine.setState("start");        
    }
}
else next.handle(gasPumpMachine,state,buttonValue);
}
}


