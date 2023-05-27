package cabInvoicerTest;

import org.junit.Test;
import cabInvoice.CabInvoicer ;
import org.junit.jupiter.api.Assertions;
public class CabInvoicerTestCase {

        CabInvoicer invoicer = new CabInvoicer();

        @Test
        public void givenDistance_ShouldReturnFare() {
            double distance = 2.0;
            int time = 5;
            double result = invoicer.calculateFare(distance, time);
            Assertions.assertEquals(25, result);
        }
}
