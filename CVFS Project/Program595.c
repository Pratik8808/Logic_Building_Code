#include <stdio.h>
#include <fcntl.h> 
#include <unistd.h> 
#include <string.h>
#define BUFFER_SIZE 1024

// 0 for stdin
// 1 for stdout
//2 for stderror   

// This is Present in Uarea of of Array

int main()
{
   write(1,"Jay Ganesh...",13);


    return 0;
}