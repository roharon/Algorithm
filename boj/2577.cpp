#include <iostream>
#include <map>

using namespace std;

int main(){

    int num;
    int result=1;

    while(scanf("%d", &num) != EOF){
        result *= num;
    }

    map<int, int> numeric;

    for(int temp=result; temp>0;temp/=10){
        ++numeric[temp%10];
    }

    for(int i = 0; i<10;i++){
        printf("%d\n", numeric[i]);
    }
    return 0;

}