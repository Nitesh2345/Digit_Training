package Advanced_Program;

public class Policy {
        private String policyNumber;
        private String policyholderName;
        private String insuranceType;
        private double coverageAmount;

        public Policy(String policyNumber, String policyholderName, String insuranceType, double coverageAmount) {
            this.policyNumber = policyNumber;
            this.policyholderName = policyholderName;
            this.insuranceType = insuranceType;
            this.coverageAmount = coverageAmount;
        }

        public String getPolicyNumber() {
            return policyNumber;
        }

        public void setPolicyNumber(String policyNumber) {
            this.policyNumber = policyNumber;
        }

        public String getPolicyholderName() {
            return policyholderName;
        }

        public void setPolicyholderName(String policyholderName) {
            this.policyholderName = policyholderName;
        }

        public String getInsuranceType() {
            return insuranceType;
        }

        public void setInsuranceType(String insuranceType) {
            this.insuranceType = insuranceType;
        }

        public double getCoverageAmount() {
            return coverageAmount;
        }

        public void setCoverageAmount(double coverageAmount) {
            this.coverageAmount = coverageAmount;
        }
    }
