import java.util.ArrayList;
import java.util.Scanner;

class InsurancePolicy {
    private String policyType;
    private double basePremium;
    private double riskFactor;
    private double calculatedPremium;

    public InsurancePolicy(String policyType, double basePremium, double riskFactor) {
        this.policyType = policyType;
        this.basePremium = basePremium;
        this.riskFactor = riskFactor;
        this.calculatedPremium = calculatePremium();
    }

    public String getPolicyType() {
        return policyType;
    }

    public double getBasePremium() {
        return basePremium;
    }

    public double getRiskFactor() {
        return riskFactor;
    }

    public double getCalculatedPremium() {
        return calculatedPremium;
    }

    public void setRiskFactor(double riskFactor) {
        this.riskFactor = riskFactor;
        this.calculatedPremium = calculatePremium();
    }

    private double calculatePremium() {
        return basePremium * (1 + riskFactor);
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyType='" + policyType + '\'' +
                ", basePremium=" + basePremium +
                ", riskFactor=" + riskFactor +
                ", calculatedPremium=" + calculatedPremium +
                '}';
    }
}

class PremiumCalculationSystem {
    private ArrayList<InsurancePolicy> policies;

    public PremiumCalculationSystem() {
        this.policies = new ArrayList<>();
    }

    public void addPolicy(String policyType, double basePremium, double riskFactor) {
        InsurancePolicy policy = new InsurancePolicy(policyType, basePremium, riskFactor);
        policies.add(policy);
        System.out.println("Policy added successfully.");
    }

    public void updateRiskFactor(String policyType, double newRiskFactor) {
        for (InsurancePolicy policy : policies) {
            if (policy.getPolicyType().equalsIgnoreCase(policyType)) {
                policy.setRiskFactor(newRiskFactor);
                System.out.println("Risk factor updated successfully.");
                return;
            }
        }
        System.out.println("Policy not found.");
    }

    public void generateReport() {
        if (policies.isEmpty()) {
            System.out.println("No policies to display.");
            return;
        }
        for (InsurancePolicy policy : policies) {
            System.out.println(policy);
        }
    }
}

public class Premiumcal {
    public static void main(String[] args) {
        PremiumCalculationSystem premiumSystem = new PremiumCalculationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Policy");
            System.out.println("2. Update Risk Factor");
            System.out.println("3. Generate Report");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Policy Type: ");
                    String policyType = scanner.next();
                    System.out.print("Enter Base Premium: ");
                    double basePremium = scanner.nextDouble();
                    System.out.print("Enter Risk Factor (as a decimal, e.g., 0.1 for 10%): ");
                    double riskFactor = scanner.nextDouble();
                    premiumSystem.addPolicy(policyType, basePremium, riskFactor);
                    break;
                case 2:
                    System.out.print("Enter Policy Type to Update: ");
                    String updatePolicyType = scanner.next();
                    System.out.print("Enter New Risk Factor (as a decimal, e.g., 0.1 for 10%): ");
                    double newRiskFactor = scanner.nextDouble();
                    premiumSystem.updateRiskFactor(updatePolicyType, newRiskFactor);
                    break;
                case 3:
                    premiumSystem.generateReport();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
