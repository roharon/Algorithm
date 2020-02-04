#include <iostream>

#define SUM(x,y,z) x+y+z

using namespace std;

int main(){

    int N, M;
    
    cin >> N >> M;

    int* cards = new int(N);

    int card1 = 0;
    int card2 = 0;
    int card3 = 0;

    int max_number = 0;

    for(int cnt = 0; cnt < N; cnt++){
        cin >> cards[cnt];
    }

    for(int first = 0; first < N-2; first++){
        card1 = cards[first];

        for(int second = first+1; second < N-1; second++){
            card2 = cards[second];
        
                for(int third = second+1; third < N; third++){
                    card3 = cards[third];

                    int card_sum = SUM(card1,card2,card3);

                    if((card_sum <= M) && (card_sum > max_number)){
                        max_number = card_sum;

                        if(max_number == M){
                            cout << max_number;
                            return 0;
                        }
                    }
                }
        }
    }

    cout << max_number;

    return 0;
}