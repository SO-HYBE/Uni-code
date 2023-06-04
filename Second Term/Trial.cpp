#include<iostream>
#include<fstream>
#include<string.h>
#include<cstdlib>
using namespace std;

class Sorting{
    private:
    int size;
    int* array;
    public:

    Sorting(){
        size = 100;
        array = new int [size];
    }

    Sorting(int n){
        size = n;
        array = new int [size];
    }

    void read() {
        for(int i=0; i<size; i++){
            array[i]=rand()%100;
        }
    }
    
    void print() {
        for(int i=0; i<size; i++){
            cout<< array[i]<<"\t";
        }
    }

    void insertion(){
        int j , temp;
        for(int i = 1; i<=size-1; i++){
            j=i;
            while(j>0 && array[j-1]>array[j]){
                temp = array[j];
                array[j]= array[j-1];
                array[j-1] = temp;
                j--;
            }

        }
    }

    void bubble (){
        int max;
        for(int i=size-1; i>0;i--){
            max= array[0];
            for(int j = 1; j<=i;j++){
                if(array[j]<max){
                    array[j-1]= array[j];
                    array[j]=max;
                } else {
                    max = array[j];
                }
            }
        }
    }

    void merge(int first, int mid, int last){
        int i1=first, i2=mid+1, k=first;
        int * arrayout = new int [size];
        while(i1<=mid && i2<=last){
            if(array[i1]<=array[i2]){
                arrayout[k] = array[i1];
                i1++;k++;
            } else {
                arrayout[k] = array[i2];
                i2++;k++;
            }
        }
        while(i1<=mid){
            arrayout[k]=array[i1]; i1++;k++;
        }
        while(i2<=last){
            arrayout[k]=array[i2]; i2++;k++;
        }
        for(int i =first; i<=last;i++){
            array[i] = arrayout[i];
        }
    }

    void merge_sorting(int first, int last){
        if(first<last){
            int midpoint = (first+last)/2;
            merge_sorting(first, midpoint);
            merge_sorting(midpoint+1, last);
            merge(first, midpoint, last);
        }
    }

};

int main (){
    Sorting obj(10), obj1;
    obj.read();
    cout<<"\ncontent of array before bubble sort\n";
    obj.print();
    obj.merge_sorting(0,9);
    cout<<"\ncontent of array after sort\n";
    obj.print();

}
