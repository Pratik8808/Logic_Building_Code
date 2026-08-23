import java.util.*;

class Matrix
{
    protected int Arr[][];
    protected int iRow;
    protected int iCol;
    public Matrix(int iRow,int iCol)
    {
        this.iRow=iRow;
        this.iCol=iCol;
        Arr=new int[iRow][iCol];
        System.out.println("Inside Matrix Constructor");
    }


     void Accept()
    {
     Scanner sobj=new Scanner(System.in);
         System.out.println("Enter the ELements of Matrics :");

        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }


    }
    public void Display()
    {


         System.out.println("The Elements  of Matrics are :");

        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                System.out.print(Arr[i][j]+"\t");

            }
            System.out.println();
        }
    }
}

class MatrixLB extends Matrix
{
    public MatrixLB(int iRow,int iCol)
    {
        super(iRow, iCol);
    }
    public int SummationAll()
    {
        int iSum=0;
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                iSum=Arr[i][j];
            }
        }
        return iSum;
    }

       public void SummationRow()
    {
        
        for(int i=0;i<iRow;i++)
        {  int iSum=0;
            for(int j=0;j<iCol;j++)
            {
                iSum=Arr[i][j];
            }

            System.out.println("The Sum of row: "+i+": "+iSum);
        }
        
    }



      public int MaximumAll()
    {
       int iMax=0;
       iMax=Arr[0][0];
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                if(iMax<Arr[i][j])
                {
                    iMax=Arr[i][j];
                }

            }

        }
        return iMax;
      
    }


          public int MinimumAll()
    {
       int iMin=0;
       iMin=Arr[0][0];
        for(int i=0;i<iRow;i++)
        {
            for(int j=0;j<iCol;j++)
            {
                if(iMin>Arr[i][j])
                {
                    iMin=Arr[i][j];
                }

            }

        }
        return iMin;
      
    }
}
class Program800
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=0;
        int iCol=0;
        int iRet=0;
        
        System.out.println("Enter the Number Rows");
        iRow=sobj.nextInt();

        System.out.println("Enter the number of Rows");
        iCol=sobj.nextInt();

        MatrixLB mobj=new MatrixLB(iRow, iCol);

        mobj.Accept();;
        mobj.Display();
        iRet=mobj.MaximumAll();
        System.out.println("Maximum Element is "+iRet);

              iRet=mobj.MinimumAll();
        System.out.println("Minimum Element is "+iRet);


        mobj=null;
        System.gc();

        // int Arr[][]=new int[iRow][iCol];


       



        
    

    }
}