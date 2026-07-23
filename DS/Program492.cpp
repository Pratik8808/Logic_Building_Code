
//Stack  Generic

#include <iostream>
using namespace std;
#pragma pack(1)

template <class T>
struct node 
{
   int data;
   struct node * next;
};


template <class T>
class Stack
{
    private:
    struct node<T> * first;
    int iCount;

 public:
     Stack();
     void Push(T iNo); // Insert First
     T Pop();    //DeleteFirst
     T Peep(); //  DeleteFirst//
     void Display();
     int Count();
};

template <class T>

Stack<T>::Stack()
{
     this->first=NULL;
     this->iCount=0;

}

template <class T>


void Stack<T>:: Push(T iNo)
{

   struct node <T> * newn=NULL;
   newn=new struct node<T>();


   newn->data=iNo;
   newn->next=NULL;

   newn->next=first;
   first=newn;

   iCount++;
}
template <class T>

T Stack<T>:: Pop()
{   T iValue=0;
    struct node<T> * temp=NULL;
    if(first==NULL)
    {
        cout<<"Stack Is Empty"<<"\n";
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

T Stack<T>:: Peep()
{
    T iValue=0;
    
    if(first==NULL)
    {
        cout<<"Stack Is Empty"<<"\n";
        return -1;
    }
    else 
    { 
       iValue=first->data;
    
       return iValue;

    }
}

template <class T>

void Stack<T>:: Display()
{
    struct node <T>*temp=first;
    while(temp!=NULL)
    {
        cout<<"|"<<temp->data<<"|\n ";
        temp=temp->next;
    }
}

template <class T>

int Stack<T>:: Count()
{
    return iCount;
}

int main()
{
    Stack <int> Sobj;
    int iRet=0;
    int iValue=0;
    Sobj.Push(11);
    Sobj.Push(21);
    Sobj.Push(51);
    Sobj.Push(101);
    // Sobj.Push(111);
    iRet=Sobj.Count();
    Sobj.Display();
    cout<<"Element of Stack is "<< iRet<<endl;

    iRet=Sobj.Pop();

    cout<<"Pop Element is :"<<iRet<<"\n";

    iRet=Sobj.Count();
    Sobj.Display();
    cout<<"Element of Stack is "<< iRet<<endl;

    iRet= Sobj.Peep();
    cout<<"Element on top of iStack :"<<iRet<<endl;

    iRet=Sobj.Count();
    Sobj.Display();
    cout<<"Element of Stack is "<< iRet<<endl;

    









    return 0;
}