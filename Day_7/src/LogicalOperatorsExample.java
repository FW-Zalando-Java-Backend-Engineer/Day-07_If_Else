public class LogicalOperatorsExample {
    public static void main(String[] args) {
        int age = 22;
        boolean hasTicket = true;
        boolean isVIP = false;

        // AND Operator : && checks if both conditions are true.
        if (age >= 18 && hasTicket){
            System.out.println("✅ Entry allowed (Adult with ticket)");
        }

        // OR Operator : || checks if at least one condition is true.
        if (isVIP || hasTicket){
            System.out.println("🎟️ You may proceed (VIP or has ticket)");
        }

        // NOT Operator: ! inverts a boolean value (true becomes false and vice versa).
        if (!isVIP) {
            System.out.println("🛑 You are not a VIP");
        }
    }
}
