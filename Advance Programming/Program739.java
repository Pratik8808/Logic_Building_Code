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
        String Tokens[]=str.split(" ");

        System.out.println("Number of Words :"+Tokens.length);

       
        String Result=Tokens[0];
        for(int i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].length()>Result.length())
            {
                
                Result=Tokens[i];
            }
        }

        System.out.println("Largest String is :"+Result+"Length of string is :"+Result.length());



    }
}