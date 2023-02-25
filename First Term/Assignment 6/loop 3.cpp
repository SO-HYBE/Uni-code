#include<iostream>

#include<conio.h>

using namespace std;

int main(){
    int x;
    bool condition = true;
    int factor_counter = 0;
    while(condition){
        cout<<"Please enter a positive number:"<<endl;
        cin>>x;
        if(x<0){
            condition = true;
        } else{
            condition = false;
        }
    }

    if(x!=2 && x%2==0){
        cout<<"This is not a Prime number.";
    } else if(x==x*x){
        cout<<"This is not a Prime number";
    } else {
      for(int i=2; i<=10;i++){
         if(x%i==0){
            factor_counter++;
        }
    }
    if(factor_counter<=1){
        cout<<"This is a Prime number.";
    } else if (factor_counter>1){
        cout<<"This is not a Prime number.";
    }  
}
    return 0;
}
