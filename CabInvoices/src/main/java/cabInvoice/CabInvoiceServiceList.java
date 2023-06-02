package cabInvoice;

public class CabInvoiceServiceList {
    public  double costPerKm = 10.0;
    public  double costPerMinute = 1.0;
    public  double min_fare = 5;

    /*
     *To calculate fare for a ride.
     */
    public  double calculateFare(double distance, double time) {
        double totalFare =  distance * costPerKm + time * costPerMinute;
        return Math.max( min_fare, totalFare);
    }
    /*
     *To calculate fare for multiple rides.
     */
    private  double calculateTotalFare(Rider[] rides) {
        double aggregateTotalFare = 0.0;
        for (Rider ride:rides) {
            double totalFare = calculateFare(ride.distance, ride.time);
            aggregateTotalFare += totalFare;
        }
        return aggregateTotalFare;
    }
    /*
    To generate invoice.
     */
    public  CabInvoicerSummary generateInvoice(Rider[] rides) {
        double aggregateFare = 0.0;
        for (Rider ride : rides) {
            aggregateFare += calculateTotalFare(rides);
        }
        int totalRides = rides.length;
        double averageFare = aggregateFare / totalRides;
        return new CabInvoicerSummary(totalRides, aggregateFare, averageFare);
    }
}
