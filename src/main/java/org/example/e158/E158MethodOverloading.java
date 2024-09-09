package org.example.e158;
class LoanPaymentCalculator{

    double calculatePayment(double loanAmount, double interestRate){
        double payment = (loanAmount * (1 + interestRate / 100))/12;
        return payment;
    }

    double calculatePayment(double loanAmount, double interestRate, double months){
        double payment = (loanAmount * (1 + interestRate / 100))/months;
        return payment;
    }
    double calculatePayment(double loanAmount, double interestRate, double months, double downPayment){
        double payment = ((loanAmount-downPayment) * (1 + interestRate / 100))/ months;
        return payment;
    }
}
public class E158MethodOverloading {
    public static void main(String[] args){
        LoanPaymentCalculator obj=new LoanPaymentCalculator();



        double l1=obj.calculatePayment(10000,5);
        double l2=obj.calculatePayment(10000.0,5,24);
        double l3=obj.calculatePayment(10000.0,5,24,2000.0);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

    }
}

