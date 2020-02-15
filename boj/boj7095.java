import java.io.InputStreamReader;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.Math;

public class boj7095{
    //7095
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger bi = BigInteger.valueOf((long)Math.pow(10, N));
        StringBuffer result = new StringBuffer();
        int count = 0;
        int num = 1;

        for(int i = 1; (int)Math.log10(num)+1 <= N;i++){
            if((int)Math.log10(num) + 1 == N){
                count++;
                result.append(i-1 + "\n");
            }

            num *= i;
        }

        if(count == 0){
            System.out.println("NO");
        }
        else{
            System.out.println(count);
            System.out.println(result);
        }

    }
}