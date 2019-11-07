
public class StudentTest
{
   public static void main(String[] args) 
   {
       Student st1 = new Student("Kethan");
       st1.addQuiz(100);
       st1.addQuiz(100);
       st1.addQuiz(75);
       st1.addQuiz(75);
       System.out.println(st1.getTotalScore());
       System.out.println(st1.getAverageScore());
   }
}
