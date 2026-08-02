#include <stdio.h>
#include <stdlib.h>

#define MAXINODE 5
struct node 
{
    int data;
    struct node *next;
};

typedef struct node INODE;
typedef struct node * IPNODE;
typedef struct node ** IPPNODE;

IPNODE head=NULL;

void CreateDILB()
{   
}
void DisplayDILB()
{
    IPNODE temp=head;
    while(temp!=NULL)
    {
        printf("|%d|->",temp->data);
        temp=temp->next;
    }

}

int main()
{
    CreateDILB();

    DisplayDILB();
    return 0;
}
