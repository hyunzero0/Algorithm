class Solution {
    public int solution(int n) {
        int odd = 0;
        int even = 0;

        for(int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                odd += i;
            } else {
                even += i * i;  
            }
        }
        
        return n % 2 == 1 ? odd : even;
    }
}