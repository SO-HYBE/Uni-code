#include<iostream>
using namespace std;

struct Employee {
    int emp_id;
    char emp_name[50];
    double emp_salary;
};

void read(Employee &empl){
    cin>>empl.emp_id;
    cin>>empl.emp_name;
    cin>>empl.emp_salary;
}

bool searchEmployeeById(Employee empArr[20], int numEmployees, int id) {
    for (int i = 0; i < numEmployees; i++) {
        if (empArr[i].emp_id == id) {
            return true;
        }
    }

    return false;
}

main(){
    Employee empArr[20];

    for(int i=0; i<20; i++){
        cout<<"Enter the id, name, and the salary of employee "<<i+1<<" , respectively."<<endl;
        read(empArr[i]);
    }

    int idToSearch;
    cout << "Enter employee ID to search for: ";
    cin >> idToSearch;

    bool found = searchEmployeeById(empArr, 20, idToSearch);

    if (found) {
        cout << "Employee with ID " << idToSearch << " found." << endl;
    } else {
        cout << "Employee with ID " << idToSearch << " not found." << endl;
    }

    return 0;
}