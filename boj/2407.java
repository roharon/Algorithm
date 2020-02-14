import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        BigInteger result = BigInteger.ONE;
        BigInteger M_fac= BigInteger.ONE;

        int near = N-M < M ? N-M : M;

        for(int n = N; n > N-near; n--){
            result = result.multiply(BigInteger.valueOf(n));
        }

        for(int m = 1; m<=near; m++){
            M_fac = M_fac.multiply(BigInteger.valueOf(m));
        }

        System.out.println(result.divide(M_fac));

    }
}