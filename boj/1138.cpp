#include <iostream>

using namespace std;

int main()
{
    int N;
    cin >> N;

    int* people = new int[N];
    int* result = new int[N];

    for (int i = 0; i < N; i++)
    {
        cin >> people[i];
        result[i] = 0;
    }

    for (int index = 0; index < N; index++)
    {
        int tall_amount = people[index];

        for(int count = 0; count<N; count++)
        {
            if ((tall_amount == 0) && (result[count] == 0))
            {
                result[count] = index+1; 
                break;
            }
            
            else if(result[count]==0){
                tall_amount--;
            }
        }
    }

    for (int i = 0; i < N; i++)
    {
        cout << result[i] << " ";
    }

    return 0;
}