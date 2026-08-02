#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>

int main()
{   
    int fd=0;
    int iRet=0;
    char Data[]="Marvellous InfoSystems";

    fd=open("Marvellous.txt",O_RDWR|O_APPEND);

 if(fd==-1)
 {
    printf("Unable to Open  file \n");
 }
 else
 {
    printf("File gets Sucessfully Opened with  fd :%d \n",fd);
             // kashat karche  ,// kuthun karche means buffer or arr ,//size kite kache ahe 
    iRet=write(fd,Data,strlen(Data));

    printf("%d bytes get sucesssfully written \n",iRet);
    close(fd);

 }

    
    return 0;
}