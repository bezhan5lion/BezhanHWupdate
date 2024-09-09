package org.example.e151;
class BankAccount{
    String AccountHolderName;
    double balance;
    String accountNumber;

    public BankAccount(String AccountHolderName, double balance, String accountNumber){
        this.AccountHolderName=AccountHolderName;
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    void deposit(double depAmount){
        this.balance=balance+depAmount;
    }
    void withdraw(double withdrawAmount){
        this.balance=balance-withdrawAmount;
    }
    void printAccountInfo(){
        System.out.println("Account Holder: "+AccountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}

    class SavingsAccount extends BankAccount{

    double interestRate;

        public SavingsAccount(String AccountHolderName, double balance, String accountNumber) {
            super(AccountHolderName, balance, accountNumber);
        }

        double applyInterest(int interestRate, double balance){
        this.balance=balance*interestRate;
        return balance;
    }
    }

    class CheckingAccount extends BankAccount {

    double overDraftLimits;

        public CheckingAccount(String AccountHolderName, double balance, String accountNumber) {
            super(AccountHolderName, balance, accountNumber);
        }

        void withdraw(double withdrawAmount){
            this.balance=balance-withdrawAmount;
        }

    }

public class E151Inheritance {
    public static void main(String[] args) {
    SavingsAccount sa=new SavingsAccount("John Doe", 525.0,"123456789");
    sa.deposit(100);
    sa.withdraw(100);
    sa.applyInterest(2,525.0);
        sa.printAccountInfo();
        System.out.println();

        SavingsAccount sa2=new SavingsAccount("Jane Smith", -100.0,"987654321");
        sa2.deposit(100);
        sa2.withdraw(100);
        sa2.applyInterest(2,-25.0);
        sa2.printAccountInfo();
    }
}
