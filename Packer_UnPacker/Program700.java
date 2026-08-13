class Program700
{
   public static void main(String[] args) {
      
      String header="marvellous";
      header.replaceAll("l", "L");//ISSUE
      System.out.println(header);
   }
}