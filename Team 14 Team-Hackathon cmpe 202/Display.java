import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import java.util.concurrent.TimeUnit;
/**
 * Write a description of class Display here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Display extends Actor
{
    private static String text = "Welcome to Chevron \nPlease insert your credit card\n or insert your membership\n card to earn points";
    private static int size = 40;
    private static double price = 0;
    private static double bill = 0;
    private static long starttime = 0;
    private static long endtime = 0;
    private static double elapsed = 0;
    private static Color color = Color.BLACK;
    private static Color background = new Color(0, 0, 0, 0); 
    /**Display constructor**/
    public Display(){
        GreenfootImage image = new GreenfootImage(300, 300);
        image.drawRect(0,0, 299, 299);
        GreenfootImage textImage = new GreenfootImage(text, 20, color, background);
        image.drawImage(textImage, 20, 100);
        setImage(image);
        
    }
    
    /**refresh and redraw the display box and text message **/
    public void refresh() {
        GreenfootImage image = getImage();
        image.clear();
        image.drawRect(0,0, 299, 299);
        GreenfootImage textImage = new GreenfootImage(text, size, color, background);
        
        World world = getWorld();
        for(GasPumpMachine gm: world.getObjects(GasPumpMachine.class))
        {
            String state = gm.getState();
            String message = gm.getMessage();
            switch(state){
                case "start":
                textImage = new GreenfootImage(text, 20, color, background);
                    image.drawImage(textImage, 20, 100);
                    break;

                case "welcome":
                    textImage = new GreenfootImage(text, 20, color, background);
                    image.drawImage(textImage, 20, 100);
                    textImage = new GreenfootImage("Help", 20, color, background);
                    image.drawImage(textImage, 240, 60);
                    textImage = new GreenfootImage("Restart", 20, color, background);
                    image.drawImage(textImage, 240, 110);

                    break;
                case "membership":
                    textImage = new GreenfootImage("Dear Customer!\n Please insert your credit card", 20, color, background);
                    image.drawImage(textImage, 50, 120);
                    textImage = new GreenfootImage("Help", 20, color, background);
                    image.drawImage(textImage, 240, 60);
                    textImage = new GreenfootImage("Restart", 20, color, background);
                    image.drawImage(textImage, 240, 110);
                    break;
                case "zipcode":
                    textImage = new GreenfootImage("Enter zipcode\n" + message, size, color, background);
                    image.drawImage(textImage, 40, 150);
                    textImage = new GreenfootImage("Help", 20, color, background);
                    image.drawImage(textImage, 240, 60);
                    textImage = new GreenfootImage("Restart", 20, color, background);
                    image.drawImage(textImage, 240, 110);
                    break;
                case "select_gas":
                    textImage = new GreenfootImage("Select fuel grade" + message, size, color, background);
                    image.drawImage(textImage, 20, 120); 
                    textImage = new GreenfootImage("Help", 20, color, background);
                    image.drawImage(textImage, 240, 60);
                    break;
                case "pump_gas":
                    starttime = System.currentTimeMillis();
                    price = gm.getType();
                    textImage = new GreenfootImage("Pull the nozzle \n to pump gas\n" + message, size, color, background);
                    image.drawImage(textImage, 30, 100);
                    break;
                case "fueling_start":
                    endtime = System.currentTimeMillis();
                    elapsed = (endtime - starttime)/10000.0;// second counter  
                    double n = (elapsed*100*price); //count price
                    bill = n/100;
                    textImage = new GreenfootImage("   Price \n$ " + String.format("%.2f", bill) + "\n  --------\n   " + "Gallons\n"+ String.format("%.2f", elapsed) , size, color, background);
                    image.drawImage(textImage, 30, 60); 
                    break;
                case "car_wash": 
                    
                    textImage = new GreenfootImage("Do you need a \n car wash?", size, color, background);
                    image.drawImage(textImage, 10, 100);
                    textImage = new GreenfootImage("Yes", 20, color, background);
                    image.drawImage(textImage, 260, 165);
                    textImage = new GreenfootImage("No", 20, color, background);
                    image.drawImage(textImage, 260, 210);
                    break;
                case "print_receipt":
                    textImage = new GreenfootImage("Do you want to \n print a receipt?", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    textImage = new GreenfootImage("Yes", 20, color, background);
                    image.drawImage(textImage, 260, 165);
                    textImage = new GreenfootImage("No", 20, color, background);
                    image.drawImage(textImage, 260, 210);
                    break;
                case "thankyou_1":
                    textImage = new GreenfootImage("Thank you!", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    Receipt receipt = new Receipt(bill, price, message, new NoCarWash());                   
                    receipt.hasCarWash();
                    receipt.displayReceipt();
                    break;
                case "thankyou_2":
                    textImage = new GreenfootImage("Thank you!", size, color, background);
                    image.drawImage(textImage, 40, 100);
                    break;
                case "thankyou_3":
                    
                    Receipt receipt2 = new Receipt(bill, price, message, new CarWash());                    
                    receipt2.hasCarWash();
                    receipt2.displayReceipt();
                    break;
                default:
                    break;
            }
        }
    }
  
    /**
     * Act - do whatever the Display wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        refresh();
    }    
}
