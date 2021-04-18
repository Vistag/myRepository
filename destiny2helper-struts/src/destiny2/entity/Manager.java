package destiny2.entity;

public class Manager {
    private String m_id;
    private String m_password;

    public String getM_id() {
        return m_id;
    }

    public void setM_id(String m_id) {
        this.m_id = m_id;
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "m_id='" + m_id + '\'' +
                ", m_password='" + m_password + '\'' +
                '}';
    }
}
