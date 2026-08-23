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

        int maxLength=0;
        String Result="";
        for(int i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].length()>=maxLength)
            {
                maxLength=Tokens[i].length();
                Result=Tokens[i];
            }

        }
        System.out.println("All Words With Maxium length");
         for(int i=0;i<Tokens.length;i++)
        {
            if(Tokens[i].length()==maxLength)
            {
                System.out.println(Tokens[i]);
            }
        }



        //System.out.println("Largest String is :"+Result+"Length of string is :"+maxLength);



    }
}