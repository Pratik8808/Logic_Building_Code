#include <stdio.h>

#include <stdlib.h>

// InsetAtFirst 
struct node {
    int data;
    struct node * next;
};
typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void Display(PNODE first)
{
    if(first!=NULL)
    {
        Display(first->next);
        printf("|%d|->",first->data);
    }
   
    
}
int count (PNODE first)
{
   static int icount=0;
    if(first!=NULL)
    {
        icount++;
        first=first->next;
        count(first);


    }
    return icount;
    
}

void InsertFirst(PPNODE first,int iNo)
{
    PNODE newn=NULL;
    newn=(PNODE)malloc(sizeof(NODE));

    newn->data=iNo;
    newn->next=NULL;

    if(*first==NULL)// LinkedList is Empty
    {
        *first=newn;

    }
    else// LinkedList contain At least one Node 
    {
           newn->next=*first;
           *first=newn;
    }

    

}









int main()
{
    PNODE head=NULL;
    InsertFirst(&head,101);
    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);
    Display(head);
    int iRet=0;
    iRet=count(head);
    printf("\nNumber if node are : %d\n",iRet);
       

    return 0;
}