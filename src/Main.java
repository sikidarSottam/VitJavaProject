public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Rahul Sharma", "1998-05-14", "A/404, Green Park Society, Andheri West, Mumbai 400058");
        Person p2 = new Person("Priya Singh", "1995-11-22", "Flat No 1202, Lotus Heights, Baner Road, Pune 411045");
        Person p3 = new Person("Amit Kumar", "1992-08-30", "H.No 45, Sector 12, Noida, Uttar Pradesh 201301");

        BankAccount a1 = new BankAccount("SB00123456", p1);
        BankAccount a2 = new BankAccount("SB00987654", p1);
        BankAccount a3 = new BankAccount("SB00555123", p2);
        BankAccount a4 = new BankAccount("SB00777234", p3);

        a1.deposit(15000);
        a1.deposit(8000);
        a1.withdraw(5000);
        a1.showBalance();

        a2.deposit(50000);
        a2.showBalance();

        a3.deposit(25000);
        a3.deposit(12000);
        a3.withdraw(8000);
        a3.withdraw(30000);
        a3.showBalance();

        a4.deposit(100000);
        a4.withdraw(25000);
        a4.deposit(15000);
        a4.showBalance();

        a1.transfer(a3, 12000);
        a1.showBalance();
        a3.showBalance();

        BankAccount.showAllAccounts();
    }
}
