import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;

    Team(String teamName){
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public double getAverageSkill(){
        int playersSize = players.size();
        int sum = 0;
        for(int i = 0; i < playersSize; i++){
            sum += players.get(i).getSkillLevel();
        }
        return (double) sum / playersSize;
    }

    public void printTeam(){
        System.out.println("===" + teamName + "===");
        for(Player player : players){
            System.out.println("- " + player.getName());
        }
        System.out.println("============");
    }

    public void compete(Team opponent){
        if(this.getAverageSkill() > opponent.getAverageSkill()){
            System.out.println(this.teamName + " wins! | average score: " + this.getAverageSkill());
        }
        else{
            System.out.println(opponent.teamName + " wins! | average score: " + opponent.getAverageSkill());
        }
    }

    public void printBestPlayer(){
        String best = findBestPlayer().getName();
        System.out.println("===============MVP===============");
        System.out.println(teamName + ": " + best);
    }

    public Player findBestPlayer(){
        Player best = players.get(0);
        int teamSize = players.size();
        for(int i = 0; i < teamSize; i++){
            if(players.get(i).getSkillLevel() > best.getSkillLevel()){
                best = players.get(i);
            }
        }
        return best;
    }


}
