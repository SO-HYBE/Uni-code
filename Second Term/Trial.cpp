#include<iostream>
using namespace std;

int main(){
    string original, nString, comparison;
    comparison = "SoftwareTestingHelp";
    cout<<"enter a string: "<<endl;
    getline( cin, original);
    cout<<"The length of the string is: "<<original.length()<<endl;
    if(original==comparison){
        cout<<"Two strings are equal"<<endl;
    } else {
        cout<<"Two strings are not equal"<<endl;
    }
    comparison += ".com";

    cout<<"The length of string \" "<<comparison<<" \" is: "<<comparison.size();

    return 0;
}