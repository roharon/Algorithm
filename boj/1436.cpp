#include <iostream>

using namespace std;

int main(){

    int input;
    cin >> input;

    int count = 0;
    int i;

    for (i = 666; count < input;i++){
        int temp = i;

        while (temp > 0){
            if (temp % 1000 == 666){
                count++;
                break;
            }
            else{
                temp /= 10;
            }
        }
    }

    cout<<i-1<<endl;
    // i++가 실행되니 i-1 로 함 

    return 0;
}