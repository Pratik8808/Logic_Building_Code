// input: my name is pratik
//output: My Name Is Pratik

//Input :my IName is AmIt
// Output:My Name Is Amit
import java.util.*;
class Program736
{

    public static void main(String[] A) 
    {   
        Scanner sobj=new Scanner(System.in);


        System.out.println("Enter the String");
        String str=sobj.nextLine();

        str=str.trim();
        str=str.replace("\\s", " ");
        str=str.toLowerCase();

        System.out.println(str);

         char Arr[]=str.toCharArray();
        for(int i=0;i<Arr.length; i++);
        {
           System.out.println(Arr[i]);
        }

    }
}