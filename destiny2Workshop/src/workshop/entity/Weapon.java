package workshop.entity;

public class Weapon {
    private int w_id;
    private String w_name;
    private String type;
    private String time;
    private Match match;

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public int getW_id() {
        return w_id;
    }

    public void setW_id(int w_id) {
        this.w_id = w_id;
    }

    public String getW_name() {
        return w_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "w_id=" + w_id +
                ", w_name='" + w_name + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' + "MatchId" + match.getM_id() +
                '}';
    }
}
