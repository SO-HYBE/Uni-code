#include<iostream>
using namespace std;

int power(int n, int m){
    int result = 1;
    if(m==0){
        result = 1;
    }else{
        result = n * power(n,m-1);
    }
    return result ;
}

int main (){
    cout<<power(10,3);

    return 0;
}