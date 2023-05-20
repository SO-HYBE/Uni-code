#include<iostream>
using namespace std;

void desc(int end, int start){
    for(int i=end; i>=start;i--){
        for(int j=0; j<i;j++){
            cout<<"#";
        }
        cout<<endl;
    }
}

void asc(int start, int end){
    for(int i=start; i<=end;i++){
        for(int j=0; j<i;j++){
            cout<<"#";
        }
        cout<<endl;
    }
}


int main(){
    desc(8,5);
    cout<<"reverse"<<endl;
    asc(3,5);
    cout<<"again"<<endl;
    desc(4,5);
    cout<<"reverse"<<endl;
    asc(2,3);
    return 0;
}