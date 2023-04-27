import java.util.Scanner;

public class Main {
    Main(int n, int arr[]) {
        for(int i = 0; i<n-1; i++)
        {
            for(int j = 0; j<n-i-1; j++)
            {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    };
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] list = new int[n];

        for(int i = 0; i<n; i++)
        {
            list[i] = s.nextInt();
        }

        Main arr = new Main(n, list);
        for(int i = 0; i<n; i++) {
            System.out.println(list[i]);
        }
    }
}
