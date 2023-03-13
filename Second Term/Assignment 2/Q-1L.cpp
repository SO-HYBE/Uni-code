#include<iostream>
using namespace std;

int Maximum (int *arr, int n){
    int greater=0;

    greater = arr[0];

    for(int i = 1; i < n; i++){
    
    int current = *(arr+i);

    if(current > greater){
      greater = current;
    }


};
    return greater;
}

int Average(int *arr, int n) {
    int sum=0, result;
    for(int i=0; i < n; i++){
        sum+=*(arr+i);
    };
    result = sum/n;
    return result;
}

int Count(int *arr, int n) {
    int in=0;
    for(int i = 0; i < n; i++){
        if(*(arr+i)>=50){
            in+=1;
        }
    }
    return in;
}

int main(){
    int array[5];

    cout<<"Enter the scores of 20 students: ";
    
    for(int i=0; i<5 ; i++){
        cin>>array[i];
    }

    cout<<"The Average Score is: "<<Average(array,5)<<endl;
    cout<<"The Maximum Score is: "<<Maximum(array,5)<<endl;
    cout<<"The number of succeeded students is: "<<Count(array,5)<<endl;
}