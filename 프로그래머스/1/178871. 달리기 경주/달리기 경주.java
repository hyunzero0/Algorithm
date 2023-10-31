import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        for(int i = 0; i < players.length; i++) {
            rank.put(players[i], i); // key : 선수 이름, value : 순위
        }
        
        for(String player : callings) {
            int playerRank = rank.get(player); // callings 선수의 현재 순위
            String beforePlayer = players[playerRank - 1]; // 앞 선수 이름
            
            players[playerRank] = beforePlayer;
            players[playerRank - 1] = player;
            
            rank.put(player, playerRank - 1);
            rank.put(beforePlayer, playerRank);
        }
        
        return players;
    }
}