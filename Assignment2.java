class Account {
    private int accountNo;
    private double balance;

    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void showDetails() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Current Balance: ₹" + balance);
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " debited (withdrawn) successfully.");
        } else {
            System.out.println("❌ Insufficient balance! Debit failed.");
        }
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " credited (added) successfully.");
        } else {
            System.out.println("❌ Invalid amount! Credit failed.");
        }
    }

    public static void main(String[] args) {
        Account acc = new Account(12345678, 5000.00);
        acc.showDetails();
        acc.credit(2000);
        acc.showDetails();
        acc.debit(3000);
        acc.showDetails();
        acc.debit(5000);
        acc.showDetails();
    }
}
