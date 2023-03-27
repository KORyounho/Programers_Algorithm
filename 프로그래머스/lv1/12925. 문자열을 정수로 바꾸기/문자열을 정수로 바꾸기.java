class Solution {
     static int zisu(int a, int b)
    {
        int result= 1;
        for(int i = 0; i<b; i++)
            result = result*a;
        return result;
    }
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0) != '-'){
            for(int i = 0; i<s.length(); i++)
                if('0'<=s.charAt(i) && s.charAt(i)<='9')
                    answer += ((int)s.charAt(i)-48) * zisu(10, s.length()-1-i);
        }
        else
            for(int i = 1; i<s.length(); i++)
                if('1'<=s.charAt(i) && s.charAt(i)<='9')
                    answer -= ((int)s.charAt(i)-48)*zisu(10, s.length()-1-i);
                    //^(s.length()-i);
        return answer;
    }
}