package workshop.entity;

public class Match {
    private int m_id;
    private String m_name;
    private String m_list;

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_list() {
        return m_list;
    }

    public void setM_list(String m_list) {
        this.m_list = m_list;
    }

    @Override
    public String toString() {
        return "Match{" +
                "m_id=" + m_id +
                ", m_name='" + m_name + '\'' +
                ", m_list='" + m_list + '\'' +
                '}';
    }
}
