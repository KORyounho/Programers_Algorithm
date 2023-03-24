class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int swap = 0;
        if(a>b){
            swap = a;
            a = b;
            b = swap;
        }
            
        for(int i = a; i<=b; i++){
            answer +=i;
        }
        return answer;
    }
}