
/**
 * Write a description of class Student here.
 *
 * @author (Matome Mphaphudi)
 * @version (32084463)
 */
public class Student extends Itunes
{
    private  int ActiveYears;
     public Student()
    {
    }
  
  public Student(int ActiveYears,int StudentNo, double Amount, int EmpNumber)
  {
      super(StudentNo,Amount,EmpNumber);
      this.ActiveYears = ActiveYears;
  }
  public int getActiveYears()
  {
      return ActiveYears;
  }
  public void setActiveYears(int ActiveYears)
  {
      this.ActiveYears = ActiveYears;
  }
  public double discount()
  {
      double discount ;
      if(ActiveYears > 1)
      {
          discount = getAmount() * 0.50;
      }
      else
      {
          discount = getAmount() * 1;
      }
      return discount;
  }
  
  @Override
  public String toString()
  {
     return "Student with a student no : " + getStudentNo() + "got a discount of  :";  
  }
}
