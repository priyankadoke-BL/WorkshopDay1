package Banking;

public class SavingAccount {
    public static double annualInterestRate=0.0;

    private double savingBal=0.0;

    public SavingAccount(double savingBal, double annualInterestRate) {
        this.savingBal = savingBal;
        this.annualInterestRate=annualInterestRate;
    }

    public double calculateMonthlyInterest(){

        double interest=(this.savingBal * this.annualInterestRate)/12;
        return this.savingBal+interest;
    }
    public static void ModifyInterestRate(double rate){
        annualInterestRate=rate;
    }
}
