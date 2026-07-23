//5678
// 8+ 7+ 6+ 5=

#include <stdio.h>
int Display(int Arr[],int iSize)
{ 
int i=0;
int iSum=0;
while(i<iSize)
{   iSum=iSum+Arr[i];
    i++;
}
return iSum;
    
}

int main()
{   int iRet=0;
    int Brr[]={10,20,30,40,50};
    iRet=Display(Brr,5);
    printf("Summation of Array Elments  : %d\n",iRet);
    
  

}