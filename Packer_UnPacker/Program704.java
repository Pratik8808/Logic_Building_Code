class Program702
{
   public static void main(String[] args) {
      
      String header="    India   is   my   Country   ";
      System.out.println(header.length());
      header=header.trim();

      System.out.println(header.length());

      header=header.replaceAll("  "," ");
    
      System.out.println(header.length());


      
      header=header.replaceAll("  "," ");
      System.out.println(header.length());
    
   }
}