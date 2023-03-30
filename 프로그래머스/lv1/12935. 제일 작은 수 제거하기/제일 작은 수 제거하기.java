
class Solution {
    public int[] solution(int[] arr) {
        int small = arr[0];
        int ind = 0;
        if(arr.length == 1)
        {
            int[] answer = {-1};
            return answer;
        }
        else{
            int[] answer = new int[arr.length -1];
            for(int i =0; i<arr.length;i++ )
            {
                if(small > arr[i]){
                    small = arr[i];
                    ind = i;
                }
            }
            for(int j =0; j<ind; j++){
                answer[j] = arr[j];
            }
            for(int k = ind+1;k<arr.length; k++)
                answer[k-1] = arr[k];
            
            return answer;
        }
    }
}