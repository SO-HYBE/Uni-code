#include<iostream>
using namespace std;

int fact (int n){
    int result;
    if(n == 1){
        result = 1;
    } else {
        result = n * fact(n-1);
    };
    return result;
}

int sum (int first, int final){
    int result;
    if(first == final){
        result = first;
    } else {
        result = final + sum(first, final-1);
    };
    return result;
}

int main(){
    cout<<"The solution of the equation is: "<<endl;
    cout<<sum(13,25)<<endl;
    cout<<"----"<<endl;
    cout<<(fact(1)+fact(3)+fact(5)+fact(7))<<endl;
    return 0;
}