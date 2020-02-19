import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.StringBuffer;

public class boj2309{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        ArrayList<Integer> result = new ArrayList<Integer>();
        StringBuffer sb = new StringBuffer();
        Boolean pass = false;

        for(int i = 0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int first = 0; first < 3 && !pass; first++){
            for(int sec = first+1; sec < 4 && !pass; sec++){
                for(int thr = sec+1; thr < 5 && !pass; thr++){
                    for(int four = thr+1; four < 6 && !pass; four++){
                        for(int five = four+1; five < 7 && !pass; five++){
                            for(int six = five+1; six < 8 && !pass; six++){
                                for(int sev = six+1; sev < 9 && !pass; sev++){
                                    if(arr[first] + arr[sec] + arr[thr] + arr[four] + arr[five] + arr[six] + arr[sev] == 100){
                                        result.add(arr[first]);
                                        result.add(arr[sec]);
                                        result.add(arr[thr]);
                                        result.add(arr[four]);
                                        result.add(arr[five]);
                                        result.add(arr[six]);
                                        result.add(arr[sev]);

                                        pass=true;
                                        break;
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
        
        result.sort(null);

        for(int i = 0; i<7; i++){
            sb.append(result.get(i) + "\n");
        }
        System.out.println(sb);
    }
}