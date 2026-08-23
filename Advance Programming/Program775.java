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
      int imax=0;
      char result='\0';
      for(char cValue:hobj.keySet())
      {
        int temp=hobj.get(cValue);
        if(temp>imax)
        {
          imax=temp;
          result=cValue;
        }
         
      }

      System.out.println("The Maximum Character count is:"+imax+"  "+"Character is :"+result);

      

    }
}