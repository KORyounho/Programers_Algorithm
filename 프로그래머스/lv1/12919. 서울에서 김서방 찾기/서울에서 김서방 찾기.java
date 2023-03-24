class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int num = 0;
        // for(int i = 0; seoul[i].equals("Kim"); i++)
        // {
        //     num = i;
        // }
        while(!seoul[num].equals("Kim"))
        {
            num ++;
        }
        
        answer = answer + String.valueOf(num) + "에 있다";
        return answer;
    }
}