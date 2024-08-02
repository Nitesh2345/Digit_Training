package Advanced_Program;
import java.util.ArrayList;
import java.util.Scanner;

class Claim {
    private int claimNumber;
    private int policyNumber;
    private String claimantName;
    private double claimAmount;
    private String status;

    public Claim(int claimNumber, int policyNumber, String claimantName, double claimAmount, String status) {
        this.claimNumber = claimNumber;
        this.policyNumber = policyNumber;
        this.claimantName = claimantName;
        this.claimAmount = claimAmount;
        this.status = status;
    }

    public int getClaimNumber() {
        return claimNumber;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public String getClaimantName() {
        return claimantName;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Claim{" +
                "claimNumber=" + claimNumber +
                ", policyNumber=" + policyNumber +
                ", claimantName='" + claimantName + '\'' +
                ", claimAmount=" + claimAmount +
                ", status='" + status + '\'' +
                '}';
    }
}

class ClaimTrackingSystem {
    private ArrayList<Claim> claims;

    public ClaimTrackingSystem() {
        this.claims = new ArrayList<>();
    }

    public void addClaim(int claimNumber, int policyNumber, String claimantName, double claimAmount, String status) {
        Claim claim = new Claim(claimNumber, policyNumber, claimantName, claimAmount, status);
        claims.add(claim);
        System.out.println("Claim added successfully.");
    }

    public void updateClaimStatus(int claimNumber, String newStatus) {
        for (Claim claim : claims) {
            if (claim.getClaimNumber() == claimNumber) {
                claim.setStatus(newStatus);
                System.out.println("Claim status updated successfully.");
                return;
            }
        }
        System.out.println("Claim not found.");
    }

    public void generateReport() {
        if (claims.isEmpty()) {
            System.out.println("No claims to display.");
            return;
        }
        for (Claim claim : claims) {
            System.out.println(claim);
        }
    }
}

public class claimpolicy {
    public static void main(String[] args) {
        ClaimTrackingSystem claimTrackingSystem = new ClaimTrackingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Claim");
            System.out.println("2. Update Claim Status");
            System.out.println("3. Generate Report");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Claim Number: ");
                    int claimNumber = scanner.nextInt();
                    System.out.print("Enter Policy Number: ");
                    int policyNumber = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Claimant's Name: ");
                    String claimantName = scanner.nextLine();
                    System.out.print("Enter Claim Amount: ");
                    double claimAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Status (pending/approved/rejected): ");
                    String status = scanner.nextLine();
                    claimTrackingSystem.addClaim(claimNumber, policyNumber, claimantName, claimAmount, status);
                    break;
                case 2:
                    System.out.print("Enter Claim Number to Update: ");
                    int updateClaimNumber = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter New Status (pending/approved/rejected): ");
                    String newStatus = scanner.nextLine();
                    claimTrackingSystem.updateClaimStatus(updateClaimNumber, newStatus);
                    break;
                case 3:
                    claimTrackingSystem.generateReport();
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