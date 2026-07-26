#include <stdio.h>
#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>

#define BUFFER_SIZE 1024

// Change in Parameter
int CalculateFileSize(char Filename[])
{   int fd=0, iRet=0,iSize=0; 
    char Buffer[BUFFER_SIZE]={'\0'};

    fd=open(Filename,O_RDONLY);
    if(fd==-1)
    {
        printf("Unable to open file \n");
        return -1;
    }
// Take hard disk memory to Ram 
    while((iRet=read(fd,Buffer,sizeof(Buffer)))!=0)
    {   iSize=iRet+iSize;
        
       
    }
    close(fd);
    return iSize;

}

int main()
{
    
    char Fname[30]={'\0'};
    
    printf("Enter the File  Name : ");
    scanf("%[^'\n']s",Fname); // ISSUe due \n  make think that it is enter next entry too
    int iRet=0;
    iRet=CalculateFileSize(Fname);
    if(iRet!=-1)
    {

        printf("The size of the  file is %d bytes \n",iRet);
    }
    

    return 0;
}