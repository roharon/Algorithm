#include <iostream>

using namespace std;

int main(){
    int max;
    string result = "";

    scanf("%d", &max);
    
    for(int i = 1; i <= max;i++){
        for(int idx = 0; idx<i;idx++){
            result += "*";
        }
        result+="\n";
    }

    printf("%s", result.c_str());
    return 0;
}