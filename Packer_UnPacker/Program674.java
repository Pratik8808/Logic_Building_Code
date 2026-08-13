import java.util.Scanner;
import java.io.*;

class Program674
{

    public static void main(String[] args) 
    {  
        String Data="Marvellous InfoSystem";
        byte Arr[]=Data.getBytes();
        
        System.out.println(Data.length());
        System.out.println(Arr.length);

        for(int i=0;i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }

        
    }

}