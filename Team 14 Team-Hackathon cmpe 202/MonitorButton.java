import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonitorButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonitorButton extends Button
{
     public MonitorButton(String txt,String imageName){
        GreenfootImage img = new GreenfootImage("images//"+imageName+".png");
        img.scale(50, 30);
        setImage(img);
        setButtonVal(txt);
    }

    public void act(){
        if(Greenfoot.mousePressed(this)){
            World world = getWorld();
            String str = getButtonVal();

            for(GasPumpMachine gasPumpMachine: world.getObjects(GasPumpMachine.class)){
               gasPumpMachine.receiveButton(str);
               gasPumpMachine.refresh();
            }
        }
    }
}

