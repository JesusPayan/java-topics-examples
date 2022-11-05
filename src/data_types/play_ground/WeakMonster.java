package data_types.play_ground;
/*TODO: Create all atributes to a WeakMonster
 *  Name, Race, Skills, Level,Coins,
 *  ,Speed alive?
 * */
public class WeakMonster {
    private String name;
    private String race;
    private int Level;
    private int coin;
    private boolean isAlive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
