import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] num = new int[3];
        for(int i = 0; i<3; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int [] arr = new int[4];

        arr[0] = (num[0]+num[1])%num[2];
        arr[1] = ((num[0]%num[2])+(num[1]%num[2]))%num[2];
        arr[2] = (num[0]*num[1])%num[2];
        arr[3] = ((num[0]%num[2])*(num[1]%num[2]))%num[2];
        for (int i : arr) {
            System.out.println(i);
        }
    }
}