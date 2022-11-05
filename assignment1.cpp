#include<iostream>

#include<conio.h>

using namespace std;

int main()
{

    int hours, days, nHours;
    cout<<"Input the number of hours: ";
    cin>>hours;
    days=hours/24;
    nHours=hours-(days*24);
    cout<<"Number of days in the given hours: "<<days<<"/n"<<"Number of hours left: "<<nHours;
    

}
