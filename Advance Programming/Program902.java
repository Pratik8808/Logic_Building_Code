
class node 
{
    public int data;
    public node next;
  public  node(int data)
    {
        this.data=data;
        this.next=null;

    }


}

class singlyll
{
    public node first;
    public int iCount;
    public singlyll()
    {
        this.first=null;
        this.iCount=0;
    }

    public void InsertFirst(int iNo)
    {
        node newn=new node(iNo);
      
        {
            newn.next=first;
            first=newn;
            iCount++;
        }
    }
    
}
public class Program902
{    
    public static void main(String[] args) 
    {
        singlyll sobj=new singlyll();
        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);
        
    }
}
