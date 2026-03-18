import java.math.BigDecimal;

class AccountSnapshot {
    public static void main(String[] args) {
        // Variable Declarations
        String accountId = "ACC-99234";
        BigDecimal balance = new BigDecimal("15420.75");
        BigDecimal overdraftLimit = new BigDecimal("500.00");
        boolean isVerified = true;
        int transactionCount = 12;

        // Print to console
        System.out.println("--- Account Snapshot ---");
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance: " + balance);
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Verified Status: " + isVerified);
        System.out.println("Total Transactions: " + transactionCount);

        // Verification of BigDecimal subtraction
        BigDecimal result = balance.subtract(overdraftLimit);
        System.out.println("\nVerification (Balance - Overdraft): " + result);

        // Confirming the result is exactly 14920.75
        if (result.equals(new BigDecimal("14920.75"))) {
            System.out.println("Confirmation: The calculation is EXACT.");
        }
    }
}