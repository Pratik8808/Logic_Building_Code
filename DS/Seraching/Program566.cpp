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



int main()
{  Seraching sobj(5);
   sobj.Accept();
   sobj.Display();
   
    return 0;
}