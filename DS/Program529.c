//4

//4*3*2*1=24

//5
//5*4*3*2*1=120
typedef unsigned long int ULONG;

#include <stdio.h>

 ULONG Factorail(int iNo)
{
ULONG ifact=1;
  
 while(iNo!=0)
 { 
  ifact=ifact*iNo;
     iNo--;
    
 }
  return ifact;
}
int main()
{
    
    int iValue=0;
  ULONG  iRet=0;
    printf("Enter the Frequency\n");
    scanf("%d",&iValue);
    iRet=Factorail(iValue);
    printf("Factorail is : %d\n",iRet);
    return 0;

}