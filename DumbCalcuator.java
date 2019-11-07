import java.util.*;
public class DumbCalcuator
{
    public static void main (String [] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Welcome to my Java Dumb Calculator\nEnter a number, a space, and a character: ");
        char op;

        String in = key.nextLine();
        String partOne=in.substring(0,in.indexOf(" "));
        double num1=Double.parseDouble(partOne);
        DumbCalcFacts calc = new DumbCalcFacts(num1);

        System.out.println("= "+num1);
        do{    
            String in2=  key.nextLine();
            partOne=in2.substring(0,in2.indexOf(" "));
            double num2=Double.parseDouble(partOne);

            String partTwo=(in2.substring(in2.length()-1)).toUpperCase();
            op=partTwo.charAt(0);

            while(op!='S' && op!='E' && op!='+' && op!='-' && op!='*' && op!='/')
            {
                System.out.println("Invalid Command\n= "+num2);
                in2 = key.nextLine();
                partOne=in2.substring(0,in2.indexOf(" "));
                num2=Double.parseDouble(partOne);
                partTwo=(in2.substring(in2.length()-1)).toUpperCase();
                op=partTwo.charAt(0);
            }

            if(op=='+')
            {
                calc.add(num2);
                System.out.println("= "+calc.getNum());
            }
            else if(op=='-')
            {
                calc.sub(num2);
                System.out.println("= "+calc.getNum());
            }
            else if(op=='*')
            {
                calc.mult(num2);
                System.out.println("= "+calc.getNum());
            }
            else if(op=='/')
            {
                if(num2!=0)
                {
                    calc.devide(num2);
                    System.out.println("= "+calc.getNum());
                }
                else
                    System.out.println("Devide by zero error\n= "+calc.getNum());
            }
            else if (op=='S')
            {
                calc.setNum(num2);
                System.out.println("= "+calc.getNum());
            }

        }while(op!='E');
        System.out.println("End of Program");
    }
}
