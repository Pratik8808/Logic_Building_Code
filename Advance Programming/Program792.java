import java.util.*;

class Matrix
{
    public int Arr[][];
    public int iRow;
    public int iCol;
    public Matrix(int iRow,int iCol)
    {
        this.iRow=iRow;
        this.iCol=iCol;
        Arr=new int[iRow][iCol];
        System.out.println("Inside Matrix Constructor");
    }

    protected void finalize()
    {
        System.out.println("Inside  Finalize Method");
        Arr=null;
        System.gc();
    }

    public void Accept()
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
class Program792
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=0;
        int iCol=0;
        
        System.out.println("Enter the Number Rows");
        iRow=sobj.nextInt();

        System.out.println("Enter the number of Rows");
        iCol=sobj.nextInt();

        Matrix mobj=new Matrix(iRow, iCol);

        mobj.Accept();;
        mobj.Display();


        mobj=null;
        System.gc();

        // int Arr[][]=new int[iRow][iCol];


       



        
    

    }
}