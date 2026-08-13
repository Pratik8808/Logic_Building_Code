import java.util.*;


class  StringX
{
   int Countword(String str)
   {
    

    str=str.trim();

    str=str.replaceAll("\\s+", " ");
    String Tokens[]=str.split(" ");

    return Tokens.length;

   }
}
class Program713
{
   
   public static void main(String[] args) {
   StringX strobj=new StringX();
    Scanner sc=new Scanner(System.in);
    int iRet=0;
    String str=null;

    System.out.println("Enter the String");
    str=sc.nextLine();

    iRet=strobj.Countword(str);

    System.out.println("Number of Words are :"+iRet);
    


    System.out.println("Input string is "+str+"having length:"+str.length());
    
    
   }
}