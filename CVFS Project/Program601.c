#include <stdio.h>
#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>
#include <sys/stat.h>
#define BUFFER_SIZE 1024

// Change in Parameter
int CalculateFileSize(char Filename[])
{   struct stat sobj;
    stat(Filename,&sobj);

    return sobj.st_size;


}

int main()
{
    
    char Fname[30]={'\0'};
    
    printf("Enter the File  Name : ");
    scanf("%[^'\n']s",Fname);
    int iRet=0;
    iRet=CalculateFileSize(Fname);
    if(iRet!=-1)
    {

        printf("The size of the  file is %d bytes \n",iRet);
    }
    

    return 0;
}