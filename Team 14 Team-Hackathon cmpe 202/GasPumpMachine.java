import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GasPumpMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GasPumpMachine extends StateClass
{
    //private static String state = "start"; //state detemines display content
    private static String message = "";
    private static double gas_type = 0; //set the gas unit price 
    private static long starttime =0;
    private Handler startHandler;
    String buttonVal = "";
    private static GasPumpMachine gpm; 
    boolean printReceipt=false;
    boolean wantWash=false;
    public GasPumpMachine(){
        GreenfootImage image = getImage() ;
        image.scale( 1, 1 ) ;
        message = "";
        state = "start";
        startHandler = new StartHandler();
        Handler zipCodeHandler=new ZipCodeHandler();
        Handler membershipHandler=new MembershipHandler();
        Handler selectGasHandler=new SelectGasHandler();  
        Handler pumpGasHandler=new PumpGasHandler();  
        Handler fuellingStartHandler=new FuellingStartHandler();   
        Handler carWashHandler=new CarWashHandler();   
        Handler printReceiptHandler=new PrintReceiptHandler();
        Handler thankYouHandler=new ThankYouHandler();
        startHandler.setNext(zipCodeHandler);
        zipCodeHandler.setNext(membershipHandler);
        membershipHandler.setNext(selectGasHandler);
        selectGasHandler.setNext(pumpGasHandler);
        pumpGasHandler.setNext(fuellingStartHandler);
        fuellingStartHandler.setNext(carWashHandler);
        carWashHandler.setNext(printReceiptHandler);
        
        
    }
    /*illustration to receive value button*/
    public void receiveButton(String s){
        this.buttonVal = s;
        System.out.println("Button value received: " + buttonVal);
    }
    
    public void setState(String s){
        state = s;
    }
    
    public String getState(){
        return state;
    }
    
    public void setMessage(String s){
        message = s;
    }
   
    public double getType(){
        return gas_type;
    }

    public String getMessage(){
        return message;
    }
    
    public void set_gas_type(double gt){
        gas_type=gt;
    }

    public double get_gas_type(){
        return gas_type;
    }

     public boolean hasReceipt(){
     return printReceipt;    
     }
     public boolean hasWash(){
     return wantWash;    
     }
     public void setWash(boolean wash){
        wantWash=wash;
     }
     public void setReceipt(boolean receipt){
        printReceipt=receipt;
     }
     
     public static GasPumpMachine getInstance(){
        if(gpm == null) {
            gpm = new GasPumpMachine();
        }
        return gpm;
     }
    public void refresh(){
        startHandler.handle(this,state,buttonVal);
        if(state=="start" || state=="membership"){
           if(buttonVal.matches("[-+]?\\d*\\.?\\d+")){
                  if(Integer.parseInt(buttonVal) >= 0 && Integer.parseInt(buttonVal) <= 9)
                  {
                       System.out.println("jhkkknkjnnjn ");
                   Greenfoot.playSound("sounds/beep.mp3");
                     
                  }
           }
        }
       
    }

    /**
     * Act - do whatever the GasPumpMachine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      //  refresh();
    }    
}
