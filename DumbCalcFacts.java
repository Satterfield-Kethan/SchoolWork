
public class DumbCalcFacts
{
    double intitNum;
    public DumbCalcFacts(double num)
    {
        intitNum=num;
    }

    public double getNum()
    {
        return intitNum;
    }

    public void setNum(double num)
    {
        intitNum=num;
    }

    public void add(double num)
    {
        intitNum+=num;
    }

    public void sub(double num)
    {
        intitNum-=num;
    }

    public void mult(double num)
    {
        intitNum*=num;
    }

    public void devide(double num)
    {
        intitNum/=num;
    }

}
