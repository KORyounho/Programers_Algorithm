import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for(int i = 0; i<arr.length; i++)
        {   
            if(arr[i]%divisor == 0)
                count++;
        }
        if(count == 0){
            int[]answer = {-1};
            return answer;
        }
        else{
        int[] ind = new int[count];
        int[] answer = new int[count];
            
        int z = 0;
        
        for(int j = 0; j<arr.length; j++)
        {   
            if(arr[j]%divisor == 0)
                ind[z++] = j;
        }
        for(int k = 0; k<count; k++)
        {
            answer[k] = arr[ind[k]];
        }  
        Arrays.sort(answer);
        return answer;
        }
    }
}