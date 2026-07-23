//5678
// 8+ 7+ 6+ 5=

#include <stdio.h>
void Display(int Arr[],int iSize)
{ 
static int i=0;
if(i<iSize)
{
    i++;//ISSUE
    Display(Arr,iSize);
    printf("%d\n",Arr[i]);//INVAILD Data
}
    
}

int main()
{
    int Brr[]={10,20,30,40,50};
    Display(Brr,5);
    
  

}