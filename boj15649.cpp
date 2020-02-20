#include <iostream>
#include <vector>

using namespace std;

int N,M;
vector<int> v;
bool way[100];

void DFS(int depth){
    if(depth==M){
        //print v
        for(int i = 0; i<v.size(); i++){
            printf("%d ", v.at(i));
        }
        printf("\n");
        return;
    }
    for(int idx = 0; idx < N; idx++){
        if(way[idx]==true){
            continue;
        }
        way[idx] = true;
        v.push_back(idx+1);
        DFS(depth+1);
        way[idx] = false;
        v.pop_back();
    }

}

void start(){
    DFS(0);
}

int main(){
    scanf("%d %d", &N,&M);

    start();
    return 0;
}