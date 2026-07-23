//Queue
#include <iostream>
using namespace std;
#pragma pack(1)
template <class T>
struct node 
{
   T data;
   struct node * next;
};
template <class T>
class Queue
{
    private:
    struct node * first;
    int iCount;

 public:
     Queue();
     void Enqueue(T iNo); // Insert Last
     T Dequeue();    // Delete first
     T Peep(); // 
     void Display();
     int Count();
};
template <class T>
Queue<T>::Queue()
{
     this->first=NULL;
     this->iCount=0;

}
template <class T>
void Queue<T>:: Enqueue(T iNo)
{
    struct node *temp=NULL;
   struct node * newn=NULL;
   newn=new struct node();
   newn->data=iNo;
   newn->next=NULL;

    if(first== NULL)
    {
        first=newn;
    }
    else 
    {
        temp=first;
        while(temp->next!=NULL)
        {   
                temp=temp->next;
        }
        temp->next=newn;
    }
   iCount++;
}
template <class T>
T Queue<T>:: Dequeue()
{   T iValue=0;
    struct node * temp=NULL;
    if(first==NULL)
    {
        cout<<"Queue Is Empty"<<"\n";
        return -1;
    }
    else 
    { 
       iValue=first->data;
       temp=first;
       first=first->next;
       delete(temp);

       iCount--;
       return iValue;

    }
   
}
template <class T>

void Queue<T>:: Display()
{
    struct node *temp=first;
    while(temp!=NULL)
    {
        cout<<"|"<<temp->data<<"|\n ";
        temp=temp->next;
    }
}
template <class T>
int Queue<T>:: Count()
{
    return iCount;
}

int main()
{
    Queue<int> Sobj;
    int iRet=0;
    int iValue=0;
    Sobj.Enqueue(11);
    Sobj.Enqueue(21);
    Sobj.Enqueue(51);
    Sobj.Enqueue(101);
    // Sobj.Push(111);
    iRet=Sobj.Count();
    Sobj.Display();
    cout<<"Element of Queue are "<< iRet<<endl;

    iRet=Sobj.Dequeue();

    cout<<"Removed  Element is :"<<iRet<<"\n";

    iRet=Sobj.Count();
    Sobj.Display();
    cout<<"Element of Queue is "<< iRet<<endl;



    return 0;
}