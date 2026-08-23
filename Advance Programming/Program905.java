
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
    private node first;
    private int iCount;
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

    public int Count()
    {
        return iCount;
    }

    public void  Display()
{
    node temp=null;
    temp=first;
    while(temp!=null)
    {
        System.out.print("|"+temp.data+"|"+"->");
        temp=temp.next;
    }
    System.out.println("null");
}

public void InsertLast(int iNo)
{   node newn=new node(iNo);
    if(first==null)
    {
        first=newn;
        
    }
    else
    {
        node temp=null;
        temp=first;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newn;
    }
    iCount++;
}

public int MiddleElement()
{
   int iCount=Count();

   int Middle=(iCount/2);
    node temp=null;
    temp=first;
   for(int i=0;i<=Middle;i++)
   {
    temp=temp.next;
   }

return temp.data;
    
}
}
public class Program905
{    
    public static void main(String[] args) 
    {
        int iret=0;
        singlyll sobj=new singlyll();
        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);
        sobj.InsertFirst(101);
        sobj.InsertLast(111);


        sobj.Display();
        iret=sobj.Count();

        System.out.println("Number if linkedlist are "+iret);

        iret=sobj.MiddleElement();

        System.out.println("Middle element is :"+iret);
        
    }
}

