#include <stdio.h>
#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>

#define BUFFER_SIZE 1024

// Change in Parameter
void FileCopy(char   FileNameSrc[], char  FileNameDest[])
{   
    
    int fdSrc=0,fdDest =0, iRet=0;
    char Buffer[BUFFER_SIZE]={'\0'};

    fdSrc=open(FileNameSrc,O_RDONLY);
    if(fdSrc==-1)
    {
        printf("Unable to open Soruce File: \n");
        return;
    }
    fdDest=creat(FileNameDest,0777);
     if(fdDest == -1)
    {
        printf("Unable to open Destintion File: \n");
        return;
    }

    while((iRet=read(fdSrc,Buffer,sizeof(Buffer)))!=0)
    {  write(fdDest,Buffer,iRet);
        memset(Buffer,'\0',sizeof(Buffer));
        
       
    }
    close(fdSrc);
    close(fdDest);

}

int main()
{
    
    char FnameSrc[30]={'\0'};
    char FnameDest[30]={'\0'};

    
    printf("Enter the Source File  Name :\n ");
    scanf("%[^'\n']s",FnameSrc);

      printf("Enter the Destionation File  Name :\n ");
    scanf("%[^'\n']s",FnameDest);// ISSUe due \n  make think that it is enter next entry too


    int iRet=0;
    FileCopy(FnameSrc,FnameDest);
    
    

    return 0;
}