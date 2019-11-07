import java.util.*;
public class LemonadeStand
{
    private String name;
    private double bank;;
    private int cups;
    private int pitcher;//one pitcher makes 8 cups
    private static final double PITCHER_PRICE=2.00;
    private static final double CUP_PRICE=.25;
    private double price;
    private int totalDays;
    private int currentDay;
    private int dailyCustomers;
    private double profit;
    private String weather;
    private Random gen;
    public LemonadeStand(String n, int t)
    {
        name=n;
        totalDays=t;
        gen = new Random();
        bank=20.0;
        cups=0;
        pitcher=0;
        currentDay=1;
        price=0;
        dailyCustomers=0;
        weather="";
    }
    public String getName()
    {
        return name;
    }
    public double getBank()
    {
        return bank;
    }
    public int getCups()
    {
        return cups;
    }
    public int getPitcher()
    {
        return pitcher;
    }
    public int getDay()
    {
        return currentDay;
    }
    public double getPrice()
    {
        return price;
    }
    public int getDailyCustomers()
    {
        if (weather.equals("Rainy"))
            dailyCustomers = gen.nextInt(50)+6;
        else if (weather.equals("Thunder Storms"))
            dailyCustomers = gen.nextInt(25)+2;
        else if (weather.equals("Extra Caliente'"))
            dailyCustomers = 100;
        else if (weather.equals("Sunny"))
            dailyCustomers = gen.nextInt(150)+36;
        else if (weather.equals("Overcast"))
            dailyCustomers = gen.nextInt(50)+6;
        else if (weather.equals("Hail"))
            dailyCustomers = gen.nextInt(25);
        else if (weather.equals("Natural Disaster"))
            dailyCustomers = 0;
        return dailyCustomers;
    }
    public String getWeather()
    {
        int ran = gen.nextInt(100);
        if(ran<25)
            weather="Rainy";
        else if(ran<30)
            weather="Thunder Storms";
        else if(ran<45)
            weather="Extra Caliente'";
        else if(ran<75)
            weather="Sunny";
        else if(ran<80)
            weather="Overcast";
        else if(ran<95)
            weather="Hail";
        else
            weather="Natural Disaster";
        return weather;
    }
    public void buyCups(int amt)
    {
        bank-=amt*CUP_PRICE;
        cups+=amt;
    }
    public void useCups()
    {
        if(cups>dailyCustomers)
        {
            cups-=dailyCustomers;
        }
    }
    public void buyPitchers(int amt)
    {
        bank-=amt*PITCHER_PRICE;
        pitcher+=amt;
    }
    public void resetPitcher()
    {
        pitcher=0;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public void playGame()
    {
       int sales;
       if(pitcher<=0)
           sales=0;
       else
       {
           useCups();
           sales=dailyCustomers;
           profit = sales*price;
           bank+=profit;
       }
    }
    public double getProfit()
    {
        return profit;
    }
}
