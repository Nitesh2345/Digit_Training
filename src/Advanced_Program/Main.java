package Advanced_Program;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            PolicyManager policyManager = new PolicyManager();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Choose an option:");
                System.out.println("1. Add Policy");
                System.out.println("2. Remove Policy");
                System.out.println("3. Update Policy");
                System.out.println("4. List Policies by Type");
                System.out.println("5. List All Policies");
                System.out.println("6. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.println("Enter Policy Number:");
                        String policyNumber = scanner.nextLine();
                        System.out.println("Enter Policyholder's Name:");
                        String policyholderName = scanner.nextLine();
                        System.out.println("Enter Insurance Type (e.g., Health, Life, Auto):");
                        String insuranceType = scanner.nextLine();
                        System.out.println("Enter Coverage Amount:");
                        double coverageAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline

                        Policy newPolicy = new Policy(policyNumber, policyholderName, insuranceType, coverageAmount);
                        policyManager.addPolicy(newPolicy);
                        System.out.println("Policy added successfully.");
                        break;

                    case 2:
                        System.out.println("Enter Policy Number to Remove:");
                        String removePolicyNumber = scanner.nextLine();
                        policyManager.removePolicyByNumber(removePolicyNumber);
                        System.out.println("Policy removed successfully.");
                        break;

                    case 3:
                        System.out.println("Enter Policy Number to Update:");
                        String updatePolicyNumber = scanner.nextLine();
                        System.out.println("Enter New Policyholder's Name (or press Enter to skip):");
                        String newPolicyholderName = scanner.nextLine();
                        System.out.println("Enter New Insurance Type (or press Enter to skip):");
                        String newInsuranceType = scanner.nextLine();
                        System.out.println("Enter New Coverage Amount:");
                        double newCoverageAmount = scanner.nextDouble();
                        scanner.nextLine(); // consume newline

                        policyManager.updatePolicy(updatePolicyNumber, newPolicyholderName.isEmpty() ? null : newPolicyholderName,
                                newInsuranceType.isEmpty() ? null : newInsuranceType, newCoverageAmount);
                        System.out.println("Policy updated successfully.");
                        break;

                    case 4:
                        System.out.println("Enter Insurance Type to List Policies:");
                        String listInsuranceType = scanner.nextLine();
                        ArrayList<Policy> policiesByType = policyManager.listPoliciesByType(listInsuranceType);
                        for (Policy policy : policiesByType) {
                            System.out.println("Policy Number: " + policy.getPolicyNumber() + ", Policyholder: " + policy.getPolicyholderName() + ", Type: " + policy.getInsuranceType() + ", Coverage: " + policy.getCoverageAmount());
                        }
                        break;

                    case 5:
                        ArrayList<Policy> allPolicies = policyManager.getAllPolicies();
                        for (Policy policy : allPolicies) {
                            System.out.println("Policy Number: " + policy.getPolicyNumber() + ", Policyholder: " + policy.getPolicyholderName() + ", Type: " + policy.getInsuranceType() + ", Coverage: " + policy.getCoverageAmount());
                        }
                        break;

                    case 6:
                        exit = true;
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }

            scanner.close();
        }
    }

