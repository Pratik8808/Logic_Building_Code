class Program720
{
   public static void main(String[] args) {
      
      String header="hello.txt 1078";
      System.out.println("Acutally Header length :"+header.length()); //8
      
      
      System.out.println("Number of White spaces we need  :"+(100-header.length())); //11
      int Size=(100-header.length());
      for(int i=1;i<=Size;i++)
      {
         header=header+" ";
         
         
      }

      System.out.println("Udated Header length is :"+header.length());

     
   }
}