#include<iostream>
#include<conio.h>

using namespace std;

int main () {
    int myArr[20], x , y = 0, bigger = 0, smaller = 0, maximum = 0 , minimum, sum=0, average;

    for(int i=0; i<20; i++){
       cout<<"Please enter 20 numbers: ";
       cin>>x;
       myArr[i] = x;
    }

    for(int i=0; i<20; i++){
        cout<<myArr[i+1]<<" ";
    }

    for(int i=0; i<20; i++){
        if(i+1==20){
            break;
        } else {
          if(myArr[i]<=myArr[i+1]){
            bigger = myArr[i+1];
            smaller = myArr[i];
        } else {
            bigger = myArr[i];
            smaller = myArr[i+1];
        }
         if(bigger>=maximum){
            maximum = bigger;
        } else if(smaller<=minimum){
            minimum = smaller;
        }
        sum+=myArr[i];  
        }
       
    }

    average = sum/20;

    cout<<"The maximum number from the 20 given numbers is: "<<maximum<<endl;
    cout<<"The minimum number from the 20 given numbers is: "<<minimum<<endl;
    cout<<"The average number from the 20 given numbers is: "<<average<<endl;

    return 0;
}