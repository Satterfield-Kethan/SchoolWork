public class Employee
{
   
    private String name;
    private double salary;
    public Employee()
    {
        name="";
        salary=0;
    }
    public Employee(String n, double s) 
    {
        //Intialise instance vairbles
        name = n;
        salary = s;
    }
    
    public void raiseSalary(double percent)
    {
        double decimalRate=percent / 100;
        double newSalary=decimalRate*salary;
        salary=newSalary;
    }
}