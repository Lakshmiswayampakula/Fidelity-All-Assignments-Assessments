package InsuranceProject;

class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benefitPercent;

    public LifeInsurance(String insuranceNo, String insuranceName, double amountCovered, int policyTerm, float benefitPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }

    public int getPolicyTerm() {
        return this.policyTerm;
    }

    public float getBenefitPercent() {
        return this.benefitPercent;
    }

    public double CalculatePremium() {
        return (this.getAmountCovered() - this.getAmountCovered() * (double)this.benefitPercent / 100.0) / (double)this.policyTerm;
    }
}
