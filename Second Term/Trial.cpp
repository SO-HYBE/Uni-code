#include<iostream>
#include<string.h>
using namespace std;

int main(){
    char name[9][10]= {"mona", "bahaa", "tarek", "ali", "ahmed", "tamer", "samir", "sameh", "nadir" };
    char temp[10];
    int min;

    for(int i = 0; i<=7; i++){
        min = i;
        for(int j = i+1;j<=8;j++){
            if(strcmp(name[min],name[j])>0){
                min = j;
            }
        }
        strcpy(temp,name[i]);
        strcpy(name[i],name[min]);
        strcpy(name[min],temp);

    }

    for(int i=0; i<=8; i++){
        cout<<name[i]<<endl;
    }

    return 0;
}