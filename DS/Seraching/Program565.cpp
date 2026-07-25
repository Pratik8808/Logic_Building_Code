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
int main()
{  Seraching sobj(5);
    return 0;
}