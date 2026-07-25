#include <iostream>
using namespace std;

class Seraching
{
    private:
      int *Arr;
      int iSize;

    public:
        Seraching(int iNo);
        
        ~Seraching();
         void Accept();
         void Display();
       

         bool LinearSearch(int iNo);


    
};
Seraching::Seraching(int iNo)
{
    iSize=iNo;
    Arr=new int[iSize];
}
Seraching::~Seraching()
{
    delete [] Arr;
}
void Seraching::Accept()
{
    cout<<"Enter the Element \n";
    int i=0;
    for(i=0;i<iSize;i++)
    {
       cin>>Arr[i];
    }

}
void Seraching::Display()
{
     cout<<" Element  of Array are \n";
    int i=0;
    for(i=0;i<iSize;i++)
    {
      cout<<Arr[i]<<"\n";
    }
}

bool Seraching::LinearSearch(int iNo)
{
    bool bFlag=false;
    int i=0;
    for(int i=0;i<iSize;i++)
    {
        if(iNo==Arr[i])
        {
            bFlag=true;
            break;
        }
    }
    return bFlag;
}






int main()
{  Seraching sobj(5);
   bool bFlag=true;
   sobj.Accept();
   sobj.Display();
   bFlag=sobj.LinearSearch(30);

   if(bFlag)
   {
    cout<<"Element is Present \n";
   }
   else
   {
    cout<<"There is not Such Element \n";
   }
   
    return 0;
}