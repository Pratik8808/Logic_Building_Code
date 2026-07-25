#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>

#define BUFFER_SIZE 100
int main()
{   
    int fd=0;
    int iRet=0;
    char Data[BUFFER_SIZE]={'\0'};
    // char DataX[100]={'\0'};

    fd=open("Marvellous.txt",O_RDONLY);

 if(fd==-1)
 {
    printf("Unable to Open  file \n");
 }
 else
 {
    printf("File gets Sucessfully Opened with  fd :%d \n",fd);
    iRet=read(fd,Data,13);

    printf("%d bytes get sucesssfully readed \n",iRet);
    printf("Data from file is :%s\n",Data);
   
    
    // Issue SOlved
    memset(Data,'\0',sizeof(Data));

    iRet=read(fd,Data,3);

    printf("%d bytes get sucesssfully readed \n",iRet);
    printf("Data from file is :%s\n",Data);

    close(fd);

 }

    
    return 0;
}