/**
 * A program that opens a bank account and then allows the user to proform a varity of basic operations
 */
import java.util.*;
public class BankAccountInteractive
{
   public static void main(String[] args) 
   {
      //creates a Scanner object to get data entered by the user
      Scanner key = new Scanner (System.in);
      //prompts user for name
      System.out.println("Welcome to The Burito Bank."
      +"\nWe need some information to open your account.\nPlease enter your name.");
      //user enters their name using the keyboard and it is stored in the varible n
      String n = key.nextLine();
      //prompts user for opening despisit 
      System.out.println("Thank you, "+n+".\nPlease enter your opening deposit ammount.");
      //user enters the amount of their opening deposit using the keyboard and it is stored in the varible b
      double b = key.nextDouble();
      System.out.println("Thank you. We are proccessing your request.");
      //A new bank account is made using the construtor found in the factory class BankAccount
      BankAccount checking = new BankAccount(n, b);
      System.out.println("Congradulations, your account has been succsessfuly opened.\n"+checking);
      //asks the user what the next operation should be
      System.out.println("Would you like to (d)eposit, (w)ithdraw, or (l)ogout?");
      //resets the counsol
      key.nextLine();
      //gets answer and stores in it the varible ans
      String ans = key.nextLine();
      //a imput validation loop to check if the user enterewd a correct term
      while (!(ans.equalsIgnoreCase("deposit")) &&!(ans.equalsIgnoreCase("withdraw"))&&!(ans.equalsIgnoreCase("logout")) 
      && !(ans.equalsIgnoreCase("d")) && !(ans.equalsIgnoreCase("w")) && !(ans.equalsIgnoreCase("l")))
      {
          //repromts the user
          System.out.println("Invalid input.\nWould you like to deposit, withdraw, or logout?");
          //updtaes ans
          ans = key.nextLine();
      }
      //process for deposing an amount
      if(ans.equalsIgnoreCase("deposit") || ans.equalsIgnoreCase("d"))
      {
          //asks user for deposit amount
          System.out.println("How much would you like to deposit?");
          //stores amount entered in keyboard in the varible amt
          double amt= key.nextDouble();
          //deposits the amount into the account
          checking.deposit(amt);
          //desplays the new balcne and quits the program
          System.out.println("You new balence is "+checking.getBalance()+".");
          System.out.println("Thank you for choosing The Burito Bank.\nHave a nice day!");
      }
      //processs for withdrawing an amount
      else if(ans.equalsIgnoreCase("withdraw") || ans.equalsIgnoreCase("w"))
      {
          //asks user for deposit amount
          System.out.println("How much would you like to withdraw?");
          //stores amount entered in keyboard in the varible amt
          double amt= key.nextDouble();
          /* checks for significant funds for the withdraw in a while loop that only
           * exits when the usuer enters an amount less than or equal to their balance
           */
          while(amt>=checking.getBalance())
          {
              System.out.println("Sorry, but you do not have significant funds to withdraw that amount.\nYou have $"
              +checking.getBalance()+".");
              //calculates the amount that the user is short
              double bajo = amt-checking.getBalance();
              //repromts the user
              System.out.println("You need $"+bajo+" more.\nHow much would you like to withdraw?");
              //updates amt
              amt= key.nextDouble();
          }
          //withdraws the amount from the account
          checking.withdraw(amt);
          //desplays the new balcne and quits the program
          System.out.println("You new balence is "+checking.getBalance()+".");
          System.out.println("Thank you for choosing The Burito Bank.\nHave a nice day!");
      }
      //quits the program
      else if(ans.equalsIgnoreCase("logout") || ans.equalsIgnoreCase("l"))
      {
          System.out.println("Thank you for choosing The Burito Bank.\nHave a nice day!");
      }
   }
}