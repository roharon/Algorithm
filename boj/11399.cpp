#include <iostream>
#include <algorithm>

using namespace std;

int main(){

    int people_size;
    int result = 0;
    int temp = 0;

    cin >> people_size;

    int *time = new int(people_size);

    for(int i = 0; i<people_size; i++){
        cin >> time[i];
    }

    sort(time, &time[people_size]);

    for(int i = 0; i < people_size; i++){
        temp += time[i];
        result += temp;
    }

    cout << result;

    return 0;
}