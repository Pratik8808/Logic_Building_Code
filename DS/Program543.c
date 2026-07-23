











//5678
// 8+ 7+ 6+ 5=

#include <stdio.h>
int Display(int Arr[],int iSize)
{ 
 static int i=0;
static int iSum=0;
if(i<iSize)
{   iSum=iSum+Arr[i];
    i++;
    Display(Arr,iSize);
}
return iSum;
    
}

int main()
{   int iRet=0;
    int Brr[]={10,20,30,40,50};
    iRet=Display(Brr,5);
    printf("Summation of Array Elments  : %d\n",iRet);
    
  

}