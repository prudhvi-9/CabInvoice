package cabInvoicerTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import cabInvoice.CabInvoiceGenerator;
import cabInvoice.CabInvoiceSummary;
import cabInvoice.Ride;

public class CabInvoiceForMultipleRideTest {
    /*
    Creating a new object of Cab Invoice generator.
     */
    CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenMultipleRides_ReturnInvoiceSummary(){
        Ride rides[] = { new Ride(1.1, 1), new Ride(5.0, 6), new Ride(8.9, 1)  };
        CabInvoiceSummary fare = invoiceGenerator.calculateFare(rides);
        CabInvoiceSummary expectedInvoiceSummery = new CabInvoiceSummary(4, 131);
        Assertions.assertEquals(expectedInvoiceSummery, fare);
    }
}
