class Solution {
    public boolean solution(int x) {
        int sum = 0;
        
        String[] arr = Integer.toString(x).split("");
        
        for(String num : arr) {
            sum += Integer.parseInt(num);
        }
        
        if(x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}