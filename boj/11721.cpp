#include <iostream>

using namespace std;

int main(){
    char sentence[100];

    cin >> sentence;

    string word = "";

    int count = 1;
    for(int i = 0; sentence[i]!=NULL;i++, count++){
        
        word += sentence[i];
        if(count%10==0){
            cout<<word<<endl;
            word = "";
        }
    }
    cout<<word<<endl;
    return 0;
}