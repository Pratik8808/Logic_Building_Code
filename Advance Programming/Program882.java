    import java.util.*;




    class ArrayX
    {
        protected int Arr[];
        protected int iSize;
        public ArrayX(int iSize)
        {
            this.iSize=iSize-1;
            Arr=new int[iSize];
        }
        public void accept()
        {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Enter the Elements of Array");

            for(int i=0;i<this.iSize;i++)
            {
                Arr[i]=sobj.nextInt();
            }
        }


        public void Display()
        {
            Scanner sobj=new Scanner(System.in);
            System.out.println("Elements of the Array are");

            for(int i=0;i<this.iSize;i++)
            {
            System.out.println(Arr[i]);
            }
            System.out.println();
        }

    
        
    }

    final class Seraching extends ArrayX
    {

        public Seraching(int iSize){
    super(iSize);
        }

        public boolean LinearSerach(int iNo)
        {   boolean bflag=false;
            int i=0;
            for(i=0;i<super.iSize;i++)
            {
                if(Arr[i]==iNo)
                {
                    bflag=true;
                    break;
                }
            }

            return bflag;
        }


        public boolean BiDirectionalSerach(int iNo)
    {
        int iStart=0;
        int iEnd=0;

        iStart=0;
        iEnd=super.iSize-1;
        boolean bflag=false;
        while(iStart<=iEnd)
        {
            if(Arr[iStart]==iNo ||Arr[iEnd]==iNo)
            {
                bflag=true;
                break;
            }
            iStart++;
            iEnd--;
        }
    return bflag;

    }

    public boolean CheckSorted()
    {
        boolean bFlag=true;

        for(int i=0;i<iSize-1;i++)
        {
            if(Arr[i]>Arr[i+1])
            {
                bFlag=false;
                break;

            }

        }
        return bFlag;
    }

    public boolean BinarySerach(int iNo)
        {
            int iMid=0;
            int istart=0;
            int iEnd=super.iSize;
            boolean bflag=false;

            if(CheckSorted()==false)
            {
                return BiDirectionalSerach(iNo);
            }

            if(iNo<Arr[istart] || iNo>Arr[iEnd])
            {
                return false;
            }
            while(istart<iEnd)
            {
            iMid=istart+((iEnd-istart)/2);
            
            if(Arr[iMid]==iNo||Arr[istart]==iNo||Arr[iEnd]==iNo)
            {
                bflag=true;
                break;
            }
            else if(iNo<Arr[iMid])
            {
                iEnd=iMid-1;
                

            }
            else 
            {
                istart=iMid+1;
            }
            }
        
            return bflag;



        }




    
    }

    public class Program882 {
    
        public static void main(String A[])
        {
            Seraching sobj=new Seraching(7);
            sobj.accept();
            sobj.Display();
            if(sobj.BinarySerach(35))
            {
                System.out.println("Element is Present \n");

            }
            else

            {
                System.out.println("Element is not Present\n");
            }
        }
        
    }
