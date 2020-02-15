import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class boj1049{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N, M;
        int bestPack, bestPiece;
        int result;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        bestPack = Integer.parseInt(st.nextToken());
        bestPiece = Integer.parseInt(st.nextToken());

        int temp;
        for(int i = 1; i<M; i++){
            st = new StringTokenizer(br.readLine());
            temp = Integer.parseInt(st.nextToken());

            if(bestPack > temp){
                bestPack = temp;
            }

            temp = Integer.parseInt(st.nextToken());
            if(bestPiece > temp){
                bestPiece = temp;
            }
        }

        result = ((N/6)*bestPack) + ((N%6)*bestPiece);

        temp = N*bestPiece;

        if( temp < result){
            result = temp;
        }

        temp = ((N/6)*bestPack) + ((N%6)*bestPiece);
        if(temp < result){
            result = temp;
        }

        temp = ((N/6)+1) * bestPack;

        if(temp < result){
            result = temp;
        }

        System.out.println(result);
    }
}