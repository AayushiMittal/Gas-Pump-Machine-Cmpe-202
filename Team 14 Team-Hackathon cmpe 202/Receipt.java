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
public class Receipt {
    private double bill;
    private double price;
    private String message;
    private ReceiptStrategy receiptStrategy;
    private boolean hasCarWash;
    private StringBuilder st;
    
    //public Receipt(double bill, double price, String message) {
    public Receipt(double bill, double price, String message, ReceiptStrategy receiptStrategy) {
        this.bill = bill;
        this.price = price;
        this.message = message;
        this.receiptStrategy = receiptStrategy;
    }
    
    /*public boolean hasCarWash() {
        return printReceipt.hasCarWash(this);
    }*/
    
    public void displayReceipt() {
        st = new StringBuilder();
        Calendar calendar = Calendar.getInstance();
        int date2 = calendar.get(Calendar.DATE);
        int month2 = calendar.get(Calendar.MONTH);
        int year2 = calendar.get(Calendar.YEAR);
        String gallon2 = String.format("%.2f", bill/price);
        //st.append("GAS STATION\nBRAND \nSALE RECEIPT \n\nADDRESS 1 \nADDRESS 2");
        //st.append("\n\n\nDATE:" + month2 +"/"+ date2 +"/"+year2 +"\n\nINVOICE# 10101010"+ "\n      CREDIT CARD\n");
        
               

        if(hasCarWash()) {
                    String content2 = "Chevron \nSALE RECEIPT \n_______________________\n\nADDRESS 1: San Jose 95112";
                    content2 +="\n\nDATE:" + month2 +"/"+ date2 +"/"+year2 +"\n\nINVOICE# 10101010"+ "\n AUTH# \n          MASTER CARD\n      ACCOUNT NUMBER\n";
                   // String gallon = String.format("%.2f", bill/price);
                    content2 +="**************19\n"+"PUMP    GALLONS   CAR_WASH   DISCOUNTED TOTAL\n" + message+ "      "+ gallon2 + "           "+ "  $5.00" +"           $" + String.format("%.2f", bill+5);
                    content2 += "\n      Thank You! \nFor Visiting Chevron!!\n ";
                     st.append(content2);
            
                //st.append("*******************************\n" + "PUMP    GALLONS   CAR_WASH   TOTAL\n" + message + "      " + gallon2 + "           "+ "  $5.00" + "           $" + String.format("%.2f", bill+5));
        } else {

            String content2 = "Chevron \nSALE RECEIPT \n_______________________\n\nADDRESS 1: San Jose 95112";
                    content2 +="\n\nDATE:" + month2 +"/"+ date2 +"/"+year2 +"\n\nINVOICE# 10101010"+ "\n AUTH# \n          MASTER CARD\n      ACCOUNT NUMBER\n";
                   // String gallon = String.format("%.2f", bill/price);
                    content2 +="**************19\n"+"PUMP     GALLONS    TOTAL\n" + message+ "      "+ gallon2 + "             $" + String.format("%.2f", bill+5);
                    content2 += "\n\n        Thank You! \nFor Visiting Chevron!!\n ";
                     st.append(content2);
            
            
            
            
           // st.append("**************************\n"+"PUMP    GALLONS    TOTAL\n" + message+ "        "+ gallon2 + "           $" + String.format("%.2f", bill));
        }
        
        JOptionPane.showMessageDialog(new JInternalFrame(), st.toString(), "Gas Receipt", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);        
    }
    
    public void setCarWash(boolean carWash) {
        this.hasCarWash = carWash;
    }
    
    public boolean getCarWash() {
        return hasCarWash;
    }
    
    public StringBuilder getStringBuilder() {
        return st;
    }
    
    //public 
    public boolean hasCarWash() {
        return receiptStrategy.hasCarwash(this);
    }

}
