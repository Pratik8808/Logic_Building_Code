import java.util.*;

class Program789
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        int iRow=0;
        int iCol=0;
        int i=0;
        int j=0;
        System.out.println("Enter the Number Rows");
        iRow=sobj.nextInt();

        System.out.println("Enter the number of Rows");
        iCol=sobj.nextInt();

        int Arr[][]=new int[iRow][iCol];


        System.out.println("Enter the ELements of Matrics :");

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }


         System.out.println("The Elements  of Matrics are :");

        for(i=0;i<iRow;i++)
        {
            for(j=0;j<iCol;j++)
            {
                System.out.print(Arr[i][j]+"\t");

            }
            System.out.println();
        }


        
    

    }
}