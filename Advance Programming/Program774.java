import java.util.*;

class Program769
{
    public static void main(String[] args) 
    {
        Scanner sobj=new Scanner(System.in);
        HashMap <Character,Integer> hobj=new HashMap<Character,Integer>();
        System.out.println("Enter the String :");
        
        String str=sobj.nextLine();

        char Arr[]=str.toCharArray();
      

      for(char ch:Arr)
      {
        if(!hobj.containsKey(ch))
        {
          hobj.put(ch,1);
        }
        else
        {
          int icount=hobj.get(ch);
          hobj.put(ch,icount+1);
        }

      }

      for(char cValue:hobj.keySet())
      {
        System.out.println(cValue+"  occurs  "+hobj.get(cValue)+" times ");
      }

      

    }
}