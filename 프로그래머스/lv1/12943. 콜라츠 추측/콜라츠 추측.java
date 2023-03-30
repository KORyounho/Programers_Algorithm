class Solution {
//     public static int count = 0;
//     public static int colla(long num)
//     {
//         if(num == 1)
//             if(count > 500)
//                 return -1;
//             else
//                 return count;
//         else
//             if(num%2 == 0){
//                 count++;
//                 return colla(num/2);
//             }
//             else{
//                 count++;
//                 return colla(num*3+1);
//                 }
        
//     }
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
        if(answer >500)
            answer = -1;
        //int answer = colla((long)num);
        return answer;
    }
}