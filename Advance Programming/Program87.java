import java.util.*;

interface GetterSetter
{
    void display();
    void accept();
}

class ArrayX implements GetterSetter
{
    public int Arr[];
    public int iSize;
     public ArrayX(int iSize)
     {
        this.iSize=iSize;
        Arr=new int[iSize];
        
     }
     public void accept()
     {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the Elements of Array");

        for(int i=0;i<this.iSize;i++)
        {
            Arr[i]=sobj.nextInt();
        }
     }


      public void display()
     {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Elements of the Array are");

        for(int i=0;i<this.iSize;i++)
        {
          System.out.println(Arr[i]);
        }
        System.out.println();
     }

}
public class Program870 {
 
    public static void main(String A[])
    {
        ArrayX aobj=new ArrayX(5);
        aobj.accept();
        aobj.display();
    }
    
}
