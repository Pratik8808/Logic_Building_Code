//4

//4*3*2*1=24

//5
//5*4*3*2*1=120

#include <stdio.h>

 unsigned long int Factorail(int iNo)
{
unsigned long int ifact=1;
  
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
  unsigned long int iRet=0;
    printf("Enter the Frequency\n");
    scanf("%d",&iValue);
    iRet=Factorail(iValue);
    printf("Factorail is : %d\n",iRet);
    return 0;

}