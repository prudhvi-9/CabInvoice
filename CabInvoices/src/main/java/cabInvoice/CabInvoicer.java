package cabInvoice;

public class CabInvoicer {
        public static final double costperkm = 10.0;
        public static final double costpermin = 1.0;
        public static final double min_fare = 5;

        public double calculateFare(double distance, int time) {
            double totalefare = (distance * costperkm) + (time * costpermin);
            if (totalefare < 5) {
                return min_fare;
            }
            return totalefare;
        }

}
