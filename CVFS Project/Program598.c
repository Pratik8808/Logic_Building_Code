#include <stdio.h>
#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>

#define BUFFER_SIZE 1024

void DisplayFile(char Filename[])
{   int fd=0, iRet=0; 
    char Buffer[BUFFER_SIZE]={'\0'};

    fd=open(Filename,O_RDONLY);
    if(fd==-1)
    {
        printf("Unable to open file \n");
        return;
    }
    while((iRet==read(fd,Buffer,sizeof(Buffer)))!=0)
    {
        write(1,Buffer,iRet);
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fd);

}

int main()
{
    
    char Fname[30]={'\0'};
    
    printf("Enter the File  Name : ");
    scanf("%[^'\n']s",Fname);

    DisplayFile(Fname);
    

    return 0;
}