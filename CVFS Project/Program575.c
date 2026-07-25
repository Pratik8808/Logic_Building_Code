#include <stdio.h>
#include <fcntl.h> // file control  header file
#include <unistd.h> // Only Linux Based OS


int main()
{   
    int fd=0;
    fd=open("Marvellous.txt",O_RDONLY);

 if(fd==-1)
 {
    printf("Unable to Open  file \n");
 }
 else
 {
    printf("File gets Sucessfully Opened with  fd :%d \n",fd);
    close(fd);

 }

    
    return 0;
}