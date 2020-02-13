#include <iostream>
#include <map>

using namespace std;

int main(){

    int M,N, temp;
    string result = "";

    cin >> M;

    int* Marr = new int[M];
    map<int, string> m_arr;

    for(int idx = 0; idx<M; idx++){
        cin >> temp;

        m_arr.insert(make_pair(temp, "1"));
    }

    cin >> N;

    for(int idx = 0; idx < N; idx++){
        cin >> temp;
        //cout << findInArr(Marr, M, temp) << endl;
        result+=to_string(m_arr.count(temp))+"\n";
        //result += m_arr.count(temp);
    }

    cout << result;
    return 0;
}