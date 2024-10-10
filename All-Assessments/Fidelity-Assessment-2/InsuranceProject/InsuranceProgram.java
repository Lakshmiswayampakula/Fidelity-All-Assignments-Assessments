package InsuranceProject;

import java.util.Scanner;

public class InsuranceProgram {
    public InsuranceProgram() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insurance Number: ");
        String insuranceNo = sc.nextLine();
        System.out.println("Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.println("Amount Covered: ");
        double amountCovered = sc.nextDouble();
        System.out.println("Select\n1. Life Insurance\n2. Motor Insurance ");
        int option = sc.nextInt();
        Insurance insurance = null;
        if (option == 1) {
            System.out.println("Policy Term: ");
            int policyTerm = sc.nextInt();
            System.out.println("Benifit Percent: ");
            float benfitPercent = sc.nextFloat();
            LifeInsurance lifeinsurance = new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benfitPercent);
            double premium = lifeinsurance.CalculatePremium();
            System.out.println("Calculated Premium:" + premium);
        } else if (option == 2) {
            System.out.println("Depreciation Percent: ");
            float depreciationPercent = sc.nextFloat();
            MotorInsurance motorInsurance = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depreciationPercent);
            double premium = motorInsurance.calculatePremium();
            System.out.println("Calculated Premium:" + premium);
        } else {
            System.out.println("Invalid option selected");
        }

        sc.close();
    }
}
