public class Student
{
    private String name;
    public double totalQuiz=0;
    public int number=0;
    
    public Student(String n) 
    {
        name = n;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void addQuiz(double score)
    {
        totalQuiz+=score;
        number++;
    }
    
    public double getTotalScore()
    {
        return totalQuiz;
    }
    
    public double getAverageScore()
    {
        return totalQuiz/number;
    }
}