//4

//1+2+3+4+5=10

//7
//1+2+3+4+5+6+7=28

#include <stdio.h>

int Summation(int iNo)
{
  int iSum=0;
  int i=0;
  for(i=1;i<=iNo;i++)
  {
    iSum=iSum+i;
  }
  return iSum;
}
int main()
{
    
    int iValue=0;
    int iRet=0;
    printf("Enter the Frequency\n");
    scanf("%d",&iValue);
    iRet=Summation(iValue);
    print("%d",iRet)
    return 0;

}