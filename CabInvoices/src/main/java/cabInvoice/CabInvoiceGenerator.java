package cabInvoice;

public class CabInvoiceGenerator {
    public static  double costPerKm = 10.0;
    public static  double costPerMinute = 1.0;
    public static  double min_fare = 5;
    /*
     *To calculate fare for a ride.
     */
    public double calculateFare(double distance, int time) {
        double totalFare =  distance * costPerKm + time * costPerMinute;
        return Math.max( min_fare, totalFare);
    }
    /*
     *To calculate fare for multiple rides.
     */
    public CabInvoiceSummary calculateFare(Ride[] rides) {
        double totalFares = 0;
        for(Ride ride: rides)
            totalFares += this.calculateFare(ride.distance, ride.time);
        return new CabInvoiceSummary(rides.length, totalFares);
    }
}
