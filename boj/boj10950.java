import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.lang.StringBuffer;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj10950{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        System.out.println(N);
        int A,B;

        StringBuffer result = new StringBuffer();
        
        for(int idx = 0; idx<N; idx++){
            st = new StringTokenizer(br.readLine());
            A=Integer.parseInt(st.nextToken());
            B=Integer.parseInt(st.nextToken());

            result.append(A+B + "\n");
        }

        System.out.println(result);
    }
}