#include<iostream>
#include<fstream>
#include<string.h>
using namespace std;

class Rectangle{
    private:
    int W, L;
    
    public:
    Rectangle(){
    }
    Rectangle(int w, int l){
        W=w;
        L=l;
    }
    int calcArea(){
        return W*L;
    }
    void set_W(int wid){
        W=wid;
    }
    void set_L(int len){
        L=len;
    }
    int get_W(){
        return W;
    }
    int get_L(){
        return L;
    }
};

void rectangleResult(){
    Rectangle num1, num2;
    num1.set_L(10);
    num1.set_W(10);
    num2.set_L(5);
    num2.set_W(5);
    int result1 = num1.calcArea();
    int result2 = num2.calcArea();

    cout<<"The result of rectangle 1 = "<<result1<<endl;
    cout<<"The result of rectangle 2 = "<<result2<<endl;
    
}

int main(){

    rectangleResult();

    return 0;
}