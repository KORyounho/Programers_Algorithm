import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int qut = 0;
        int dim = 0;
        int nic = 0;
        int pen = 0;

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++){
            int Num = Integer.parseInt(br.readLine());
            while(Num != 0){
                if(Num>=25){
                    qut = Num/25;
                    Num = Num%25;
                }
                else if(Num>=10){
                    dim = Num/10;
                    Num%=10;
                }
                else if(Num>=5){
                    nic = Num/5;
                    Num%=5;
                }
                else{
                    pen = Num;
                    Num = 0;
                }
            }
            System.out.println(qut + " " + dim + " " + nic + " " + pen);
            qut = dim = nic = pen = 0;
        }
    }
}