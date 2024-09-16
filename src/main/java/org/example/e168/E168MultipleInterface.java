package org.example.e168;
interface Transaction {
    void processTransaction(double amount);
}
interface BankOperations extends Transaction{
    double deposit(double amount);
    double withdraw(double amount);
    double checkBalance();
}
class BankAccount implements BankOperations {
    double balance;
    BankAccount(double ib){
        this.balance=ib;
    }

    @Override
    public double deposit(double amount) {
        balance+=amount;
        processTransaction(amount);
        return balance;
    }

    @Override
    public double withdraw(double amount) {
        if (amount<=balance){
            balance-=amount;
            processTransaction(-amount);
        }else {
            System.out.println("Transaction failed: Insufficient funds");
        }
        return balance;
    }

    @Override
    public double checkBalance() {
        System.out.println("Current Balance: " + balance);
        return balance;
    }

    @Override
    public void processTransaction(double amount) {
        if (amount >= 0) {
            System.out.println("Transaction successful: Deposited " + amount);
        } else {
            System.out.println("Transaction successful: Withdrew " + (-amount));
        }
    }
}
public class E168MultipleInterface {

    public static void main(String[] args){

        BankAccount ba=new BankAccount(0.0);
        ba.deposit(100.0);
        ba.withdraw(50.0);
        ba.checkBalance();
        ba.withdraw(200.0);

    }
}
