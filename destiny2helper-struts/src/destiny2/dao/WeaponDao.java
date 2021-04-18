package destiny2.dao;

import destiny2.entity.Weapon;
import destiny2.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class WeaponDao {

    //增加一条weapon信息
    public void insert(Weapon weapon) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            //1.注册驱动
            //2.建立连接
            connection = new DBUtil().getConnection();
            //3.定义sql语句
            String sql = "INSERT INTO weapon (weapon_name, weapon_html, weapon_img) VALUES (?,?,?)";
            //4.创建statement
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, weapon.getW_name());
            preparedStatement.setString(2, weapon.getW_html());
            preparedStatement.setString(3, weapon.getW_img());

            preparedStatement.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, preparedStatement);
        }
    }

    //按id删除一条weapon信息
    public void delete(Weapon weapon) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = new DBUtil().getConnection();

            String sql = "DELETE FROM weapon WHERE weapon_id=?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, weapon.getW_id());

            preparedStatement.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, preparedStatement);
        }
    }

    //更新一条武器信息
    public void update(Weapon weapon) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        System.out.println(weapon);

        try {
            connection = new DBUtil().getConnection();

            String sql = "UPDATE weapon SET weapon_name=?, weapon_html=?, weapon_img=? " +
                    "WHERE weapon_id=?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, weapon.getW_name());
            preparedStatement.setString(2, weapon.getW_html());
            preparedStatement.setString(3, weapon.getW_img());
            preparedStatement.setInt(4, weapon.getW_id());

            preparedStatement.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, preparedStatement);
        }
    }

    //按照id查询一条信息
    public Weapon queryOne(Weapon weapon) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Weapon w = new Weapon();


        try {
            connection = new DBUtil().getConnection();

            //判断按id还是name查询
            if (weapon.getW_id() != 0) {
                String sql = "SELECT weapon_id, weapon_name, weapon_html, weapon_img " +
                        "FROM weapon where weapon_id = ?";
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setInt(1, weapon.getW_id());
            } else {
                String sql = "SELECT weapon_id, weapon_name, weapon_html, weapon_img " +
                        "FROM weapon where weapon_name = ?";
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, weapon.getW_name());
            }

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                w.setW_id(resultSet.getInt("weapon_id"));
                w.setW_name(resultSet.getString("weapon_name"));
                w.setW_html(resultSet.getString("weapon_html"));
                w.setW_img(resultSet.getString("weapon_img"));
            }

        } finally {
            DBUtil.closeAuto(connection, preparedStatement);
        }

        return w;
    }


    public List<Weapon> selectAll() throws Exception {
        List<Weapon> weaponList = new ArrayList<Weapon>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = new DBUtil().getConnection();
            String sql = "SELECT weapon_id, weapon_name, weapon_html, weapon_img " +
                    "From weapon";

            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Weapon weapon = new Weapon();
                weapon.setW_id(resultSet.getInt("weapon_id"));
                weapon.setW_name(resultSet.getString("weapon_name"));
                weapon.setW_html(resultSet.getString("weapon_html"));
                weapon.setW_img(resultSet.getString("weapon_img"));

                weaponList.add(weapon);
            }

        } finally {
            DBUtil.closeAuto(connection, preparedStatement, resultSet);
        }

        return weaponList;
    }

}
