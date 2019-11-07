import java.util.*;
public class LemonadeGame
{
   public static void main(String[] args) 
   {
       Scanner key = new Scanner(System.in);
       System.out.println("Welcome to Lemonade Stand!\nWhat is your name?");
       String name=key.nextLine();
       System.out.println("Okay, "+name+".\nHow many days do you want to play?");
       int days=key.nextInt();
       LemonadeStand stand = new LemonadeStand(name, days);
       int missedCustomers=0;
       for(int i=1;i<=days;i++)
       {
           System.out.println("Stand Owner: "+stand.getName()+"\nDay: "+i+"\nBank: "
           +stand.getBank()+"0\nPitchers: "+stand.getPitcher()+"\nCups: "+stand.getCups()+"\nWeather: "+stand.getWeather());
           
           System.out.println("How many cups would you like to buy? They are $0.25 each.");
           int amt = key.nextInt();
           stand.buyCups(amt);
           System.out.println("You now have "+stand.getCups()+" cups and $"+stand.getBank()+"0.");
           
           System.out.println("How many pichers would you like to buy? They are $2.00 each.");
           amt = key.nextInt();
           stand.buyPitchers(amt);
           System.out.println("You now have "+stand.getPitcher()+" pichters and $"+stand.getBank()+"0.");
            
           System.out.println("How much would you like to sell your lemonade for?");
           double price = key.nextDouble();
           stand.setPrice(price);
           stand.getDailyCustomers();
           System.out.println("Your stand is now open.\nPress enter to run the game for the day");
           key.nextLine();
           stand.playGame();
           System.out.println("Lets see how you did for the day.");
           
           if(stand.getDailyCustomers()>(stand.getPitcher()*8))
           {
               missedCustomers=stand.getDailyCustomers()%(stand.getPitcher()*8);
           }
           else if(stand.getDailyCustomers()>stand.getCups())
           {
               missedCustomers=stand.getDailyCustomers()-stand.getCups();
           }
           System.out.println(stand.getDailyCustomers()+" stopped at your stand today and bought lemonade. You missed "
           +missedCustomers+" customers. You made $"+stand.getProfit()+"0 in profits.");
           stand.resetPitcher();
       }
       System.out.println("Congrats,"+stand.getName()+"! You made a total of $"+(stand.getBank()-20)
       +" in profits!\nThank you for playing Lemonade Stand.");
   }
}