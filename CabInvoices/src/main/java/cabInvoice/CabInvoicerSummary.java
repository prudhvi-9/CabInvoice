package cabInvoice;

public class CabInvoicerSummary {
    private int totalRides;
    private double aggregateFare;
    private double averageFare;

    /*
     *Constructor
     */
     public CabInvoicerSummary(int totalRides, double aggregateFare, double averageFare) {
        this.totalRides = totalRides;
        this.aggregateFare = aggregateFare;
        this.averageFare = this.aggregateFare / this.totalRides;
    }

    /*
     *To compare the objects.
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || (getClass() != object.getClass())) {
            return false;
        }
        CabInvoicerSummary invoice = (CabInvoicerSummary) object;
        return averageFare == invoice.averageFare && totalRides == invoice.totalRides && aggregateFare == invoice.aggregateFare;
    }
}
