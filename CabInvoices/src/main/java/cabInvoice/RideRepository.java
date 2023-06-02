package cabInvoice;
import java.util.HashMap;
public class RideRepository {

    HashMap<Integer, Rider[]> rideHashMap = new HashMap<>();

    public void addRides(Integer userId, Rider[] ride1) {
        if(rideHashMap.containsKey(userId)){
            System.out.println("Already Exist !!!");
        } else {
            rideHashMap.put(userId,ride1);
        }
    }

    public CabInvoicerSummary getInvoiceFromUserId(Integer userId) {
        Rider[] rides = rideHashMap.get(userId);
        CabInvoiceServiceList cabInvoice = new CabInvoiceServiceList();
        return cabInvoice.generateInvoice(rides);
    }
}
