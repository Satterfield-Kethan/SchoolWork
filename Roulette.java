import java.util.*;
public class Roulette
{
    int numRolled;
    Random gen= new Random();
    String name;
    double money;
    int betNum;
    double betAmt;
    String betType;
    String betKind;
    public Roulette(String n, double m)
    {
        name=n;
        money=m;
    }

    public double getMoney()
    {
        return money;
    }

    public void play()
    {
        double amt=0.0;
        if(checkWin()==true)
        {
            if(betType.equalsIgnoreCase("number"))
            {
                amt=betAmt*37;
                addWin(amt);
            }
            else
            {
                amt=betAmt;
                addWin(amt);
            }
        }
        else
        {
            if(betType.equalsIgnoreCase("number"))
            {
                amt=betAmt;
                subLose(amt);
            }
            else
            {
                amt=betAmt;
                subLose(amt);
            }
        }
    }

    public void addWin(double amt)
    {
        money+=amt;
    }

    public void subLose(double amt)
    {
        money-=amt;
    }

    public boolean checkWin()
    {
        boolean win=false;
        if(betType.equalsIgnoreCase("number"))
        {
            if(betNum==numRolled)
                win=true;
            else
                win=false;
        }
        else if(betType.equalsIgnoreCase("parity"))
        {
            if(betKind.equalsIgnoreCase("even"))
            {
                if(numRolled%2==0)
                    win=true;
                else
                    win=false;
            }
            else if (betKind.equalsIgnoreCase("odd"))
            {
                if(numRolled%2==0)
                    win=false;
                else
                    win=true;
            }
        }
        else if(betType.equalsIgnoreCase("color"))
        {
            if(betKind.equalsIgnoreCase("red"))
                if(getColor().equalsIgnoreCase("red"))
                    win=true;
                else 
                    win=false;
            else if (betKind.equalsIgnoreCase("black"))
                if(getColor().equalsIgnoreCase("black"))
                    win=true;
                else 
                    win=false;
        }
        return win;
    }

    public void setBetType(String type)
    {
        betType=type;
    }

    public int getBetNum()
    {
        return betNum;
    }

    public void setBetNum(int bet)
    {
        betNum=bet;
    }

    public void setBetAmt(double amt)
    {
        betAmt=amt;
    }

    public void setBetKind(String bet)
    {
        betKind=bet;
    }

    public void spin()
    {
        numRolled = gen.nextInt(37);
    }

    public int getSpin()
    {
        return numRolled;
    }

    public double getBetAmt()
    {
        return betAmt;
    }

    public String getBetKind()
    {
        return betKind;
    }

    public String getBetType()
    {
        return betType;
    }

    public String getParity()
    {
        String lable="";
        if(numRolled%2==0)
            lable="even";
        else 
            lable="odd";
        return lable;
    }

    public String getColor()
    {
        String color="";
        switch(numRolled)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 12:
            case 14:
            case 16:
            case 18:
            case 19:
            case 21:
            case 23:
            case 25:
            case 27:
            case 30:
            case 32:
            case 34:
            case 36:
            color="Red";
            break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 20:
            case 22:
            case 24:
            case 26:
            case 28:
            case 29:
            case 31:
            case 33:
            case 35:
            color="Black";
            break;
            default:
            color="Opps";
        }
        return color;
    }
}