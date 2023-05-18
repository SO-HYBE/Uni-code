#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main() 

{
     ofstream ofile; 
	 ifstream ifile; 
  int i,n;
  string str;
  string fname;
  char str1;
  
	cout<<"\n\n Append multiple lines at the end of a text file :\n";
	cout<<"------------------------------------------------------\n"; 
	cout<<" Input the file name to be opened : ";
	cin>>fname;		
    ofile.open(fname,ios::app ); 
    cout<<" Input the number of lines to be written : ";
    cin>>n;	
    cout<<" The lines are : \n";  
    for(i = 0; i < n+1;i++)
    {
   getline(cin,str);
    ofile<<str<<"\n";
  }
  ofile.close();
ifile.open(fname );  
	cout<<"\n The content of the file  is  :\n";
	
	while ( !ifile.eof())
		{
			getline(ifile,str);
			cout<<str;
			cout<<"\n";
		}
  
   ifile.close();
  return 0;
}
