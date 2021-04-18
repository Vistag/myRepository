package destiny2.dao;

import destiny2.entity.Manager;
import destiny2.util.DBUtil;
import org.apache.struts2.convention.annotation.Results;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ManagerDao {
    public void insert(Manager manager) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = new DBUtil().getConnection();

            String sql = "INSERT INTO manager (manager_id, manager_password) " +
                    "VALUES (?,?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, manager.getM_id());
            preparedStatement.setString(2, manager.getM_password());

            preparedStatement.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, preparedStatement);
        }
    }

    public Manager queryById(String id) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Manager manager = new Manager();

        try {
            connection = new DBUtil().getConnection();

            String sql = "SELECT manager_id, manager_password FROM " +
                    "manager WHERE manager_id=?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {

                manager.setM_id(resultSet.getString("manager_id"));
                manager.setM_password(resultSet.getString("manager_password"));
            }

        } finally {
            DBUtil.closeAuto(connection, preparedStatement, resultSet);
        }

        return manager;
    }
}
