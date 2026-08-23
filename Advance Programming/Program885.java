import java.util.*;

class Program885
{
    public static void main(String[] A) 
    {
        int Arr[]={10,13,7,21,15};

        for(int no:Arr)
        {
            System.out.print(no+"\t ");
        }
        System.out.println();

        Arrays.sort(Arr);

        for(int no:Arr)
        {
            System.out.print(no+"\t ");
        }
        System.out.println();
    }
}