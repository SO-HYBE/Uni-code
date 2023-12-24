#include<iostream>
using namespace std;

int Partition(int arr[], int beg, int end){
    int i = beg;
    int j = end;
    int pivot = i;

    while(true){

        while(arr[pivot]<=arr[j] && j!=pivot) j--;

        if(j==pivot) {
            break;
        } else if (arr[pivot]>arr[j]){
            swap(arr[pivot],arr[j]);
            pivot = j;
        }

        while(arr[pivot]>=arr[i] && i!=pivot) i++;

        if(i==pivot) {
            break;
        } else if (arr[pivot]<arr[i]){
            swap(arr[pivot], arr[i]);
            pivot = i;
        }
    }
    return pivot;
}

void QuickSort(int arr[], int l, int r){
    if(l<r){
        int p = Partition(arr,l,r);
        QuickSort(arr,l,p-1);
        QuickSort(arr,p+1,r);
    }
}

int main () {
    int arr [] = {12,53,22,10,2};
    QuickSort(arr,0,4);
    for(int i = 0; i<=4;i++) cout<<arr[i]<<" ";
}