#include<iostream>
#include<fstream>
#include<string.h>
#include<cstdlib>
using namespace std;

int arr[10] = {-10, -3, 7, 12, 13, 18 , 20 , 22 , 24 ,25};

int binary (int low, int high, int key){
    while(low<=high){
        int mid = (low + high)/2;
        if(arr[mid] == key){
            return mid;
        } else if(arr[mid]>key){
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }
    return -1;
}

int main () {
    int key;
    cout<<"Enter the key you want to search inside the array: ";
    cin>>key;
    int result = binary(0,9,key);
    if(result == -1){
        cout<<"Error: The key was not found inside the array!";
    } else {
        cout<<"The key was found inside the array!!!";
    }
    
}