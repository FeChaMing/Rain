package practice.day3;

public class Account {
    private String name;
    private double balance;
    private final double overDraftLimit = 500;

    public Account(){
    }
    public Account(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getName(){
        return this.name;
    }
    public double getBalance(){
        return this.balance;
    }
    public void deposit(double addMoney){
        this.balance += addMoney;
    }
    public double withdraw(double lessMoney){
        this.balance -= lessMoney;
        return lessMoney;
    }
}
