package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Q9 {
    public static void main(String[] args) {
        SavingsAccount jack = new SavingsAccount(100.1, 10,"jack",true);
        SavingsAccount bill = new SavingsAccount(202.2, 7,"bill",true);
        SavingsAccount sam = new SavingsAccount(3122.7, 13,"sam",true);
        Bank bank = new Bank();
        bank.addAccount(jack);
        bank.addAccount(bill);
        bank.addAccount(sam);
        bank.showBankAccounts();
    }
}

class SavingsAccount implements Comparable<SavingsAccount>{
    private double balance;
    private int id;
    private String holderName;
    private boolean isSalaryAccount; 

    @Override
    public int compareTo(SavingsAccount o) {
        return Integer.compare(this.getId(), o.getId());
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public boolean isSalaryAccount() {
        return isSalaryAccount;
    }

    public void setSalaryAccount(boolean isSalaryAccount) {
        this.isSalaryAccount = isSalaryAccount;
    }

    public SavingsAccount(double balance, int id, String holderName, boolean isSalaryAccount) {
        this.balance = balance;
        this.id = id;
        this.holderName = holderName;
        this.isSalaryAccount = isSalaryAccount;
    }

    public String toString(){
        return this.balance + " " + this.id + " " + this.holderName + " ";
    }

}

class Bank {
    private ArrayList<SavingsAccount> bank;
    public Bank(){
        bank = new ArrayList<>();
    }

    public void addAccount(SavingsAccount acc){
        if(bank.contains(acc)){
            System.out.println("Bank already contains account");
        } else {
            bank.add(acc);
            System.out.println("Account successfully added");
        }
    }

    public void showBankAccounts(){
        Collections.sort(bank);
        System.out.println(bank);
    }
}
