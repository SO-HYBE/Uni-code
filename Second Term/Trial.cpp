#include <iostream>
#include <cstring>
#include <cctype>

using namespace std;

int main() {
    string str;
    cout<<"Enter a string to get sorted: "<<endl;
    cin>>str;
    const char* cstr = str.c_str();
    int length = str.length();

    char sortedStr[length + 1];
    int sortedIndex = 0;

    for (int i = 0; i < length; i++) {
        if (isalpha(cstr[i])) {
            sortedStr[sortedIndex] = cstr[i];
            sortedIndex++;
        }
    }

    for (int i = 0; i < sortedIndex - 1; i++) {
        for (int j = i + 1; j < sortedIndex; j++) {
            if (strcmp(&sortedStr[i], &sortedStr[j]) > 0) {
                char temp = sortedStr[i];
                sortedStr[i] = sortedStr[j];
                sortedStr[j] = temp;
            }
        }
    }

    cout << "Sorted string: " << sortedStr << endl;

    return 0;
}