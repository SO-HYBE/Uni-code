#include <iostream>
using namespace std;

struct Employee {
    int emp_id;
    string emp_name;
    int emp_salary;
};

void read(struct Employee emp[],int len){
    for(int i=0;i<len;i++){
    cout<<"Enter the ID , NAME , SALARY of employee "<<i+1<<" : "<<endl;
    cin>>emp[i].emp_id;
    cin>>emp[i].emp_name;
    cin>>emp[i].emp_salary;
    }
}


void search(struct Employee emp[], int id, int len){
    for(int i=0; i<len; i++){
        if(emp[i].emp_id == id){
            cout<<"The Employee ID entered was found in the array!"<<endl<<emp[i].emp_id<<endl;
        } else {
            cout<<"The Employee ID entered was not found in the array."<<endl;
        }
    }
}


int main(){
    struct Employee empl[2];

    read(empl, 2);

    for(int i = 0 ; i<2; i++){
        cout<<empl[i].emp_id<<endl;
        cout<<empl[i].emp_name<<endl;
        cout<<empl[i].emp_salary<<endl;
    }
    
    
    search(empl, 2, 2);
}