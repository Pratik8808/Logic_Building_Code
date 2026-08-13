import java.util.*;

class Program734
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




    }
}