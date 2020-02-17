import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj2839{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int set3 = 0, set5 = 0;

        if((N%5) % 3 == 0){
            set5 = N/5;
            set3 = (N - (set5*5))/3;

        }
        else{
            int temp = N%5;
            if((temp == 4) || (temp == 1) || (temp==3)){
                set5 = N/5 - 1;
                set3 = (N - (set5*5)) / 3;
            }
            else{
                set5 = N/5 -2;
                set3 = (N - (set5*5)) / 3;
            }
            // can not be divisioned to 0 

            if((N - (set5*5)) % 3 != 0){
                set5 = 0;
                set3 = 0;
            }
        }
        if((set3 ==0) && (set5 == 0)){
            System.out.println(-1);
        }
        else if((set3 < 0) || (set5 < 0)){
            System.out.println(-1);
        }
        else{
            System.out.println(set5+set3);
        }
    }
    // 11, 14
}