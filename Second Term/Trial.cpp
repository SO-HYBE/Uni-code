#include<iostream>
using namespace std;

int lPower(int n, int m){
    int result=1;
    for(int i=1; i<=m; i++){
        result = result*n;
    }
    return result;
}

int rPower(int n , int m){
    int result;
    if(m==0){
        return 1;
    } else {
        result = n * rPower(n,m-1);
    }
    return result;
}

int main(){
    int x, y;
    cout<<"enter the base of the power: "<<endl;
    cin>>x;
    cout<<"enter the power of the power: "<<endl;
    cin>>y;
    cout<<"The result using loops: "<<lPower(x,y)<<endl;
    cout<<"The result using recursion: "<<rPower(x,y);
    return 0;
}