#include<iostream> 
using namespace std;

int arr[100], size = 100, top=-1;

bool isEmpty(){
    return top==-1;
}

bool isFull(){
    return top>=size-1;
}

void push(int item){
    if(isFull()) cout<<"The stack is full."<<endl;
    else{
        top++;
        arr[top] = item;
    }
}

void pop(){
    if(isEmpty()) cout<<"The stack is empty."<<endl;
    else{
        top--;
    }
}

void display(){
    if(isEmpty()) cout<<"The stack is empty."<<endl;
    else{
        for(int i=top;i>=0;i--) cout<<arr[i]<<endl;
    }
}

int main(){
    push(10); push(5); push(100); push(50);
    display();
    pop();
    display();
    push(150);
    display();
    return 0;
}