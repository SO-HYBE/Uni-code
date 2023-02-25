#include<iostream>
using namespace std;

int power(int n, int m){
    int result = 1;
    for(int i=0; i < m; i++){
        result*=n;
    };
    return result;
}

int main (){
    cout<<power(2,3);

    return 0;
}