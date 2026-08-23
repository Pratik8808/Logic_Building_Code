import java.util.*;
import Marvellous.*;
class MatrixLB extends Matrix
{
    public MatrixLB(int iRow,int iCol)
    {
        super(iRow, iCol);
    }
}
class Program795
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

        MatrixLB mobj=new MatrixLB(iRow, iCol);

        mobj.Accept();;
        mobj.Display();


        mobj=null;
        System.gc();

        // int Arr[][]=new int[iRow][iCol];


       



        
    

    }
}