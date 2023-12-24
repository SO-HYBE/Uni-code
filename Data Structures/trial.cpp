#include<iostream>
using namespace std;

void CountSort(int arr[], int size){
    int freq[1000]={};
    for(int i=0; i<size;i++) freq[arr[i]]++;

    int prefix[1000];
    prefix[0] = freq[0];
    for(int i = 1; i<1000;i++) prefix[i] = prefix[i-1] + freq[i];

    int output[size];
    for(int i=size-1; i>=0;i--){
        int k = prefix[arr[i]];
        output[k-1] = arr[i];
        prefix[arr[i]] -= 1;
    }

    for(int i=0;i<size;i++){
        arr[i]=output[i];
    }
}

int main() {
    int arr[] = {12,3,65,19,33};
    
    CountSort(arr,5);

    for(int i=0;i<5;i++) cout<<arr[i]<<" ";

    return 0;
}