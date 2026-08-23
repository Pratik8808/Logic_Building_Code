import java.util.*;

class Program864
{
    public static void main(String A[])
    {
        TreeMap <Integer,String>hobj=new TreeMap<Integer,String>();

        hobj.put(20,"C Programming");
        hobj.put(10,"java Programming");
        hobj.put(30,"C Programming");
     
        System.out.println(hobj);

        System.out.println(hobj.firstKey());
        System.out.println(hobj.lastKey());

        System.out.println(hobj.firstEntry());
        System.out.println(hobj.lastEntry());

        System.out.println(hobj.higherKey(20));
        System.out.println(hobj.lowerKey(20));

        
        
        


   

    }
}