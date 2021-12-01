package defaultconstructor.chess;

import java.util.ArrayList;
import java.util.List;

public class ChessTournament {
    private List<Team> teams = new ArrayList<>();

    public ChessTournament() {
        Team team = new Team();
        Team team2 = new Team();
        Team team3 = new Team();
        teams.add(team);
        teams.add(team2);
        teams.add(team3);
    }

    public void addPlayersToTeams(List<Player> playersRegistrated){
        for(int i = 0; i < playersRegistrated.size();i++){
            if(i == 0){
                teams.get(0).setPlayerOne(playersRegistrated.get(i));
            }
            else if(i == 1){
                teams.get(0).setPlayerTwo(playersRegistrated.get(i));
            }
            else if(i == 2){
                teams.get(1).setPlayerOne(playersRegistrated.get(i));
            }
            else if(i == 3){
                teams.get(1).setPlayerTwo(playersRegistrated.get(i));
            }
            else if(i == 4){
                teams.get(2).setPlayerOne(playersRegistrated.get(i));
            }
            else {
                teams.get(2).setPlayerTwo(playersRegistrated.get(i));
            }
        }
    }

    public List<Team> getTeams() {
        return teams;
    }
}
