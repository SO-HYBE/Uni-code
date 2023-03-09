#include<iostream>
using namespace std;


int n,*arr;
void arrMaker(int *arr, int n){

    int greater,smaller,greatest=0,smallest;

    for(int i = 0; i < n ; i++){
        cin>>*(arr+i);
    }

    for(int i = 0; i < n; i++){
    
    int current = *(arr+i);
    int next = *(arr+i+1);

    if(current<n){

    if(next<current){
      greater = current;
      smaller = next;
    } else {
      greater = next;
      smaller = current;
    };

    if(greater>=greatest){
        greatest = greater;
    };
    
    if(smaller<=smallest){
      smallest = smaller;
    };

    }

    }
    cout<<"The greatest numbered entered is: "<<greatest<<endl;
    cout<<"The smallest numbered entered is: "<<smallest<<endl;
}

int main() {
    int array[n];
    cout<<"Enter how many numbers you want to enter:";
    cin>>n;
    cout<<"Enter "<<n<<" numbers:";

    arrMaker(array,n);

    return 0;
}