import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class boj2292{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int min = 1;
        int max = 1;
        int result = 1;
        int temp = 1;

        int index=1;

        while(!((min<=N)&&(N<=max))){
            index++;
            temp = result;
            result = 6*(index-1) + temp;
            
            max = result;
            min = temp+1;
        }

        System.out.println(index);
    }
}