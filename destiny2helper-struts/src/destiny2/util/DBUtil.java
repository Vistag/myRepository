package destiny2.util;

import javax.xml.stream.events.Namespace;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private String URL = "jdbc:mysql://localhost:3306/destiny2";
    private String User = "root";
    private String Password = "root";

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, User, Password);
        return connection;
    }

    public static void closeAuto(AutoCloseable... autoCloseables) throws Exception {
        for (AutoCloseable o : autoCloseables) {
            if (o != null) {
                o.close();
            }
        }
    }
}
