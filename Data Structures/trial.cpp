#include<iostream>
using namespace std;

int arr[3], size= 3, front = -1, back = -1;

bool isEmpty(){
    return (front==-1 && back ==-1);
}

bool isFull(){
    return back>=size-1;
}

void enqueue (int item){
    if(isFull()) cout<<"The queue is full."<<endl;
    else{
        if(front==-1) front =0;
        back++;
        arr[back] = item; 
    }
}

void dequeue (){
    if(isEmpty()) cout<<"The queue is empty.";
    else{
        if(front == back) front = back = -1;
        else{
            front++;
        }
    }
}

void showFront(){
    if(isEmpty()) cout<<"The queue is empty.";
    else cout<<"The element at the front is : "<< arr[front]<<endl;
}

void display (){
    if(isEmpty()) cout<<"The queue is empty.";
    else{
        for(int i = front; i<=back; i++)cout<<arr[i]<<endl;
    }
}

int main() {
enqueue(10);enqueue(20);enqueue(5); enqueue(200);
display();
dequeue();
display();
enqueue(150);
display();
return 0;
}