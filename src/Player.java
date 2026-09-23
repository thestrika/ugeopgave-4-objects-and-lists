public class Player {
    private String name;
    private int skillLevel;

    public Player(String name, int skillLevel){
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public int getSkillLevel(){
        return skillLevel;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "name: " + " | skill level: " + skillLevel;
    }

}
