package entity;

public class Desert {
    private String d_id;
    private String d_name;
    private double d_price;
    private int d_number;

    public String getD_id() {
        return d_id;
    }

    public void setD_id(String d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public double getD_price() {
        return d_price;
    }

    public void setD_price(double d_price) {
        this.d_price = d_price;
    }

    public int getD_number() {
        return d_number;
    }

    public void setD_number(int d_number) {
        this.d_number = d_number;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "d_id='" + d_id + '\'' +
                ", d_name='" + d_name + '\'' +
                ", d_price=" + d_price +
                ", d_number=" + d_number +
                '}';
    }
}
