class Solution {
    public int [] numbers;
    int target;
    int answer;
    public void target_number(int ind, int sum){
        if(numbers.length == ind){
            if(target == sum)
                answer++;
            return;
        }
        target_number(ind+1, sum+numbers[ind]);
        target_number(ind+1, sum-numbers[ind]);
        
    }
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        answer = 0;
        target_number(0, 0);
        return answer;
    }
    
}