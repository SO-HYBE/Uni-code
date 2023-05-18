#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    string filename = "test.txt";
    ifstream file(filename);

    if (!file.is_open()) {
        cout << "Error: Failed to open file " << filename << endl;
        return 1;
    }

    string content;
    file.seekg(0, ios::end);
    content.reserve(file.tellg());
    file.seekg(0, ios::beg);
    content.assign((istreambuf_iterator<char>(file)),
                    istreambuf_iterator<char>());

    int num_words = 0;
    int num_chars = content.length();
    bool in_word = false;

    for (char c : content) {
        if (isspace(c)) {
            in_word = false;
        } else if (!in_word) {
            in_word = true;
            num_words++;
        }
    }

    cout << "The number of words in the file " << filename << " are: " << num_words << endl;
    cout << "The number of characters in the file " << filename << " are: " << num_chars << endl;

    return 0;
}





