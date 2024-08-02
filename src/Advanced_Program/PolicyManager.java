package Advanced_Program;
import java.util.ArrayList;
public class PolicyManager {
        private ArrayList<Policy> policies;

        public PolicyManager() {
            this.policies = new ArrayList<>();
        }

        public void addPolicy(Policy policy) {
            policies.add(policy);
        }

        public void removePolicyByNumber(String policyNumber) {
            policies.removeIf(policy -> policy.getPolicyNumber().equals(policyNumber));
        }

        public void updatePolicy(String policyNumber, String policyholderName, String insuranceType, double coverageAmount) {
            for (Policy policy : policies) {
                if (policy.getPolicyNumber().equals(policyNumber)) {
                    if (policyholderName != null) policy.setPolicyholderName(policyholderName);
                    if (insuranceType != null) policy.setInsuranceType(insuranceType);
                    policy.setCoverageAmount(coverageAmount);
                    break;
                }
            }
        }

        public ArrayList<Policy> listPoliciesByType(String insuranceType) {
            ArrayList<Policy> policiesByType = new ArrayList<>();
            for (Policy policy : policies) {
                if (policy.getInsuranceType().equals(insuranceType)) {
                    policiesByType.add(policy);
                }
            }
            return policiesByType;
        }

        public ArrayList<Policy> getAllPolicies() {
            return new ArrayList<>(policies);
        }
    }
