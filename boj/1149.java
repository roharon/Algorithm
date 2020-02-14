import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int count = Integer.parseInt(br.readLine());

        int[][] arr = new int[count+1][3];
        int[][] result = new int[count+1][3];

        for(int idx = 0; idx < count; idx++){
            st = new StringTokenizer(br.readLine());

            arr[idx][0] = Integer.parseInt(st.nextToken());
            arr[idx][1] = Integer.parseInt(st.nextToken());
            arr[idx][2] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= count; i++){
            result[i][0] = Math.min(result[i-1][1], result[i-1][2]) + arr[i-1][0];
            result[i][1] = Math.min(result[i-1][0], result[i-1][2]) + arr[i-1][1];
            result[i][2] = Math.min(result[i-1][1], result[i-1][0]) + arr[i-1][2];
            // result는 count+1크기(초기 i-1가 범위 안에 있기 위해서)
            // arr배열은 count크기만큼임을 주의
            // 따라서 뒤에붙는 arr은 현재 자리의 비용이 됨
        }

        System.out.println(Math.min(result[count][0], Math.min(result[count][1], result[count][2])));

    }
}