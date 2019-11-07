
public class BankAccountTest
{
   public static void main(String[] args) 
   {
      BankAccount BA1 = new BankAccount("Kethan", 1000);
      for(int i=1; i<=12; i++)
      {
          BA1.addInterest(10);
      }
      
      System.out.println(BA1.toString());
   }
}
