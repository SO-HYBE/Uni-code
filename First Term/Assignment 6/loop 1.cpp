#include<iostream>

#include<conio.h>

using namespace std;

int main()
{   int index = 1,x;
    string grade;
    for(int i=0; i<10; i++) {
        cout<<"Please enter a score"<<endl;
        cin>>x;
        
        if(x<0 || x>100){
            cout<<"Invalid score. Please enter a score between 0 and 100.";
        } else {
            if( x >= 90){
                grade = "A";
            } else if( x >= 80){
                grade = "B";
            } else if ( x >= 70){
                grade = "C"; 
            } else if ( x >= 60){
                grade = "D";
            } else {
                grade = "E";
            }
            cout<<"Student "<<index<<"'s grade is "<< grade;
            index++;
            cout<<endl;  
        }
    };

    return 0;
}
