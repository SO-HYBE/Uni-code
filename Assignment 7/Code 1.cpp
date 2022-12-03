#include<iostream>
#include<conio.h>

using namespace std;

int main () {
    int x = 0;
    for(int i=0; i<=5; i++){
        for(int j=1; j<i; j++){
            cout<<j<<" ";
        }
        cout<<endl;
    }  
    return 0;
}