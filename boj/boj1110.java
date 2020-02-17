import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int temp = N;

        for (int count = 1;; count++) {
            temp = ((temp % 10) * 10) + (((temp / 10) + (temp % 10)) % 10);

            if (temp == N) {
                temp = count;
                break;
            }
        }

        System.out.println(temp);
    }
}