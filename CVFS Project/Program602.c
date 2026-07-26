#include <stdio.h>
#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>
#include <sys/stat.h>
#define BUFFER_SIZE 1024

// Change in Parameter
void DisplayFileInformation(char Filename[])
{   struct stat sobj;
    stat(Filename,&sobj);

    printf("FileName : %s\n",Filename);
    printf("Inode Number : %lu \n",sobj.st_ino);
    printf("File Size is %lu\n",sobj.st_size);
    printf("blocks Block is  : %lu\n",sobj.st_blksize);


}

int main()
{
    
    char Fname[30]={'\0'};
    
    printf("Enter the File  Name : ");
    scanf("%[^'\n']s",Fname);
    int iRet=0;
    DisplayFileInformation(Fname);
   
    

    return 0;
}