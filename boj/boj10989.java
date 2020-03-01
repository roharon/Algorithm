import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

class boj10989{
    static final int max = 10001;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        short[] data = new short[max]; 
        
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        short temp;

        for(int idx = 0; idx < N; idx++){
            temp = Short.parseShort(br.readLine());
            data[temp]++;
        }

        for(int idx = 1; idx<max; idx++){
            //cuz in this problem,
            //input numbers are natural number. So it starts at 1
            for(int num = 0; num < data[idx]; num++){
                sb.append(idx + "\n");
            }
        }
        // input array

        System.out.println(sb);
    }
}