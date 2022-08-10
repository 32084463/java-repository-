
/**
 * Write a description of class TestClass here.
 *
 * @author (Persie Mphphudi)
 * @version (17 August 2020)
 */
public class TestClass
{
  public static void main (String [] args)
  {
      
      Student stu = new Student(3,32084463,50,12345678);
      NormalWorker Nw = new NormalWorker(4,10,32084463,50,12345678);
      
      System.out.print("\f");
      System.out.println("\n  :" + stu + stu.discount());
      System.out.println("\n  :" + Nw + Nw.discount());
      
      
      Itunes I1 = new Student(2,32085564,70,14342424);
      Itunes I2 = new NormalWorker(2,12,35854432,70,12346483);
      System.out.print("\n I1: " + I1 + I1.discount());
      System.out.print("\n I1: " + I2 + I2.discount());
  }
}
