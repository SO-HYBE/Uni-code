#include<iostream>

#include<conio.h>

using namespace std;

int main()
{
    int x;
    cout<<"Enter a number please: ";
    cin>>x;
    if(x<0){
        cout<<"Negative Number!";
    } else if(x>0 && x<9){
        switch(x){
            case 1: cout<<"One"; break;
            case 2: cout<<"Two"; break;
            case 3: cout<<"Three"; break;
            case 4: cout<<"Four"; break;
            case 5: cout<<"Five"; break;
            case 6: cout<<"Six"; break;
            case 7: cout<<"Seven"; break;
            case 8: cout<<"Eight"; break;
            case 9: cout<<"Nine"; break;
            default:
            cout<<"The number is not between 0 and 9"; break;

        }
    } else{
        cout<<"Large Number!";
    }
    return 0;
}
