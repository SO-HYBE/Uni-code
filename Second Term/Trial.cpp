#include<iostream>
#include<string.h>
using namespace std;

int main(){
    string original, reversed;

    cout<<"Enter a string to be reversed: "<<endl;
    getline(cin, original);

    for(int i = original.length()-1; i>=0; i--){
        reversed += original [i];
    }
    
    cout<<"The reversed string is: "<<reversed;

    return 0;
}