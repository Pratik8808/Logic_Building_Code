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
           int temp= hobj.get(s);
            hobj.put(s, temp+1);
         }
         else{
            hobj.put(s,1);
         }
       }


       System.out.println(hobj);

     
    

    }
}