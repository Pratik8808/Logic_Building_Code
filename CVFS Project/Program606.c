#include <stdio.h>
#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>

#define BUFFER_SIZE 1024

// Change in Parameter
int SmallCharacter(char *Filename)
{   int fd=0, iRet=0; 
    int iCount=0;
    char Buffer[BUFFER_SIZE]={'\0'};

    fd=open(Filename,O_RDONLY);
    if(fd==-1)
    {
        printf("Unable to open file \n");
        return iRet;
    }
    while((iRet=read(fd,Buffer,sizeof(Buffer)))!=0)
    {  // Acutally Excel accodrian is 608 for  excel addition
        // write(1,Buffer,iRet);
        for(int i=0;i<iRet;i++)
        {
            if(Buffer[i]>'a' && Buffer[i]<='z')
            {
                iCount++;
            }
        }
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fd);

    return iCount;

}

int main()
{
    
    char Fname[30]={'\0'};
    
    printf("Enter the File  Name : ");
    scanf("%[^'\n']s",Fname);

    int iRet=SmallCharacter(Fname);
    printf("Total Small Character are %d\n",iRet);
    

    return 0;
}