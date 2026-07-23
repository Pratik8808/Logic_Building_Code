
#include <iostream>
using namespace std;
template <class X>
X Maximum(X  No1,X No2)
{
    X Ans=0;
    if(No1>No2)
    {
        Ans=No1;
    }
    else
    {

        Ans=No2;
    }
    
    return Ans;
}

int main()
{
   cout<<"Largest Number is :"<< Maximum(21.5f,11.2f)<<"\n";
      cout<<"Largest Number is :"<< Maximum(21.5,11.2)<<"\n";
      cout<<"Largest Number is :"<< Maximum(21,11)<<"\n";

      
     
     

    


    return 0;
}