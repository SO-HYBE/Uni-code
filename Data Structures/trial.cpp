#include<iostream>
using namespace std;

void heapify(int arr[], int size, int i){
    int maxel = i;
    int l = 2 * i + 1;
    int r = 2 * i + 2;

    if (l < size && arr[l] > arr[maxel]) maxel = l;
    if (r < size && arr[r] > arr[maxel]) maxel = r;

    if (maxel != i){
        swap(arr[i], arr[maxel]);
        heapify(arr, size, maxel);
    }
}
void buildHeap (int arr[], int size){
    for(int i = (size/2)-1; i>=0; i--) heapify(arr, size, i);
}

void heapSort(int arr[], int size){
    buildHeap(arr, size);
    for(int i = size-1; i>=0; i--){
        swap(arr[0],arr[i]);
        heapify(arr,i, 0);
    }
}

int main (){
    int size;
    cout<<"Enter the size of an array: "<<endl;
    cin>>size;

    int arr[size];
    cout<<"enter the values of the array:"<<endl;
    for(int i = 0; i<size; i++){
        cin>>arr[i];
    }
    heapSort(arr, size);
    for(int i = 0; i<size; i++){
        cout<<arr[i]<<" ";
    }

    return 0;
}