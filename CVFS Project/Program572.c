#include <stdio.h>
#include <fcntl.h> // file control  header file

int main()
{   
    int fd=0;
    fd=creat("Marvellous.txt",0777);

 if(fd==-1)
 {
    printf("Unable to create fille \n");
 }
 else
 {
    printf("File gets Sucessfully Created \n");

 }

    
    return 0;
}