#include <iostream>
using namespace std;

class ArrayX
{
    public:
        int *Arr;
        int Size;

        ArrayX(int No)
        {   Size=No;
            Arr=new int[Size];
        }
        ~ArrayX()
        {
            delete[]Arr;
        }

        void Accept()
        {   int i=0;
            cout<<"Enter the Element:\n";
            for(i=0;i<Size;i++)
            {
                cin>>Arr[i];
            }
        }

    void Display()
    { int i=0;
          cout<<" Element of Array Are:\n";
            for(i=0;i<Size;i++)
            {
               cout<<Arr[i]<<"\n";
            }
        
}

    int Summation()
    { int i=0;
        int Sum=0;
            for(i=0;i<Size;i++)
            {
              Sum=Sum+Arr[i];
            }
            return Sum;
        }

};
int main()
{
    ArrayX aobj(5);
    aobj.Accept();
    aobj.Display();
    cout<<aobj.Summation()<<endl;
    


    return 0;
}