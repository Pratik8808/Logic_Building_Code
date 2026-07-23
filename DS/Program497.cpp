
//Doubly Cirular 
#include <iostream>
using namespace std;
#pragma pack(1)
struct node
{
    int data;
    struct node *prev;
    struct node *next;
};




#pragma pack(1) // Applicable only one time
class DoublyCL
{   private:
    
    struct node  * first;
    struct node  * last;
    int iCount;
    public:
    DoublyCL();
    void Display();
    int Count();
    
    void Insertfirst(int iNo);
    void InsertLast(int iNo);
    void InsertAtPost(int iNo,int iPost);

    void DeleteFirst();
    void DeleteLast();
    void DeleteAtPos(int iPos);

};

DoublyCL::DoublyCL()
{
    cout<<"Inside Constructor"<<endl;
    first=NULL;
    last=NULL;
    iCount=0;
}

void DoublyCL:: Display()
{
    struct node  * temp=NULL;
    temp=first;
    do{
        cout<<"|"<<temp->data<<"|<->";;
        temp=temp->next;
    }while(temp!=(last)->next);
    cout<<endl;
}
int DoublyCL:: Count()
{
    return this->iCount;
}

void DoublyCL:: Insertfirst(int iNo)
{
    struct node  * newn=new struct node ;
    newn->data=iNo;
    newn->next=NULL;
    newn->prev=NULL;
    if(first==NULL && last==NULL)
    {
       first=newn;
       last=newn;
    }
    else 
    {
        newn->next=first;
        first->prev=newn;
        first=newn;

    }
    last->next=first;
    first->prev=last;
    iCount++;
}
void DoublyCL:: InsertLast(int iNo)
{

    struct node  * newn=new struct node ;
    struct node  * temp=NULL;
    newn->data=iNo;
    newn->next=NULL;
    newn->prev=NULL;
    if(first==NULL && last==NULL)
    {
       first=newn;
       last=newn;
    }
    else 
    {  last->next=newn;
        newn->prev=last;
        last=newn;

    }
    last->next=first;
    first->prev=last;
    iCount++;
}
void DoublyCL:: InsertAtPost(int iNo,int iPost)
{
    struct node  * temp=NULL;
    struct node  * newn=NULL;
    newn=new struct node ();
    newn->data=iNo;
    newn->next=NULL;
    newn->prev=NULL;
    int i=0;
   if(iPost<1 ||iPost >iCount+1)
   {
    cout<<"Inavild Postion"<<endl;
    return ;
   }
   if(iPost==1)
   {
    Insertfirst(iNo);
    }

else if(iPost==iCount+1)
{
    InsertLast(iNo);
}
else
{
    temp=first;
    for(i=1;i<iPost;i++)
    {
        temp=temp->next;
    }
    newn->next=temp->next;
    newn->prev=temp;
    temp->next->prev=newn;
    temp->next=newn;
    iCount++;
    
}

}

void DoublyCL:: DeleteFirst()
{
     if(first==NULL && last==NULL)
    {
       return;
    }
    else 
    {  first=first->next;
        free(first->prev);

    }
    last->next=first;
    first->prev=last;
    iCount--;
}
void DoublyCL:: DeleteLast()
{ if(first==NULL && last==NULL)
    {
       return;
    }
    else 
    { struct node  * temp=NULL;
        temp=first;
        while(temp->next!=last)
        {
            temp=temp->next;
        }
        free(temp->next);
        last=temp;

    }
    last->next=first;
    first->prev=last;
    iCount--;
   

}
void DoublyCL:: DeleteAtPos(int iPos)
{
    int i=0;
     if(first==NULL && last==NULL)
    {
       return;
    }

    if(iPos<1||iPos>iCount)
    {
        cout<<"Invaild"<<endl;
        return;
    }
    if(iPos==1)
    {
        DeleteFirst();
    }
    else if(iPos==iCount)
    {
        DeleteLast();
    }
    else 
    { struct node  * temp=NULL;
        temp=first;
       for (i=1;i<iPos-1;i++)
       {
        temp=temp->next;
       }
       temp->next=temp->next->next;
       free(temp->next->prev);
       temp->next->prev=temp;
       iCount--;
    }
   

}

int main()
{
    DoublyCL dobj;

    dobj.Insertfirst(101);
    dobj.Insertfirst(51);
    dobj.Insertfirst(21);
    dobj.Insertfirst(11);

    dobj.Display();
    cout<<dobj.Count()<<endl;

    

    dobj.InsertLast(151);
    dobj.InsertAtPost(105,4);

    dobj.Display();
    cout<<dobj.Count()<<endl;

    dobj.DeleteFirst();
    dobj.DeleteLast();

     dobj.Display();
    cout<<dobj.Count()<<endl;

    dobj.DeleteAtPos(3);
       dobj.Display();
    cout<<dobj.Count()<<endl;


    return 0;
}