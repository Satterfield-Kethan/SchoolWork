 /** A program to make simple bank accounts with included methods to proform the basic funtions one would need to maintain an account.
     */
public class BankAccount
{
   
    //Instance Vaibles
    private String name;
    private double balance;
    //Constructor
    public BankAccount(String n, double b) 
    {
        //Intialise instance vairbles
        name = n;
        balance = b;
    }
    //returns the name of the account holder
    public String getName()
    {
        return name;
    }
    //returns the balance of the account
    public double getBalance()
    {
        return balance;
    }
    //returns both the name of the account holder and the balance of the account
    public String toString()
    {
        return "Name: " + name + "\nBalance: " + balance;
    }
    //withdraws an amount of money set by the user and updates the account balance
    public void withdraw(double amt)
    {
        balance -= amt;
    }
    //deposits an amount of money set by the user and updates the account balance
    public void deposit(double amt)
    {
        balance += amt;
    }
    
    public void transfer(BankAccount other, double amt)
    {
        balance =+ amt; 
        other.balance -= amt;
    }
    
    public void addInterest(double rate)
    {
        double decimalRate=rate / 100/ 12;
        double interest=rate*balance;
        deposit(interest);
    }
}