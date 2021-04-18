package dao;

import entity.Desert;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DesertDao {

    private String generalId() {
        String id = "";
        id = id + (int) (20200000 + Math.random() * 10000);

        return id;
    }

    public void insert(Desert desert) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = new DBUtil().getConnection();

            String sql = "INSERT INTO desert (d_id, d_name, d_price, d_number) " +
                    "VALUES (?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, generalId());
            preparedStatement.setString(2, desert.getD_name());
            preparedStatement.setDouble(3, desert.getD_price());
            preparedStatement.setInt(4, desert.getD_number());

            preparedStatement.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, preparedStatement);
        }
    }

    public void delete(Desert desert) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = new DBUtil().getConnection();

            String sql = "DELETE FROM desert WHERE d_id=?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, desert.getD_id());

            preparedStatement.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, preparedStatement);
        }
    }

    public void update(Desert desert) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        System.out.println(desert);

        try {
            connection = new DBUtil().getConnection();

            String sql = "UPDATE desert SET d_name=?, d_price=?, d_number=? WHERE d_id=?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, desert.getD_name());
            preparedStatement.setDouble(2, desert.getD_price());
            preparedStatement.setInt(3, desert.getD_number());
            preparedStatement.setString(4, desert.getD_id());

            preparedStatement.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, preparedStatement);
        }
    }

    public Desert queryOne(Desert desert) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Desert d = new Desert();

        try {
            connection = new DBUtil().getConnection();

            if (desert.getD_id() != "" || desert.getD_id() != null) {
                String sql = "SELECT d_id, d_name, d_price, d_number " +
                        "FROM desert WHERE d_id=?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, desert.getD_id());
            } else {
                String sql = "SELECT d_id, d_name, d_price, d_number " +
                        "FROM desert WHERE d_name=?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, desert.getD_name());
            }


            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                d.setD_id(resultSet.getString("d_id"));
                d.setD_name(resultSet.getString("d_name"));
                d.setD_price(resultSet.getDouble("d_price"));
                d.setD_number(resultSet.getInt("d_number"));
            }

        } finally {
            DBUtil.closeAuto(connection, preparedStatement, resultSet);
        }

        return d;
    }

    public List<Desert> queryAll() throws Exception {
        List<Desert> desertList = new ArrayList<Desert>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = new DBUtil().getConnection();

            String sql = "SELECT d_id, d_name, d_price, d_number " +
                    "FROM desert";
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Desert desert = new Desert();
                desert.setD_id(resultSet.getString("d_id"));
                desert.setD_name(resultSet.getNString("d_name"));
                desert.setD_price(resultSet.getDouble("d_price"));
                desert.setD_number(resultSet.getInt("d_number"));

                desertList.add(desert);
            }
        } finally {
            DBUtil.closeAuto(connection, preparedStatement, resultSet);
        }


        return desertList;
    }
}
