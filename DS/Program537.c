//5678
// 8+ 7+ 6+ 5=

#include <stdio.h>
int Summation(int iNo)
{
    static int iSum=1;
    int iDigit=0;
    if(iNo!=0)
    {
        iDigit=iNo%10;
        iSum=iSum*iDigit;
        Summation(iNo/10);
       

    }
    return iSum;
}

int main()
{
    
    int iValue=0;
    int iRet=0;
    printf("Enter the Number\n");
    scanf("%d",&iValue);
    iRet=Summation(iValue);

    printf("Summation of all Digits is %d\n",iRet);
    return 0;

}