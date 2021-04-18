package workshop.entity;

public class Player {
    private int p_id;
    private String p_name;
    private String p_work;

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_work() {
        return p_work;
    }

    public void setP_work(String p_work) {
        this.p_work = p_work;
    }

    @Override
    public String toString() {
        return "Player{" +
                "p_id=" + p_id +
                ", p_name='" + p_name + '\'' +
                ", p_work='" + p_work + '\'' +
                '}';
    }
}
