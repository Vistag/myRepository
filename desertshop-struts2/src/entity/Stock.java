package entity;

public class Stock {
    private Integer sid;
    private Integer id;
    private Integer number;
    private String name;

    public Stock(Integer sid, Integer number, String name) {
        this.sid = sid;
        this.number = number;
        this.name = name;
    }

    public Stock() {
    }

    public Stock(Integer sid, Integer id, Integer number, String name) {
        this.sid = sid;
        this.id = id;
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "sid=" + sid +
                ", id=" + id +
                ", number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
