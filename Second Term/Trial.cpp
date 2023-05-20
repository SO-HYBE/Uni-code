#include<iostream>
using namespace std;

void read(int *p , int n){
    for(int i=0; i<n; i++){
        cin>>*(p+i);
    }
}

void compare(int *p, int n){
    int great, small, greatest=-99999, smallest=99999;
    for(int i=0 ; i<n; i++){
        if(*(p+i)>=*(p+i+1)){
            great = *(p+i);
            small = *(p+i+1);
        } else {
            great = *(p+i+1);
            small = *(p+i);
        }

        if(great >= greatest){
            greatest = great;
        }
        if(small <=smallest) {
            smallest = small;
        }
    }
    cout<<"The greatest number of the given numbers is: "<<greatest<<endl;
    cout<<"The smallest number of the given numbers is: "<<smallest<<endl;
}

int main(){
    int size;
    int *p;
    cout<<"Please enter the size of the array: "<<endl;
    cin>>size;
    p = new int[size];
    cout<<"enter the desired numbers: "<<endl;
    read(p, size);
    compare(p, size);

    return 0;
}