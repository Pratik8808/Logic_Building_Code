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

   void Display(String str)
   {
    str=str.trim();

    str=str.replaceAll("\\s+", " ");
    String Tokens[]=str.split(" ");

    for(int i=0;i<Tokens.length;i++)
    {
      System.out.println(Tokens[i]+" : "+ Tokens[i].length());
    }

   }

    void LargestWord(String str)
   {
    str=str.trim();

    str=str.replaceAll("\\s+", " ");
    String Tokens[]=str.split(" ");
    int largest=0;
    String Result="";
    for(int i=0;i<Tokens.length;i++)
    {
      if(Tokens[i].length()>Result.length())
      {
         Result=Tokens[i];
      }

    }
    System.out.println("Largest word is  :"+Result);

   }


}
class Program717
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
    strobj.Display(str);

    strobj.LargestWord(str);
    


   //  System.out.println("Input string is "+str+"having length:"+str.length());
    
    
   }
}