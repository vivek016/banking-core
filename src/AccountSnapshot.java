import java.math.BigDecimal;

public class AccountSnapshot {

    public static void main(String[] args) {

        String accountId = "CUST-00412";
        // String constructor is mandatory for financial values —
        // double literals introduce floating-point drift
        BigDecimal balance = new BigDecimal("15420.75");
        BigDecimal overdraftLimit = new BigDecimal("500.00");
        boolean isVerified = true;
        int transactionCount = 13;

        System.out.println("--- Account Snapshot ---");
        System.out.printf("%-20s %s%n",        "Account ID:",      accountId);
        System.out.printf("%-20s GBP %,10.2f%n", "Balance:",         balance);
        System.out.printf("%-20s GBP %,10.2f%n", "Overdraft Limit:", overdraftLimit);
        System.out.printf("%-20s %s%n",        "Verified:",        isVerified);
        System.out.printf("%-20s %d%n",        "Transactions:",    transactionCount);

        BigDecimal result = balance.subtract(overdraftLimit);
        System.out.printf("%n%-20s GBP %,10.2f%n", "After Overdraft:", result);

        // compareTo() == 0 is the correct equality check for BigDecimal —
        // .equals() also compares scale, so "14920.75".equals("14920.750") is false
        if (result.compareTo(new BigDecimal("14920.75")) == 0) {
            System.out.println("Verification: EXACT — no floating-point drift.");
        }
    }
}