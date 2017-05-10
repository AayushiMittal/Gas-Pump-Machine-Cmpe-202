import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StateClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class StateClass extends Actor
{
        protected static String state = "start";
        public abstract void setState(String s);
    
        public abstract String getState();     
}
