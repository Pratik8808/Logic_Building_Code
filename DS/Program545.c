//5678
// 8+ 7+ 6+ 5=

#include <stdio.h>
#include <string.h>

int strlenX(char *str)
{
   int iCount=0;
   while(*str !='\0')
   {
      iCount++;
      str++;
   }
   return iCount;
}

int main()
{  char Arr[20]={'\0'};
   int iRet=0;
   printf("Enter String : \n");
   scanf("%[^'\n']s",Arr);
   printf("%s\n",Arr);
   iRet=strlenX(Arr);

   printf("String Length is %d \n",iRet);
  

}
