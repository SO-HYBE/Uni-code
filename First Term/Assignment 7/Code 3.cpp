#include<iostream>
#include<conio.h>

using namespace std;

int main () {
    int x = 1;
    for(int i=0; i<=5; i++){
        for(int j=1; j<i; j++){
            cout<<x<<" ";
            x++;
        }
        cout<<endl;
    }  
    return 0;
}