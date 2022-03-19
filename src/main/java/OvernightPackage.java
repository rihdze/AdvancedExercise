import org.apache.commons.math3.util.Precision;

public class OvernightPackage extends Package{

    private double feePerOunce;

    public OvernightPackage(String senderName, String senderAddress, String senderCity,
                            String senderState, String senderZipCode, String recipientName,
                            String recipientAddress, String recipientCity, String recipientState,
                            String recipientZipCode, double weightInOunces, double costPerOunce, double feePerOunce) {
        super(senderName, senderAddress, senderCity,
                senderState, senderZipCode, recipientName,
                recipientAddress, recipientCity, recipientState,
                recipientZipCode, weightInOunces, costPerOunce);

        this.feePerOunce = feePerOunce;
    }


    public double calculateCost(){

          return Precision.round(((this.getWeightInOunces() * this.feePerOunce) * this.getCostPerOunce()), 2);
    }

    public double getFeePerOunce() {
        return feePerOunce;
    }

    public void setFeePerOunce(double feePerOunce) {
            if(feePerOunce < 0){
                throw new IllegalArgumentException("Fee per ounce must not be below 0");
            } else {
                this.feePerOunce = feePerOunce;
            }

        }

    @Override
    public String toString() {


        return "Overnight package delivery service: \n" +
                "Senders name: " + this.getSenderName() +
                "\nSenders address information: " + this.getSenderState() + ", " +
                this.getSenderCity() + ", " + this.getSenderAddress() + ", " + this.getSenderZipCode() +
                "\nRecipients name: " + this.getRecipientName() +
                "\nRecipients address information: " + this.getRecipientState() + ", " +
                this.getRecipientCity() + ", " + this.getRecipientAddress() + ", " + this.getRecipientZipCode() +
                "\nCost of the package: " + this.calculateCost() + "\n";

    }


}
