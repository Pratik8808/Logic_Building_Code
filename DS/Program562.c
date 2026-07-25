#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#pragma pack(1)
struct node 
{ 
    int data;
    struct node *lChild;
    struct node *rchild;
};
typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;


// L D R
void Inorder(PNODE first)
{
    if(first!=NULL)
    {
        Inorder(first->lChild);
        printf("%d\n",first->data);
        Inorder(first->rchild);

    }
}
//D L R
void PreOrder(PNODE first)
{
     if(first!=NULL)
    {
        printf("%d\n",first->data);
        PreOrder(first->lChild);
        PreOrder(first->rchild);

    }
    
}
// L R D
void PostOrder(PNODE first)
{
    if(first!=NULL)
    {
        PostOrder(first->lChild);
        PostOrder(first->rchild);
        printf("%d\n",first->data);

    }
}


void Insert(PPNODE first,int iNo)
{
    PNODE newn=NULL;
    PNODE temp=NULL;
    newn=(PNODE)malloc(sizeof(NODE));
    newn->lChild=NULL;
    newn->rchild=NULL;
    newn->data=iNo;
    if(*first==NULL)
    {
        *first=newn;
    }
    else
    { 
        temp=*first;
        while(1)
        {
            if(iNo>temp->data)
            {
                if(temp->rchild==NULL)
                {
                    temp->rchild=newn;
                    break;
                }
                temp=temp->rchild;
                
            }
            else if(iNo<temp->data)
            {
                if(temp->lChild==NULL)
                {
                    temp->lChild=newn;
                    break;

                }
                temp=temp->lChild;
            }
            else if(iNo == temp->data)
            {
                printf("Unable to Insert As Element is duplicate \n");
                free(newn);
                break;
            }

        }
        
    }

}
int Count(PNODE first)
{
    static int iCount=0;
    if(first!=NULL)
    {
        iCount++;
        Count(first->lChild);
        Count(first->rchild);
        
    }

    return iCount;
}
bool serach(PNODE first,int iNo)
{
    bool bflag=false;
    while(first!=NULL)
    {
        if(iNo==first->data)
        {
            bflag=true;
            break;
        }
        else if(iNo>first->data)
        {
            first=first->rchild;
        }
        else if(iNo<first->data)
        {
            first=first->lChild;
        }

    }
    return bflag;
}

int main()
{
    PNODE  head=NULL;
    int iRet=0;
    bool bRet=false;
    Insert(&head,11);
    Insert(&head,5);
    Insert(&head,17);
    Insert(&head,21);
    Insert(&head,4);
    Insert(&head,7);
    Insert(&head,15);


    printf("Inorder Display : \n");
    Inorder(head);

    iRet=Count(head);
    printf("Count of Nodes are %d \n",iRet);
    bRet=serach(head,25);
    if(bRet)
    {
        printf("25 is in  BST Tree \n");
    }
    else
    {
        printf("25 is not present in BST \n");
    }

    

    
}