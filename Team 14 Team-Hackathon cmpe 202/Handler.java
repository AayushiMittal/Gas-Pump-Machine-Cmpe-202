import greenfoot.*;
/**
 * Write a description of class Handler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Handler extends Actor 
{
    Handler next;
    // instance variables - replace the example below with your own
    public abstract void handle(GasPumpMachine gasPumpMachine, String state,String buttonValue);    
    public void setNext(Handler handler) {
        next = handler;
    }
    
}

