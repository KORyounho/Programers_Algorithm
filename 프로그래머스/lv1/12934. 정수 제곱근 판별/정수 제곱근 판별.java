class Solution {
    public long solution(long n) {
        long answer = 0;
        while(n>answer*answer)
        {
            answer = answer+1;    
        }
        if(n==answer*answer)
            answer = (answer+1)*(answer+1);
        else
            return -1;
        return answer;
    }
}