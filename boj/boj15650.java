import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj15650{

    public static void main(String[] args) throws IOException {
        solve s = new solve();
        s.input();
        s.run();
    }
}

class solve{
    int N, M;
    boolean[] arr;
    StringBuffer result = new StringBuffer();

    public void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new boolean[N];
    }

    public void print(){
        for(int i = 0; i<N; i++){
            if(arr[i]==true){
                result.append((i+1) + " ");
            }
        }
        result.append("\n");
    }

    public void DFS(int idx, int num){
        if(num == M){
            print();
        }
        for(int i = idx; i<N; i++){
            if(arr[i] == true){

            }
            arr[i] = true;
            DFS(i+1, num+1);
            arr[i] = false;
        }

    }

    public void run(){
        DFS(0, 0);
        System.out.println(result);
    }
}