import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] scoreArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreArr, Collections.reverseOrder());
        
        for(int i = 1; i <= scoreArr.length / m; i++) {
            answer += scoreArr[i * m - 1] * m;
        }
        
        return answer;
    }
}