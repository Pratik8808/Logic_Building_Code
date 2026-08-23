import java.util.*;

interface GetterSetter
{
    void Accept();
    void Display();
}




class ArrayX implements GetterSetter
{
    protected int Arr[];
    protected int iSize;

    public ArrayX(int iSize)
    {
        this.iSize = iSize;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements of array");

        for(int i = 0; i < this.iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of the array are : ");

        for(int i = 0; i < this.iSize; i++)
        {
            System.out.print(Arr[i]+"\t");
        }

        System.out.println();
    }
}














final class Sorting extends ArrayX
{
    public boolean IsSorted;
    public Sorting(int iSize)
    {
        super(iSize);
        IsSorted=false;
    }
    public void BubbleSort()
    {
        if(IsSorted==true)
        {
            return;
        }
        int i=0,j=0,temp=0,pass=0;
        for(i=0;i<iSize-1;i++,pass++)
        {
        
            for(j=0;j<iSize-1-i;j++)
            {
                if(Arr[j]>Arr[j+1])
                {
                    temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;
                }
                
                System.out.println("Data After  pass :"+pass);
                Display();
            }
        }
        IsSorted=true;


        
    }

     public void BubbleSortEfficient()
    {
        int i=0,j=0,temp=0,pass=0;

        boolean bflag=false;
        bflag=true;

        if(IsSorted==true)
        {
            return;
        }
        for(i=0;(i<iSize-1);i++)
        {   
            if(bflag==false)
            {
                break;
            }
            bflag=false;
            for(j=0;j<iSize-1-i;j++)
            {
                if(Arr[j]>Arr[j+1])
                {
                    temp=Arr[j];
                    Arr[j]=Arr[j+1];
                    Arr[j+1]=temp;
                    bflag=true; //IMP
                }
                
               
            }
         
        }
        IsSorted=true;


        
    }


    public void SelectionSort()
    {
        int i=0,j=0,temp=0;
        int min_index=0;
        if(IsSorted==true)
        {
            return;
        }
        int pass=0;

        for(i=0,pass=1;i<iSize-1;i++,pass++)
        {
            min_index=i;
            for(j=i+1;j<iSize;j++)
            {
                if(Arr[j]<Arr[min_index])
                {
                    min_index=j;
                }

            }
          
            temp=Arr[i];
            Arr[i]=Arr[min_index];
            Arr[min_index]=temp;
            System.out.println("Pass of Arrays is"+pass);
            Display();


        }

            IsSorted=true;
    }

    public void InsertionSort()
    {
        int i=0,j=0;
        int Selected=0;
        if(IsSorted==true)
        {
            return;

        }
        for(i=1;i<iSize;i++)
        {
            for(j=i-1,Selected=Arr[i];(j>=0) && (Arr[j]>Selected);j--)
            {
                Arr[j+1]=Arr[j];
            }
            Arr[j+1]=Selected;
        }
    IsSorted=true;
    }

}

class Program899
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements  : ");
        int iSize=sobj.nextInt();
        
        Sorting srobj=new Sorting(iSize);
        srobj.Accept();
        

        srobj.InsertionSort();

    
        System.out.println("Final Sorted Array :");
        srobj.Display();

    }
}








































