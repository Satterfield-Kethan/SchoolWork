import java.util.*;
public class Play_Roulette
{
    public static void main (String[]args)
    {
        Scanner key = new Scanner(System.in);
        String ans="no";
        System.out.println("Please enter your name.");
        String n = key.nextLine();
        System.out.println("How much money are you bringing to the table?");
        double m = key.nextDouble();
        key.nextLine();
        Roulette game= new Roulette(n,m);
        do
        {  
            System.out.println("How much would you like to bet? You have $"+game.getMoney()+".");
            double betAmt=key.nextDouble();
            while(betAmt>game.getMoney())
            {
                System.out.println("You only have $"+game.getMoney()+". How much would you like to bet?");
                betAmt=key.nextDouble();
            }
            game.setBetAmt(betAmt);
            key.nextLine();
            System.out.println("How would you like to bet?\nNumber, parity, or color?");
            String betType=key.nextLine();
            while(!(betType.equalsIgnoreCase("number"))&&(!betType.equalsIgnoreCase("parity"))
            &&(!betType.equalsIgnoreCase("color")))
            {
                System.out.println("That's not an option.\nHow would you like to bet?\nNumber; even or odd; red or black?");
                betType=key.nextLine();
            }
            game.setBetType(betType);
            if(betType.equalsIgnoreCase("number"))
            {
                System.out.println("Please enter your bet. It should be a number between 0 and 36, inclusisvly.");
                int betNum = key.nextInt();
                while(betNum>36||betNum<0)
                {
                    System.out.println("That is out of range. Please enter between 0 and 36, inclusisvly.");
                    betNum = key.nextInt();
                }
                game.setBetNum(betNum);
            }

            else if(betType.equalsIgnoreCase("parity"))
            {
                System.out.println("Please enter your bet. It should be even or odd.");
                String betKind = key.nextLine();
                while(!(betKind.equalsIgnoreCase("odd"))&&!(betKind.equalsIgnoreCase("even")))
                {
                    System.out.println("Parity means weather a number is even or odd. Please enter your bet.");
                    betKind = key.nextLine();
                }
                game.setBetKind(betKind);
            }
            else if (betType.equalsIgnoreCase("color"))
            {
                System.out.println("Please enter your bet. It should be black or red.");
                String betKind = key.nextLine();
                while(!(betKind.equalsIgnoreCase("red"))&&!(betKind.equalsIgnoreCase("black")))
                {
                    System.out.println("The choices are red or black. Please enter your bet.");
                    betKind = key.nextLine();
                }
                game.setBetKind(betKind);
            }
            if(game.getBetType().equalsIgnoreCase("color")||game.getBetType().equalsIgnoreCase("parity"))
                System.out.println("You bet $"+game.getBetAmt()+" on "+game.getBetKind());
            else
                System.out.println("You bet $"+game.getBetAmt()+" on "+game.getBetNum());
            key.nextLine();
            System.out.println("Press enter to spin the wheel.");
            key.nextLine();
            game.spin();
            System.out.println("The ball landed on "+game.getSpin()+". That is "+game.getColor()+" and "+game.getParity()+".");
            game.play();
            if(game.checkWin())
            {
                System.out.println("Congrats, you won!\nYou now have $"+game.getMoney());
            }
            else
            {
                System.out.println("Sorry, you lost! You now have $"+game.getMoney());
            }
            if(game.getMoney()>0)
            {   
                System.out.println("Would you like to play again?");
                ans=key.nextLine();
                while(!ans.equalsIgnoreCase("no")&&!ans.equalsIgnoreCase("yes"))
                {
                    System.out.println("Please answer with yes or no. Would you like to play again?");
                    ans=key.nextLine();
                }
            }
            else 
            {
                System.out.println("Sorry, you are now out of money. Would you like to add more?");
                String ans2=key.nextLine();
                while(!ans2.equalsIgnoreCase("no")&&!ans2.equalsIgnoreCase("yes"))
                {
                    System.out.println("Please answer with yes or no. Would you like add more money?");
                    ans2=key.nextLine();
                }
                if(ans2.equalsIgnoreCase("yes"))
                {
                    System.out.println("How much would you like to add?");
                    m=key.nextDouble();
                    game.addWin(m);
                    System.out.println("Would you like to play again?");
                    while(!ans.equalsIgnoreCase("no")&&!ans.equalsIgnoreCase("yes"))
                    {
                        System.out.println("Please answer with yes or no. Would you like to play again?");
                        ans=key.nextLine();
                    }
                    ans=key.nextLine();
                }
                else
                {
                    ans="no";
                }
            }
        }while(ans.equalsIgnoreCase("yes"));
        System.out.println("Thank you for playing!");
    }
}