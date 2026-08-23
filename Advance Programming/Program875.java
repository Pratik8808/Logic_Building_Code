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

    public boolean LinearSerach(int iNo)
    {   boolean bflag=false;
        int i=0;
        for(i=0;i<super.iSize;i++)
        {
            if(Arr[i]==iNo)
            {
                bflag=true;
                break;
            }
        }

        return bflag;
    }


    public boolean BiDirectionalSerach(int iNo)
{
    int iStart=0;
    int iEnd=0;

    iStart=0;
    iEnd=super.iSize-1;
    boolean bflag=false;
    while(iStart<=iEnd)
    {
        if(Arr[iStart]==iNo ||Arr[iEnd]==iNo)
        {
            bflag=true;
            break;
        }
        iStart++;
        iEnd--;
    }
  return bflag;

}

   
}

public class Program875 {
 
    public static void main(String A[])
    {
        Seraching sobj=new Seraching(5);
        sobj.accept();
        sobj.Display();
        if(sobj.BiDirectionalSerach(30))
        {
            System.out.println("Element is Present \n");

        }
        else

        {
            System.out.println("Element is not Present\n");
          }
    }
    
}
