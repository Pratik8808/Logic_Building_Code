#include <stdio.h>
#include <fcntl.h> // file control  header file
#include <unistd.h> // Only Linux Based OS


int main()
{   
    int fd=0;
    int iRet=0;

    fd=open("Marvellous.txt",O_RDWR|O_APPEND);

 if(fd==-1)
 {
    printf("Unable to Open  file \n");
 }
 else
 {
    printf("File gets Sucessfully Opened with  fd :%d \n",fd);
    iRet=write(fd,"Jay Ganesh...",13);
    printf("%d bytes get sucesssfully written \n",iRet);
    close(fd);

 }

    
    return 0;
}