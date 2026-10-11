package com.shahadat;

public class BankSystem {
    private BankAccount account;
    private Transaction transaction;
    private BankAccount accountholders[];
    private int currentIndex=0;
    private int transindex = 0;
    private int deleteIndex = 0;
    private Transaction transactionlist[];

    public BankSystem(int numberOfAccounts)
    {
        this.accountholders = new BankAccount[numberOfAccounts];
        this.transactionlist = new Transaction[300];
    }

    public void addAccount(String number, String name, double initBalance){
        BankAccount account = new BankAccount(number, name, initBalance);
        this.accountholders[currentIndex] = account; //Adding account object to array
        this.currentIndex++; //Increment the pointer
    }

    public void addTransaction(String accountNumber, double amount, String operation){
        String tid = "t" + transindex + 1;
        Transaction t = new Transaction(tid, amount, accountNumber, operation);
        transactionlist[transindex] = t;
        transindex++;
    }

    public void printTransactionList(){
        for(int i=0; i<this.transindex; i++){
            System.out.println(this.transactionlist[i].transactionDetails());
        }
    }

    public void performDeposit(String accountNumber, double amount){
        addTransaction(accountNumber, amount, "Deposit");
    }

    public void performWithdraw(String accountNumber, double amount){
        addTransaction(accountNumber, amount, "Withdraw");
    }

    public BankAccount searchAccount(String number){
        for(BankAccount accnt: this.accountholders){
            if(accnt == null) break;
            if(accnt.getAccountNumber().equals(number)) {
                return accnt; //If found return the account object
            }
        }
        return null; //If account not found
    }

    public void printTransaction(String accNum){

    }

    public int getNumberOfCustomers(){
        return this.currentIndex;
    }

    public void createAccount(BankAccount account)
    {
        this.account = account;
        this.accountholders[currentIndex++] = account;
        System.out.println("Created account");
    }

    public void deleteAccount(String accountNumber)
    {
        int i = 0;
        for(i=0;i<this.currentIndex;i++){
            if(this.accountholders[i].getAccountNumber().equals(accountNumber)){
                break;
            }
        }
        int j;
        for(j = i; j<this.currentIndex-1; j++){
            this.accountholders[j] = this.accountholders[j+1];
        }
        this.accountholders[this.currentIndex--] = null;
        deleteIndex++;
        System.out.println("Account Deleted. \nDeleted account number: " + deleteIndex);
    }

    public void performtransaction(String number, double amount, String operation) {
        this.transaction = new Transaction(number+"01", amount, number, operation);
        this.account.deposit(amount);
        System.out.println("Performed transaction \n" + this.transaction);
    }

    public void performDeposit(double amount){
        this.account.deposit(amount);
    }

    public void performWithdraw(double amount){
        this.account.withdraw(amount);
    }



    public void printStatement(BankAccount acc){
        System.out.println(acc.statement());
    }

    public void accountDetails(){
        System.out.println(this.account);
    }

    public void getAllAccountDetails(){
        for(int i=0; i<this.currentIndex; i++){
            System.out.println(this.accountholders[i]);
        }
    }
}
