
/**
 * Write a description of class ITUNES here.
 *
 * @author (Matome Mphaphudi)
 * @version (32084463)
 */
public abstract class Itunes
{
    private int StudentNo;
    private double Amount;
    private int EmpNumber;
    
    
    public Itunes()
    {
    }
    
    public Itunes(int StudentNo, double Amount, int EmpNumber)
    {
        this.StudentNo = StudentNo;
        this.Amount = Amount;
        this.EmpNumber = EmpNumber;
    }
    public int getStudentNo()
    {
        return StudentNo;
    }
    public double getAmount()
    {
        return Amount;
    }
    public int getEmpNumber()
    {
        return EmpNumber;
    }
    public void setStudentNo(int StudentNo)
    {
        this.StudentNo = StudentNo;
        
    }
    public void setAmount(double Amount)
    {
        this.Amount = Amount;
    }
    public void setEmpNumber(int EmpNumber)
    {
        this.EmpNumber = EmpNumber;
    }
    
    public abstract double discount();
}
