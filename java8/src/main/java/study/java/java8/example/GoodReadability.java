package study.java.java8.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GoodReadability {

    class Team {
        Set<String> playerNames = new HashSet<>();
        int score = 0;

        boolean containsPlayer(String playerName) {
            return playerNames.contains(playerName);
        }

        int getScore() {
            return score;
        }

        Integer getTeamScoreForPlayer(List<Team> teams, String playerName) {
            for (Team team : teams) {
                if (team.containsPlayer(playerName)) {
                    return team.getScore();
                }
            }
            return null;
        }
    }
}
