import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        // 알파벳 List 생성
        List<Character> eng = new ArrayList<>();
        for(int i = 'a'; i <= 'z'; i++) {
            eng.add((char)i);
        }
        
        // 알파벳 List에서 skip 알파벳 제거
        for(Character c : skip.toCharArray()) {
            eng.remove(c);
        }
        
        for(int i = 0; i < s.length(); i++) {
            int in = eng.indexOf(s.charAt(i)) + index;
            
            if(in >= eng.size()) {
                answer += eng.get((in - eng.size()) % eng.size());
            } else {
                answer += eng.get(in);
            }
        }
        
        return answer;
    }
}