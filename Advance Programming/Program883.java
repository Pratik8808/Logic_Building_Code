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

final class Searching extends ArrayX
{
    public Searching(int iSize)
    {
        super(iSize);
    }
    
    public boolean LinearSearch(int iNo)
    {
        int i = 0;
        boolean bFlag = false;

        for(i = 0; i < super.iSize; i++)
        {
            if(Arr[i] == iNo)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }

    public boolean BiDirectionalSearch(int iNo)
    {
        int iStart = 0, iEnd = 0;
        boolean bFlag = false;

        iStart = 0;
        iEnd = super.iSize-1;

        while(iStart <= iEnd)
        {
            if(Arr[iStart] == iNo || Arr[iEnd] == iNo)
            {
                bFlag = true;
                break;
            }

            iStart++;
            iEnd--;
        }

        return bFlag;
    }

    public boolean CheckSorted()
    {
        boolean bFlag = true;

        for(int i = 0; i < iSize-1; i++)
        {
            if(Arr[i] > Arr[i+1])
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }

    public boolean BinarySearch(int iNo)
    {
        int iStart = 0, iEnd = 0, iMid = 0;
        boolean bFlag = false;

        if(CheckSorted() == false)
        {
            return BiDirectionalSearch(iNo);
        }
        
        iStart = 0;
        iEnd = iSize-1;

        if((iNo < Arr[iStart]) || (iNo > Arr[iEnd]))
        {
            return false;
        }

        while(iStart <= iEnd)
        {
            iMid = iStart + ((iEnd - iStart) / 2);

            if(Arr[iMid] == iNo || Arr[iStart] == iNo || Arr[iEnd] == iNo)
            {
                bFlag = true;
                break;
            }
            else if(iNo < Arr[iMid])
            {
                iEnd = iMid - 1;
            }
            else if(iNo > Arr[iMid])
            {
                iStart = iMid + 1;
            }
        }

        return bFlag;
    }
}

class program883
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number of Elements  : ");
        int iSize = sobj.nextInt();

        Searching srobj = new Searching(iSize);

        srobj.Accept();
        srobj.Display();

        System.out.println("Enter the Element that you want to search");
        int iNo = sobj.nextInt();

        boolean bret = false;

        bret = srobj.BinarySearch(iNo);

        if(bret == true)
        {
            System.out.println("Element is Present in the Array");

        }
        else{
            System.out.println("No Present ");
        }

        srobj = null;

        System.gc();


        
        
    }
}









































// import java.util.*;




    // class ArrayX
    // {
    //     protected int Arr[];
    //     protected int iSize;
    //     public ArrayX(int iSize)
    //     {
    //         this.iSize=iSize-1;
    //         Arr=new int[iSize];
    //     }
    //     public void accept()
    //     {
    //         Scanner sobj=new Scanner(System.in);
    //         System.out.println("Enter the Elements of Array");

    //         for(int i=0;i<this.iSize;i++)
    //         {
    //             Arr[i]=sobj.nextInt();
    //         }
  
    //     }


    //     public void Display()
    //     {
    //         Scanner sobj=new Scanner(System.in);
    //         System.out.println("Elements of the Array are :");

    //         for(int i=0;i<this.iSize;i++)
    //         {
    //         System.out.println(Arr[i]);
    //         }
    //         System.out.println();
    //     }

    
        
    // }

    // final class Seraching extends ArrayX
    // {

    //     public Seraching(int iSize){
    // super(iSize);
    //     }

    //     public boolean LinearSerach(int iNo)
    //     {   boolean bflag=false;
    //         int i=0;
    //         for(i=0;i<super.iSize;i++)
    //         {
    //             if(Arr[i]==iNo)
    //             {
    //                 bflag=true;
    //                 break;
    //             }
    //         }

    //         return bflag;
    //     }


    //     public boolean BiDirectionalSerach(int iNo)
    // {
    //     int iStart=0;
    //     int iEnd=0;

    //     iStart=0;
    //     iEnd=super.iSize-1;
    //     boolean bflag=false;
    //     while(iStart<=iEnd)
    //     {
    //         if(Arr[iStart]==iNo ||Arr[iEnd]==iNo)
    //         {
    //             bflag=true;
    //             break;
    //         }
    //         iStart++;
    //         iEnd--;
    //     }
    // return bflag;

    // }

    // public boolean CheckSorted()
    // {
    //     boolean bFlag=true;

    //     for(int i=0;i<iSize-1;i++)
    //     {
    //         if(Arr[i]>Arr[i+1])
    //         {
    //             bFlag=false;
    //             break;

    //         }

    //     }
    //     return bFlag;
    // }

    // public boolean BinarySerach(int iNo)
    //     {
    //         int iMid=0;
    //         int istart=0;
    //         int iEnd=super.iSize;
    //         boolean bflag=false;

    //         if(CheckSorted()==false)
    //         {
    //             return BiDirectionalSerach(iNo);
    //         }

    //         if(iNo<Arr[istart] || iNo>Arr[iEnd])
    //         {
    //             return false;
    //         }
    //         while(istart<iEnd)
    //         {
    //         iMid=istart+((iEnd-istart)/2);
            
    //         if(Arr[iMid]==iNo||Arr[istart]==iNo||Arr[iEnd]==iNo)
    //         {
    //             bflag=true;
    //             break;
    //         }
    //         else if(iNo<Arr[iMid])
    //         {
    //             iEnd=iMid-1;
                

    //         }
    //         else 
    //         {
    //             istart=iMid+1;
    //         }
    //         }
        
    //         return bflag;



    //     }




    
    // }

    // public class Program883 {
    
    //     public static void main(String A[])
    //     {
    //         Scanner sobj=new Scanner(System.in);
           
            
    //         System.out.println("Enter the Number of Elements");
    //         int iSize=sobj.nextInt();

    //         Seraching srobj=new Seraching(iSize);

    //         srobj.accept();

    //         srobj.Display();

    //         System.out.println("Enter the Element that you wanted to serach ");
    //         int iNo=sobj.nextInt();
    //         boolean bRet=false;
    //         bRet=srobj.BinarySerach(iNo);

    //         if(bRet==true)
    //         {
    //             System.out.println("Element is Present in the Array");
    //         }
    //         else
    //         {
    //             System.out.println("ELement is Present in the Array");
    //         }

            

           
    //     }
        
    // }
