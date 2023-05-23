#include<iostream>
#include<fstream>
#include<string.h>
using namespace std;

int main(){
    int wordCount, charCount=0;
    string word;
    fstream myFile("E:/HYBE/Projects/Uni-code/Second Term/files/test.txt", ios::in | ios::out);

    while (myFile >> word) {
        wordCount++;
        charCount += word.length();
    }
    cout<<"The number of characters in the file is: "<<charCount<<endl;
    cout<<"The number of words in the file is: "<<wordCount<<endl;
}