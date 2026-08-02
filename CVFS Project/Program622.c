//////////////////////////////////////////////////////////////////////////////
//
//Header Files Inclusion
//
//
//////////////////////////////////////////////////////////////////////////////
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>
#include <string.h>
#include <stdbool.h>

//////////////////////////////////////////////////////////////////////////////
//
//User Defined Marcos
//
//
//////////////////////////////////////////////////////////////////////////////
#define MAXINODE 10
#define MAXFILESIZE 50
#define MAXOPENFILES 10
#define READ 1
#define WRITE 2
#define EXECUTE 4

#define START 0
#define CURRENT 1
#define END 2

#define  EXECUTE_SUCESS 0

#define REGULARFILE  1
#define SPECIALFILE 2

//////////////////////////////////////////////////////////////////////////////
//
//User Defined Marcos  for Error Handling
//
//
//////////////////////////////////////////////////////////////////////////////

#define ERR_INVAILD_PARAMETER -1

#define ERR_NO_INODES -2

#define ERR_FILE_ALREADY_EXIST -3

#define ERR_FILE_NOT_EXIST -4

#define ERR_PERMISSION_DENIED -5

#define ERR_INSUFFICIENT_SPACE -6

#define ERR_INSUFFICIENT_DATA -7

#define ERR_MAX_FILES_OPEN -8


//////////////////////////////////////////////////////////////////////////////
//
//Structure Name :  BootBlock
// Description:     It Hold the Information to boot the Operating System
//
////////////////////////////////////////////////////////////////////////////
struct BootBlock
{
    char Information[100];

};


//////////////////////////////////////////////////////////////////////////////
//
//Structure Name :SuperBlock
// Description: It holds the Information of Complete File System
//
/////////////////////////////////////////////////////////////////////////
struct SuperBlock
{
    int TotalInodes;
    int FreeInodes;

};



//////////////////////////////////////////////////////////////////////////////
//
//Structure Name :  Inode
// Description:     It Holds information of the File
//
/////////////////////////////////////////////////////////////////////////
#pragma pack(1)

struct Inode
{
    char FileName[20];
    int INodeNumber;
    int FileSize;
    int ActualFileSize;
    int FileType;
    int ReferenceCount;
    int Permission;
    char *Buffer;
    struct Inode *next;
};

typedef struct Inode INODE;
typedef struct Inode *PINODE;
typedef struct Inode **PPNODE;


//////////////////////////////////////////////////////////////////////////////
//
// Structure Name :  FileTable
// Description:    It Holdes information of opened Files
//
/////////////////////////////////////////////////////////////////////////
#pragma pack(1)
struct FileTable
{
    int ReadOffSet;
    int WriteOffSet;
    int Mode;
    PINODE ptrinode;
    
};

typedef struct FileTable FILETABLE;
typedef struct FileTable * PFILETABLE;

//////////////////////////////////////////////////////////////////////////////
//
// Structure Name : UREA
// Description:     It Holds information of process
//
/////////////////////////////////////////////////////////////////////////

struct UREA
{
    char ProcessName[20];
    PFILETABLE UFDT[MAXOPENFILES];
};


//////////////////////////////////////////////////////////////////////////////
//
// Global Variables used  in the Project
// 
//
/////////////////////////////////////////////////////////////////////////

struct BootBlock bootobj;
struct SuperBlock superobj;
struct UREA ureaobj;


PINODE head=NULL;


//////////////////////////////////////////////////////////////////////////////
//
//  Function Name:InitialiseUREA
//  Description:  It is used to initalize UAREA
//  Author: Pratik S Narule
//  Date:31/07/2026
//
//
//////////////////////////////////////////////////////////////////////////////

void InitialiseUREA()
{
    int i=0;
    strcpy(ureaobj.ProcessName,"Myexe");

    for(i=0;i<MAXOPENFILES;i++)
    {
        ureaobj.UFDT[i]=NULL;

    }
    printf("Marvellous CVFS :UREA gets Initalised Succesfully \n");
}


//////////////////////////////////////////////////////////////////////////////
//
//  Function Name:InitialiseSuperBlock()
//  Description:  It is used to initialise Super Block
//  Author: Pratik S Narule
//  Date:31/07/2026
//
//
//////////////////////////////////////////////////////////////////////////////
void InitialiseSuperBlock()
{
    superobj.TotalInodes=MAXINODE;
    superobj.FreeInodes=MAXINODE;

        printf("Marvellous CVFS :Super Block Gets Initilised  Succesfully \n");
}


//////////////////////////////////////////////////////////////////////////////
//
//  Function Name:createDILB()
//  Description:  It is used to Create LinkedList of iNodes
//  Author:         Pratik S Narule
//  Date:       31/07/2026
//
//
//////////////////////////////////////////////////////////////////////////////

void createDILB()
{ PINODE temp=NULL;
    PINODE newn=NULL;
    int i=0;
    temp=head;
    for(i=1;i<=MAXINODE;i++)
    {
        newn=(PINODE)malloc(sizeof(INODE));
        newn->INodeNumber=i;
        strcpy(newn->FileName,"\0");
        newn->FileSize=0;
        newn->ActualFileSize=0;
        newn->FileType=0;
        newn->ReferenceCount=0;
        newn->Permission=0;
        newn->Buffer=NULL;
        newn->next=NULL;
        
        if(temp==NULL)
        {
            head=newn;
            temp=head;
        }
        // Doubt while needed?
        else 
        {
            temp->next=newn;
            temp=temp->next;
        }
    }

        printf("Marvellous CVFS :DILB Gets Created  Succesfully \n");
    
     
    

}

//////////////////////////////////////////////////////////////////////////////
//
//  Function Name:startAuxillaryDataInitilization()
//  Description:  It is used to Call all Such Function which is used to initlize 
//                    Axuillary Data
//  Author:         Pratik S Narule
//  Date:       31/07/2026
//
//
//////////////////////////////////////////////////////////////////////////////

void startAuxillaryDataInitilization()
{
    strcpy(bootobj.Information,"Booting Process of Marvellous CFVS is Completed");
    printf("%s\n",bootobj.Information);
    InitialiseUREA();
    InitialiseSuperBlock();
    createDILB();



}

//////////////////////////////////////////////////////////////////////////////
//
//Entry Point Function of CVFS project
//
//
//////////////////////////////////////////////////////////////////////////////

int main()
{
    
   startAuxillaryDataInitilization();

    return 0;
}