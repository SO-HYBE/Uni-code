#include<iostream>
#include<conio.h>

using namespace std;

int main () {
    for(int i=1; i<=12; i++){
        for(int j=1; j<=5; j++){
            cout<<j<<" x "<<i<<" = "<<i*j<<"\t";
            if (j==5)
            {
                cout<<endl;
            }
            
        }
    }  
    return 0;
}