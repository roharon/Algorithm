import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

class boj10989{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  
        ArrayList<Integer> data = new ArrayList<Integer>();
        
        StringBuffer sb = new StringBuffer();

        for(int idx = 0; idx < N; idx++){
            data.add(Integer.parseInt(br.readLine()));
        }
        // input array

        int maxValue = Collections.max(data);

        int[] countArr = new int[maxValue+1];
        int[] result = new int[N];

        for(int idx = 0; idx < N; idx++){
            countArr[data.get(idx)] += 1;
        }
        //counting number on data ()

        for(int idx = 1;  idx < maxValue+1; idx++){
            countArr[idx] += countArr[idx-1];
        }
        // count sum

        for(int idx = N-1; idx>=0; idx--){
            result[--countArr[data.get(idx)]] = data.get(idx);
        }
        //sort

        for(int idx = 0; idx < N; idx++){
            sb.append(result[idx] + "\n");
        }

        System.out.println(sb);
    }
}