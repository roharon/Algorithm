import java.util.Scanner;

public class boj11718{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){
            String sentence = sc.nextLine();
            System.out.println(sentence);
        }
        sc.close();
    }
}