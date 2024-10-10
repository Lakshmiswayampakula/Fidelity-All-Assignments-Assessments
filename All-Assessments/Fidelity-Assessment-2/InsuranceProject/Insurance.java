package InsuranceProject;

public class Insurance {
    private String insuranceName;
    private String insuranceNo;
    public double amountCovered;

    public Insurance(String insuranceName, String insuranceNo, double amountCovered) {
        this.insuranceName = insuranceName;
        this.insuranceNo = insuranceNo;
        this.amountCovered = amountCovered;
    }

    public String getInsuranceNo() {
        return this.insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }

    public String getInsuranceName() {
        return this.insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public double getAmountCovered() {
        return this.amountCovered;
    }

    public double CalculatePremium() {
        return 0.0;
    }
}
