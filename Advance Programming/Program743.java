// input: my name is pratik
//output: My Name Is Pratik

//Input :my IName is AmIt
// Output:My Name Is Amit
import java.util.*;
class Program742
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

         if(Arr[0]>='a' && Arr[0]<='z')
              {
                char temp=Arr[0];
                 temp=(char)(temp-32);
                 Arr[0]=temp;
              }
        for(int j=0;j<Arr.length;j++)
        {
           if(Arr[j]==' ') 
           {
              if(Arr[j+1]>='a' && Arr[j]<='z')
              {
                char temp=Arr[j+1];
                 temp=(char)(temp-32);
                 Arr[j+1]=temp;
              }

           
           }
        }
       

    System.out.println("Camel Case is : "+new String(Arr));

    }
}