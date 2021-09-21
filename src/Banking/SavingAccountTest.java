package Banking;

public class SavingAccountTest {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000.0,4);
        SavingAccount saver2 = new SavingAccount(3000.0,4);

        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());

        SavingAccount.modifyInterestRate(5);
        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());

    }
}
