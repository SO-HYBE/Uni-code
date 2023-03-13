#include<iostream>
#include<conio.h>

using namespace std;

int main () {
    int x , y = 0, bigger = 0, smaller = 0, maximum = 0 , minimum, sum=0, average;
    for(int i=0; i<10; i++){
        cout<<"Please enter a number: "<<endl;
        cin>>x;
        if(y>=x){
            bigger = y;
            smaller = x;
        } else {
            bigger = x;
            smaller = y;
        }
        if(bigger>=maximum){
            maximum = bigger;
        };
        
        if(smaller<=minimum){
            minimum = smaller;
        }
        sum+=x;
        y=x;

    }

    average = sum/10;

    cout<<"The maximum number from the 10 given numbers is: "<<maximum<<endl;
    cout<<"The minimum number from the 10 given numbers is: "<<minimum<<endl;
    cout<<"The average number from the 10 given numbers is: "<<average<<endl;

    return 0;
}