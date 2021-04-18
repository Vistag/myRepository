package workshop.entity;

public class Collection {
    private int c_id;
    private String c_stuff;
    private Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_stuff() {
        return c_stuff;
    }

    public void setC_stuff(String c_stuff) {
        this.c_stuff = c_stuff;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "c_id=" + c_id +
                ", c_stuff='" + c_stuff + '\'' +
                ", player=" + player +
                '}';
    }
}
