import org.apache.commons.math3.util.Precision;

public class TwoDayPackage extends Package{
    private double flatDeliveryFee;

    public TwoDayPackage(String senderName, String senderAddress, String senderCity,
                         String senderState, String senderZipCode, String recipientName,
                         String recipientAddress, String recipientCity, String recipientState,
                         String recipientZipCode, double weightInOunces, double costPerOunce, double flatDeliveryFee) {
        super(senderName, senderAddress, senderCity,
                senderState, senderZipCode, recipientName,
                recipientAddress, recipientCity, recipientState,
                recipientZipCode, weightInOunces, costPerOunce);
        this.flatDeliveryFee = flatDeliveryFee;
    }


    public double calculateCost(){
        double test = 5;
        return super.getWeightInOunces()*super.getCostPerOunce() + this.flatDeliveryFee;
    }

    public double getDeliveryFlatFee() {

        return flatDeliveryFee;
    }

    public void setDeliveryFlatFee(double flatDeliveryFee) {

        if(flatDeliveryFee < 0){
            throw new IllegalArgumentException("Delivery fee must not be below 0");
        } else {
            this.flatDeliveryFee = flatDeliveryFee;
        }

    }

    @Override
    public String toString() {


        return "Two day package delivery service: \n" +
                "Senders name: " + this.getSenderName() +
                "\nSenders address information: " + this.getSenderState() + ", " +
                this.getSenderCity() + ", " + this.getSenderAddress() + ", " + this.getSenderZipCode() +
                "\nRecipients name: " + this.getRecipientName() +
                "\nRecipients address information: " + this.getRecipientState() + ", " +
                this.getRecipientCity() + ", " + this.getRecipientAddress() + ", " + this.getRecipientZipCode() +
                "\nCost of the package: " + this.calculateCost() + "\n";

    }
}
