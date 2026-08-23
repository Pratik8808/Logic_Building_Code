import java.util.*;

class Program778
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        HashMap <String,Integer> hobj=new HashMap<String,Integer>();
        
       System.out.println("Enter the String :");
       String str=sobj.nextLine();

       str=str.trim();
       str=str.replaceAll("\\s+"," ");

       String Tokens[]=str.split(" ");
       for(String s:Tokens)
       {
         if(hobj.containsKey(s))
         {
         
            hobj.put(s, hobj.get(s)+1);
         }
         else{
            hobj.put(s,1);
         }
       }


       System.out.println("Frequency of All Unique words are :");

       for(String sValue:hobj.keySet())
       {
         System.out.println(sValue);
       }

     
    

    }
}