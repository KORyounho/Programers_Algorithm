import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N-i-1; j++){
                sb.append(" ");
            }
            for(int j = N; j>=N-i; j--){
                sb.append("*");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}