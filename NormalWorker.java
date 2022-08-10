
/**
 * Write a description of class NormalWorker here.
 *
 * @author (Mphaphudi Matome)
 * @version (32084463)
 */
public class NormalWorker extends Itunes
{
  private int numYears;
    private int leaveNum;
    
     public NormalWorker()
     {
     }
    
    public NormalWorker(int numYears, int leaveNum,int StudentNo, double Amount, int EmpNumber)
    {
      super(StudentNo,Amount,EmpNumber);
      this.numYears = numYears;
      this.leaveNum = leaveNum;
    }
    public int getnumYears()
    {
        return numYears;
    }
    public int getleaveNum()
    {
        return leaveNum;
    }
    public void setnumYears(int numYears)
    {
        this.numYears = numYears;
    }
    public void setleaveNum()
    {
        this.leaveNum = leaveNum;
    }
    public double discount()
    {
        double discount;
        if(numYears > 5 && leaveNum < 15)
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
        return "Normal worker with a  Employee  number  :" + getEmpNumber() + "got a discount of  :";
    }
}
