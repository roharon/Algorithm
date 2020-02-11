#include <iostream>

using namespace std;
int main()
{

    int count;
    int result = 0;

    cin >> count;

    char* sentence = new char[count];

    cin >> sentence;

    for (int i = 0; i < count; i++)
    {
        result+=sentence[i] - 48;
    }

    cout<<result;

    return 0;
}