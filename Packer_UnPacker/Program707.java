import java.util.*;
class Program704
{
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=null;

    System.out.println("Enter the String");
    str=sc.nextLine();

    System.out.println("Input string is "+str+"having length:"+str.length());

    str=str.trim();
    
    System.out.println("After Trime Input string is "+str+"having length:"+str.length());
    str=str.replaceAll(" ", "");
        System.out.println("After Trime Input string is "+str+"having length:"+str.length());
    
   }
}