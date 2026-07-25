#include <iostream>
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
    bool serach();
    int countLeaf();
    void Inorder();
    void Postorder();
    void Inorder();
    int CountParent();


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
bool BST:: serach()
{  static PNODE temp=Root
    if()
}
int BST:: countLeaf()
{}
void BST:: Inorder()
{}
void BST:: Postorder()
{}
void BST:: Inorder()
{}
int BST:: CountParent()
{}





int main()
{
    return 0;
}