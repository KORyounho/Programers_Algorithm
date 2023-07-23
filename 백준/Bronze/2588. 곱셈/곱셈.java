import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int copy = b;
        int size = 0;
        while(copy!=0){
            copy = copy/10;
            size++;
        }
        int [] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = b%10;
            b = b/10;
        }
        int result = 0;
        for(int i = 0; i<size; i++){
            result = (int) (result+(arr[i]*a) * Math.pow(10, i));
            sb.append(arr[i]*a).append('\n');
        }
        sb.append(result);
        System.out.println(sb);
    }
}