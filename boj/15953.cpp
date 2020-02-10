#include <iostream>

#define MANWON(X) (X)*10000

using namespace std;

int festival_1(int rank){
    if(rank==1){
        return 500;
    }
    else if(rank<=3 && 2<=rank){
        return 300;
    }
    else if(4<=rank && rank<=6){
        return 200;
    }
    else if(7<=rank && rank<=10){
        return 50;
    }
    else if(11<=rank && rank<=15){
        return 30;
    }
    else if(16<=rank && rank<=21){
        return 10;
    }
    else{
        return 0;
    }
}

int festival_2(int rank){
    if(rank==1)
        return 512;
    else if(2<=rank && rank<=3)
        return 256;
    else if(4<=rank && rank<=7)
        return 128;
    else if(8<=rank && rank<=15)
        return 64;
    else if(16<=rank && rank<=31)
        return 32;
    else
        return 0;
}

int main(){

    int first_rank, second_rank;
    int count;

    cin >> count;
    
    for(int i = 0; i<count; i++){
        cin >> first_rank >> second_rank;

        cout << MANWON(festival_1(first_rank)+festival_2(second_rank)) << endl;
    }

    return 0;
}