package InsuranceProject;

class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    public MotorInsurance(String insuranceName, String insuranceNo, double amountCovered, float depPercent) {
        super(insuranceName, insuranceNo, amountCovered);
        this.depPercent = depPercent;
        this.idv = amountCovered - amountCovered * (double)depPercent / 100.0;
    }

    public double getIdv() {
        return this.idv;
    }

    public float getDepPercent() {
        return this.depPercent;
    }

    public double calculatePremium() {
        return this.idv * 0.03;
    }
}
