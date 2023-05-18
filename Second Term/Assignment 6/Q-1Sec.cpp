#include<iostream>
using namespace std;

class Counter {
    private:
    int num , count;
    public:

    Counter(){
        count = 0;
    };
    void set_counter(){
        count = 0;
    }
    void set_incCount(){
        count++;
    }
    void set_decCount(){
        if(count>0){
            count--;
        }
    }
    int get_count(){
        return count;
    }
    void print_count(){
        cout<<"The count is : "<<count;
    }

};

int main(){
    Counter count;
    Counter count2;
    count.set_incCount();
    count.set_incCount();
    count.set_incCount();
    count.set_decCount();
    count.print_count();
    
    count2.set_incCount();
    count2.set_counter();
    cout<<endl<<"The second counter is at zero: "<<count2.get_count();
    return 0;
}