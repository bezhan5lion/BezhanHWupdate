package org.example.e170;
class Customer{
    private String customerName;
    private int customerAge;

    public void setCn(String customerName){
        this.customerName=customerName;
    }
    public void setCa(int customerAge){
        this.customerAge=customerAge;
    }
    public String getCn(){
        return customerName;
    }
    public int getCa(){
        return customerAge;
    }
}

public class E170Encapsulation {
    public static void main(String[] args) {

        Customer c=new Customer();
        c.setCa(32);
        c.setCn("Mario");
        System.out.println("Customer Name: "+c.getCn());
        System.out.println("Customer Age: "+c.getCa());
    }
}





