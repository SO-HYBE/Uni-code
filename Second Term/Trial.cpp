#include<iostream>
#include<fstream>
#include<string.h>
#include<cstdlib>
using namespace std;

int main () {
    char original[5][10], capital[5][10];
    cout<<"Enter 5 names: ";
    for(int i = 0; i<5; i++){
        cin>>original[i];
        strcpy(capital[i],original[i]);
    }
    for(int i =0;i<5;i++){
        capital[i][0] = toupper(capital[i][0]);
    }
        cout<<"The original array is: "<<endl;
    for(int i = 0; i<5;i++){
        cout<<original[i]<<endl;
    }
        cout<<"The capital array is: "<<endl;
    for(int i = 0; i<5;i++){
        cout<<capital[i]<<endl;
    }

}