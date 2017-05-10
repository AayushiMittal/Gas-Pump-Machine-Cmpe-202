public class NoCarWash extends ReceiptStrategy {
    
    public boolean hasCarwash(Receipt receipt) {
        boolean hasCarWash = true;
        
        if(!receipt.getCarWash())
            hasCarWash = false;
        
        return hasCarWash;
    }
}
