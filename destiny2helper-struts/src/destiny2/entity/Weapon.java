package destiny2.entity;

public class Weapon {
    private int w_id;
    private String w_name;
    private String w_html;
    private String w_img;

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

    public String getW_html() {
        return w_html;
    }

    public void setW_html(String w_html) {
        this.w_html = w_html;
    }

    public String getW_img() {
        return w_img;
    }

    public void setW_img(String w_img) {
        this.w_img = w_img;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "w_id=" + w_id +
                ", w_name='" + w_name + '\'' +
                ", w_html='" + w_html + '\'' +
                ", w_img='" + w_img + '\'' +
                '}';
    }
}
