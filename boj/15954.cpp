#include <iostream>
#include <cmath>

using namespace std;

typedef double ld;

ld get_m(int K, int idx, int array[]){
    
    ld m = 0;
    for(int i =idx; i<idx+K; i++){
        m+=array[i];
    }

    return ld(m/K);
}

ld get_b(int K, int idx, int arr[], ld m){
    
    ld b=0;

    for(int i = idx; i < idx+K; i++){
        b += ((arr[i]-m)*(arr[i]-m));
    }

    b = b/K;

    return sqrt(b);
}

int main(){

    int N,K;
    ld minimum = 9999999;
    ld M, B;

    cin >> N >> K;

    int* dolls_like = new int[N];

    for(int i = 0; i<N; i++){
        cin >> dolls_like[i];
    }

    for(int _k = K; _k <= N; _k++){
        for(int idx = 0; idx<=N-_k; idx++){

            M = get_m(_k, idx, dolls_like);            
            B = get_b(_k, idx, dolls_like, M);
                        
            if(B<minimum){
                minimum=B;
            }
        }
    }

    printf("%.15f", minimum);
}