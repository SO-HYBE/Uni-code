#include <iostream>
#include <string>
#include <cctype>

using namespace std;

int main() {
    string s;
    cout<<"Enter a string to sort out: ";
    cin>>s;

    // Remove numbers and punctuation symbols from the string
    string filtered_string = "";
    for (char c : s) {
        if (isalpha(c)) {
            filtered_string += c;
        }
    }

    // Sort the characters in the filtered string using selection sort
    for (int i = 0; i < filtered_string.length() - 1; i++) {
        int min_index = i;
        for (int j = i + 1; j < filtered_string.length(); j++) {
            if (filtered_string[j] < filtered_string[min_index]) {
                min_index = j;
            }
        }
        if (min_index != i) {
            char temp = filtered_string[i];
            filtered_string[i] = filtered_string[min_index];
            filtered_string[min_index] = temp;
        }
    }

    // Print the sorted string
    cout << "Sorted string: " << filtered_string << endl;

    return 0;
}
