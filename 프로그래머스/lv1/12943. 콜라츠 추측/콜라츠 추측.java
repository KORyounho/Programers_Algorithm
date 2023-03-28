class Solution {
    public int solution(int num) {
        int answer = 0;
        long nu = (long)num;
        while(nu!=1)
        {
            answer++;
            if(nu%2 == 0)
                nu = nu/2;
            else
                nu = nu*3 + 1;
        }
        return answer < 500 ? answer : -1;
    }
}