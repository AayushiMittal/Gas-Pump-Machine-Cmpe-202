import java.util.Random;

public class CarWash extends ReceiptStrategy {
    
    public boolean hasCarwash(Receipt receipt) {
        boolean hasCarWash = true;
        Random rand = new Random();
        int carWashCode = rand.nextInt(50000);
        StringBuilder st = receipt.getStringBuilder();
        
        if(receipt.getCarWash()) {
            st.append("CAR WASH CODE: " + Integer.toString(carWashCode));
            hasCarWash = true;
        }

        
        return hasCarWash;
    }
}
