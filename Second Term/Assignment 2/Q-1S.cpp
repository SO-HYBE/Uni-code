#include<iostream>
using namespace std;


int n,*arr;
void arrMaker(int *arr, int n){

    for(int i = 0; i < n ; i++){
        cin>>*(arr+i);
    }    
    
    int greater=0,smaller=0;

    greater = arr[0];
    for(int i = 1; i < n; i++){
    
    int current = *(arr+i);
    
    if(current>greater){
        greater = current;
    };
    
    }
    
    smaller = arr[0];
    
    for(int i = 1; i < n; i++){
    
    int current = *(arr+i);
    
    if(current<smaller){
      smaller = current;
    };

    }

    cout<<"The greatest numbered entered is: "<<greater<<endl;
    cout<<"The smallest numbered entered is: "<<smaller<<endl;
}

int main() {
    int array[n];
    cout<<"Enter how many numbers you want to enter:";
    cin>>n;
    cout<<"Enter "<<n<<" numbers:";

    arrMaker(array,n);

    return 0;
}