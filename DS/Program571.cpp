#include <iostream>
#include <stdbool.h>
using namespace std;

struct node
{
    int data;
    struct node * lChild;
    struct node * rChild;
};
typedef struct  node NODE;
typedef struct  node * PNODE;



class  BST
{
    private:
        PNODE Root;
        static int iCount;
    public:
    BST();
    void Insert(int iNo);
    bool serach(int iNo);
    int countLeaf();
    void Inorder(PNODE Root);
    void Postorder(PNODE Root);
    void Inorder(PNODE Root);
    int CountParent();
    int Count();


};

BST::BST()
{
    this->Root->data=NULL;
    this->Root->lChild=NULL;
    this->Root->rChild=NULL;
    
}
void BST:: Insert(int iNo)
{
    PNODE newn=NULL;
    PNODE temp=Root;
    newn=(PNODE)malloc(sizeof(NODE));

    newn->data=iNo;
    newn->lChild=NULL;
    newn->rChild=NULL;
    while(1)
    {
        if(temp->data>iNo)
        {
            if(temp->lChild==NULL)
            {
                temp->lChild=newn;
                iCount++;
                break;
            }
            temp=temp->lChild;
        }
        else if(temp->data<iNo)
        {
            if(NULL==temp->rChild)
            {
                
                temp->rChild=newn;
                iCount++;
                break;
            }
            temp=temp->rChild;

        }
        else if(iNo==temp->data)
        {
            cout<<"Duplicate element"<<endl;
            delete(newn);

        }


    }
}
bool BST:: serach(int iNo)
{   PNODE temp=Root;
    bool bflag=false;
    while(Root!=NULL)
    {
        if(iNo==Root->data)
        {
            bflag=true;
            break;
        }
        else if(iNo>Root->data)
        {
            Root=Root->rChild;
        }
        else if(iNo<Root->data)
        {
            Root=Root->lChild;
        }

    }
    return bflag;
}
int BST:: countLeaf()
{

}
int BST:: Count()
{
    return iCount;
}
void BST:: Inorder(PNODE Root)
{  PNODE temp=Root;
    if(Root!=NULL)
    {
        Inorder(temp->lChild);
        cout<<temp->data;
        Inorder(temp->rChild);
    }
}
void BST:: Postorder(PNODE Root)
{}
void BST:: Inorder(PNODE *Root)
{}
int BST:: CountParent()
{}






int main()
{  BST dobj;
    dobj.Insert(50);
    return 0;
}