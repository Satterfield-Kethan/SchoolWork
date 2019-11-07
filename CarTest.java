public class CarTest
{
   public static void main(String[] args) 
   {
       
       Car VW = new Car(20);
       VW.addGas(20);
       VW.drive(100);
       System.out.println(VW.getGas());
       
    }
}
