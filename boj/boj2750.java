import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

class boj2750{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int idx = 0; idx<N; idx++){
            arr[idx] = Integer.parseInt(br.readLine());
        }

        insertionSort(arr, N);

        for(int idx = 0; idx<N; idx++){
            sb.append(arr[idx] + "\n");
        }

        System.out.println(sb);
    }

    public static int[] insertionSort(int[] data, int size){

        int prev, temp;
        for(int idx = 1; idx<size; idx++){
            temp = data[idx];
            prev = idx-1;

            while((prev >= 0) && (temp < data[prev])){
                data[prev+1] = data[prev--];
            }
            data[prev+1] = temp;
        }

        return data;
    }
}