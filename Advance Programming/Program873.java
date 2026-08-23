import java.util.*;




class ArrayX
{
    protected int Arr[];
    protected int iSize;
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


      public void Display()
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

final class Seraching extends ArrayX
{

    public Seraching(int iSize){
 super(iSize);
    }
   
}

public class Program872 {
 
    public static void main(String A[])
    {
        Seraching sobj=new Seraching(5);
        sobj.accept();
        sobj.Display();
    }
    
}
