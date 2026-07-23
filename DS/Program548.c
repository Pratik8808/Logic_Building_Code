//5678
// 8+ 7+ 6+ 5=

#include <stdio.h>
#include <string.h>

int CountCaptial(char *str)
{
 static  int iCount=0;
   if(*str !='\0')
   {
      if(*str>='A' && *str <='Z')
      {

         iCount++;
      }
      str++;
      CountCaptial(str);
   }
   return iCount;
}

int main()
{  char Arr[20]={'\0'};
   int iRet=0;
   printf("Enter String : \n");
   scanf("%[^'\n']s",Arr);
   iRet=CountCaptial(Arr);

   printf("Number of Capital Lettes are :  %d \n",iRet);
  

}
