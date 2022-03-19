import org.apache.commons.math3.util.Precision;

public class Package {
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZipCode;
    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZipCode;
    private double weightInOunces;
    private double costPerOunce;

    public Package(String senderName, String senderAddress, String senderCity,
                   String senderState, String senderZipCode, String recipientName,
                   String recipientAddress, String recipientCity, String recipientState,
                   String recipientZipCode, double weightInOunces, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZipCode = senderZipCode;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZipCode = recipientZipCode;
        //If weight is smaller/equals than/to 0 throws Exception.
        if(weightInOunces <= 0){
            throw new IllegalArgumentException("Weight must be higher than 0");
        } else {
            this.weightInOunces = weightInOunces;
        }
        //If cost per ounce is smaller/equals than/to 0 throws Exception.
        if(costPerOunce <= 0){
            throw new IllegalArgumentException("Cost per ounce must be higher than 0");
        } else {
            this.costPerOunce = costPerOunce;
        }
    }

    public double calculateCost(){

        return this.weightInOunces + this.costPerOunce;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderCity() {
        return senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderState() {
        return senderState;
    }

    public void setSenderState(String senderState) {
        this.senderState = senderState;
    }

    public String getSenderZipCode() {
        return senderZipCode;
    }

    public void setSenderZipCode(String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getRecipientCity() {
        return recipientCity;
    }

    public void setRecipientCity(String recipientCity) {
        this.recipientCity = recipientCity;
    }

    public String getRecipientState() {
        return recipientState;
    }

    public void setRecipientState(String recipientState) {
        this.recipientState = recipientState;
    }

    public String getRecipientZipCode() {
        return recipientZipCode;
    }

    public void setRecipientZipCode(String recipientZipCode) {
        this.recipientZipCode = recipientZipCode;
    }

    public double getWeightInOunces() {
        return weightInOunces;
    }

    public void setWeightInOunces(double weightInOunces) {
        this.weightInOunces = weightInOunces;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    public void setCostPerOunce(double costPerOunce) {
        this.costPerOunce = costPerOunce;
    }
}
