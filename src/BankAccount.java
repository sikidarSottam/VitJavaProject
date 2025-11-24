public class BankAccount {
    String accNumber;
    Person owner;
    double balance;
    static int totalAccounts = 0;

    BankAccount(String num, Person p) {
        accNumber = num;
        owner = p;
        balance = 0;
        totalAccounts++;
    }

    void deposit(double amt) {
        if (amt > 0) {
            balance = balance + amt;
            System.out.println("Deposited ₹" + amt + " to " + accNumber);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance = balance - amt;
            System.out.println("Withdrawn ₹" + amt + " from " + accNumber);
        } else if (amt > balance) {
            System.out.println("Insufficient balance in " + accNumber + " ! Only ₹" + balance + " available");
        } else {
            System.out.println("Withdraw amount must be positive!");
        }
    }

    void showBalance() {
        System.out.println("Account " + accNumber + " | Owner: " + owner.name + " | Balance: ₹" + balance);
        System.out.println();
    }

    void transfer(BankAccount to, double amt) {
        if (amt > 0 && amt <= balance) {
            this.balance -= amt;
            to.balance += amt;
            System.out.println("Transferred ₹" + amt + " from " + this.accNumber + " to " + to.accNumber);
        } else if (amt > balance) {
            System.out.println("Transfer failed - not enough money in " + this.accNumber);
        } else {
            System.out.println("Invalid transfer amount");
        }
    }

    static void showAllAccounts() {
        System.out.println("Total bank accounts created: " + totalAccounts);
    }
}