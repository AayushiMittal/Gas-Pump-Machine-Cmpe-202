import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeypadButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeypadButton extends Button
{
    public KeypadButton(String text,String imageName){
    GreenfootImage image = new GreenfootImage("images//"+imageName+".png");
    image.scale(30, 30);
    setImage(image);
    setButtonVal(text);
    }

    public void act(){

        if(Greenfoot.mousePressed(this)){
            World wrld = getWorld();
            String str = getButtonVal();

            for(GasPumpMachine gasPumpMachine: wrld.getObjects(GasPumpMachine.class)){             
               gasPumpMachine.receiveButton(str);
               gasPumpMachine.refresh();
            }
        }    
  }

    
}
