#include <iostream>
#include <map>

using namespace std;

int main(){

    int M,N, temp;
    string result = "";

    scanf("%d", &M);

    int* Marr = new int[M];
    map<int, string> m_arr;

    for(int idx = 0; idx<M; idx++){
        scanf("%d", &temp);

        m_arr.insert(make_pair(temp, "1"));
    }

    scanf("%d", &N);

    for(int idx = 0; idx < N; idx++){
        scanf("%d", &temp);
        //cout << findInArr(Marr, M, temp) << endl;
        result+=to_string(m_arr.count(temp))+"\n";
        //result += m_arr.count(temp);
    }

    printf("%s", result.c_str());

    return 0;
}