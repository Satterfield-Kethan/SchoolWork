public class Car
{
   
    private int mpg;
    private int fuel;
    public Car()
    {
        mpg=0;
        fuel=0;
    }
    
    public Car(int m) 
    {
        mpg = m;
        fuel=0;
    }
    
    public int getGas()
    {
        return fuel;
    }
    
    public void addGas(int gas)
    {
        fuel+=gas;
    }
    
    public void drive(int miles)
    {
        double fuelUsed=miles/mpg;
        fuel-=fuelUsed;
    }
}