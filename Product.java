public class Product
{
   
    private String name;
    private double price;
    
    public Product(String n, double p) 
    {
        name = n;
        price = p;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double newPrice)
    {
        price=newPrice;
    }
    
    public String toString()
    {
        return "Name: "+ name + "\nPrice: " +price;
    }
}