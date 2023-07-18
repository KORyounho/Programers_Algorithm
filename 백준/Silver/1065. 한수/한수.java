import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(isTrue(N));

    }

    public static int isTrue(int n) {
        if (n < 100) {
            return n;
        }

        int [] arr = new int[3];
        int count = 99;
        for(int i = 100; i<=n; i++){
            arr[2] = i%10;
            arr[1] = (i/10)%10;
            arr[0] = i/100;

            if(arr[2]-arr[1] == arr[1]-arr[0]) {
                count++;
            }
        }
        return count;
    }
}