import java.util.Scanner;

public class Game 
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        String name;
        System.out.println("Please enter your name.");
        name=myScanner.nextLine();
        System.out.println("Hello " + name + ", let's start the adventure!");	
        Start();
    }

    public static void Start ()
    {
        Scanner myScanner = new Scanner(System.in);
        String ans;
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You are walking down a road.\nYou see a super spooky abandoned house.\nDo you approach the house?");
        System.out.println("1: Yes\n2: No");
        System.out.println("\n------------------------------------------------------------------\n");
        ans = myScanner.nextLine();
        while (!ans.equals("1")&&!ans.equals("2"))
        {
            System.out.println("Invalid input.");
            Start();
        }
        if (ans.equals("1"))
        {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You walk up the sidewalk to the front door. The door is locked.");
            System.out.println("You look for the key. Where do you look first?\n1:  Under the mat\n2:  In the mail slot\n3:  In the bush");
            System.out.println("\n------------------------------------------------------------------\n");
            ans=myScanner.nextLine();
            while (!ans.equals("1")&&!ans.equals("2")&&!ans.equals("3"))
            {
                System.out.println("Invalid input.\nPlease try again.");
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Where do you look first?\n1:  Under the mat\n2:  In the mail slot\n3:  In the bush");
                System.out.println("\n------------------------------------------------------------------\n");
                ans=myScanner.nextLine();
            }
            while (ans.equals("1")||ans.equals("2"))
            {
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("The key wasn't there.");
                System.out.println("You are still looking for the key. Where do you look?\n1:  Under the mat\n2:  In the mail slot\n3:  In the bush");
                System.out.println("\n------------------------------------------------------------------\n");
                ans=myScanner.nextLine();
            }
            if (ans.equals("3"))
            {
                Inside();
            }
        }
        else if(ans.equals("2"))
        {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("I guess you are not up to the adventure.");
            System.out.println("Would you like to restart?");
            System.out.println("1: Yes\n2: No");
            System.out.println("\n------------------------------------------------------------------\n");
            ans=myScanner.nextLine();
            while (!ans.equals("1")&&!ans.equals("2"))
            {
                System.out.println("Invalid input.\nPlease try again.");
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Would you like to restart?");
                System.out.println("1: Yes\n2: No");
                System.out.println("\n------------------------------------------------------------------\n");
                ans=myScanner.nextLine();
            }
            if (ans.equals("2"))
            {
                System.out.println("That's okay.\nI guess I wrote this for no reason.");
                System.out.printf("Either way, ");
                End();
            }
            else if (ans.equals("1"))
            {
                Start();
            }
        }
    }
    
    public static void Key()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You found the key.\nYou put the key in the lock.\nIt fits\nYou unlock the door and enter.\n\nThe door shuts behind you.");
        System.out.println("\n------------------------------------------------------------------\n");
        Inside();
    }
    
    public static void Inside ()
    {
        Scanner myScanner = new Scanner(System.in);
        String ans;
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You look around and see 3 rooms.");
        System.out.println("Which room do you enter?\n1:  Kitchen\n2:  Living room\n3:  Bathroom");
        System.out.println("\n------------------------------------------------------------------\n");
        ans=myScanner.nextLine();
        while (!ans.equals("1")&&!ans.equals("2")&&!ans.equals("3"))
        {
            System.out.println("Invalid input.\nPlease try again.");
            Inside();
        }
        if (ans.equals("1"))
        {    
            Kitchen();
        }
        else if (ans.equals("2"))
        {
            LivingRoom();
        }
        else if (ans.equals("3"))
        {
            Bathroom();
        }
    }
    
    public static void Kitchen()
    {
        Scanner myScanner = new Scanner(System.in);
        String ans;
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You enter the kitchen\nYou look around and see out dated food.\nThe smell is horrific."
        +"\nYou see a refrigerator glowing and violently shaking.\n\nWhat do you?\n1:  Open the fridge\n2:  Leave the kitchen.");
        System.out.println("\n------------------------------------------------------------------\n");
        ans=myScanner.nextLine();
        while (!ans.equals("1")&&!ans.equals("2")&&!ans.equals("3"))
        {
            System.out.println("Invalid input.\nPlease try again.");
            Kitchen();
        }
        if (ans.equals("1"))
        {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You open the refrigerator.\nYou are sucked in side of a hole in the space time continuum.\nYou die."
            +"\n\nGAME OVER.\n\nWould you like to restart?\n1:  Yes\n2:  No");
            System.out.println("\n------------------------------------------------------------------\n");
            ans=myScanner.nextLine();
            while (!ans.equals("1")&&!ans.equals("2"))
            {
                System.out.println("Invalid input.\nPlease try again.");
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Would you like to restart?\n1:  Yes\n2:  No");
                System.out.println("\n------------------------------------------------------------------\n");
                ans=myScanner.nextLine();
            }
            if (ans.equals("1"))
            {
                Start();
            }
            else if (ans.equals("2"))
            {
                End();
            }
        }
        else if (ans.equals("2"))
        {
            Inside();
        }
    }
    
    public static void LivingRoom()
    {
        Scanner myScanner = new Scanner(System.in);
        String ans;
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You enter the living room.\nYou see that the TV is on and is playing that episode of Seinfeld where Elane embarases her self danceing."
        +"\nWhat do you do?\n1:  Sit down and watch\n2:  Leave the living room ");
        System.out.println("\n------------------------------------------------------------------\n");
        ans=myScanner.nextLine();
        while (!ans.equals("1")&&!ans.equals("2"))
        {
            System.out.println("Invalid input.");
            LivingRoom();
        }
        if (ans.equals("1"))
        {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You sit down to watch the TV.\nIt turns out it is a marathon. You continue watching."
            +"\nYou don't get up and die of starvation.\n\nGAME OVER.\n\nWould you like to restart?\n1:  Yes\n2:  No");
            System.out.println("\n------------------------------------------------------------------\n");
            ans=myScanner.nextLine();
            while (!ans.equals("1")&&!ans.equals("2"))
            {
                System.out.println("Invalid input.\nPlease try again.");
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Would you like to restart?\n1:  Yes\n2:  No");
                System.out.println("\n------------------------------------------------------------------\n");
                ans=myScanner.nextLine();
            }
            if (ans.equals("1"))
            {
                Start();
            }
            else if (ans.equals("2"))
            {
                End();
            }
        }
        else if (ans.equals("2"))
        {
            Inside();
        }
    }
    
    public static void Bathroom()
    {
        Scanner myScanner = new Scanner(System.in);
        String ans;
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("You enter the bathroom.\nYou see the most dirtiest bathroom ever."+
        "\nBut there is a very nice antique clawfoot tub.\nWhat do you do?\n1:  Approach the tub\n2:  Leave the bathroom");
        System.out.println("\n1------------------------------------------------------------------\n");
        ans=myScanner.nextLine();
        while (!ans.equals("1")&&!ans.equals("2"))
        {
            System.out.println("Invalid input.");
            Bathroom();
        }
        if (ans.equals("1"))
        {
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You walk towards the tub.\nAs you do, the drain gets bigger and bigger."
            +"\nYou crawl inside.\nYou exit out side of the house.\n\nCongratulations, you have won!\n\nWould you like to play again?\n1:  Yes\n2:  No");
            System.out.println("\n------------------------------------------------------------------\n");
            ans=myScanner.nextLine();
            while (!ans.equals("1")&&!ans.equals("2"))
            {
                System.out.println("Invalid input.\nPlease try again.");
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("Would you like to play again?\n1:  Yes\n2:  No");
                System.out.println("\n------------------------------------------------------------------\n");
                ans=myScanner.nextLine();
            }
            if (ans.equals("1"))
            {
                Start();
            }
            else if (ans.equals("1"))
            {
                End();
            }
        }
        else if (ans.equals("1"))
        {
            Inside();
        }
    }
    
    public static void End()
    {
        System.out.println("\n------------------------------------------------------------------\n");
        System.out.println("I hope you had fun!\nBe sure to tell all yall friends and leave a review on Yelp!");
        System.out.println("\n------------------------------------------------------------------\n");
    }
}