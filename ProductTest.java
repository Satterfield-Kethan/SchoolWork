import java.util.*;
public class ProductTest
{
   public static void main(String[] args) 
   {
       Scanner keyboard = new Scanner (System.in);
       Product p1 = new Product("Tooth Paste", 4000.99);
       Product p2= new Product("Soap", 2000.03);
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       double newPrice1 = p1.getPrice()-5;
       double newPrice2 = p2.getPrice()-5;
       p1.setPrice(newPrice1);
       p2.setPrice(newPrice2);
       System.out.println(p1.toString());
       System.out.println(p2.toString());
   }
}
