#include <iostream> 
using namespace std;
 
int main() {
   string str;

    cout<<"Enter a string to reverse: ";
    cin>>str;

   char letter;
   for (int i = 0, len = str.length(); i < len/2; i++) {
      letter = str[i];
      str[i] = str[len-1-i];
      str[len-1-i] = letter;
   }
 
   cout << str << endl;
}