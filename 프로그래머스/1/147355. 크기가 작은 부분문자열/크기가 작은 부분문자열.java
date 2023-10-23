class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long pLong = Long.valueOf(p);
            
        for(int i = 0; i <= t.length() - p.length(); i++) {
            String result = t.substring(i, i + p.length());
            Long resultLong = Long.valueOf(result);
            if(pLong >= resultLong) {
                answer++;
            }
        }
        
        return answer;
    }
}