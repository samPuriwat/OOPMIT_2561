package caseStudy;

public class BankApp {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Puriwat Lertkrai",
                1986);

        bankAccount acc = new bankAccount(
                "ACC001",
                500.00,
                customer);

        System.out.println(acc.getInfo());
        acc.deposit(1000.00);
        System.out.println(acc.getInfo());
        acc.withdraw(750.00);
        System.out.println(acc.checkBalance());


    }
}
