package dao;

import entity.Stock;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class StockDao {
    public void Insert(Integer id, Integer number, String name) throws Exception {
        Connection connection = null;
        PreparedStatement pre = null;
        try {
            connection = new DBUtil().getConnection();
            String sql = "insert into stock(s_d_id,s_number,s_d_name)values(?,?,?)";
            pre = connection.prepareStatement(sql);
            pre.setInt(1, id);
            pre.setInt(2, number);
            pre.setString(3, name);
            pre.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, pre);
        }
    }

    public void update(Integer id, Integer number, String name) throws Exception {
        Connection connection = null;
        PreparedStatement pre = null;
        try {
            connection = new DBUtil().getConnection();
            String sql = "update stock set s_number=? , s_d_name=? where s_d_id=?";
            pre = connection.prepareStatement(sql);
            pre.setInt(3, id);
            pre.setInt(1, number);
            pre.setString(2, name);
            pre.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, pre);
        }
    }

    public List<Stock> SelectAll() throws Exception {
        List<Stock> list = new LinkedList<>();
        Connection connection = null;
        PreparedStatement pre = null;
        ResultSet res = null;
        try {
            connection = new DBUtil().getConnection();
            String sql = "select s_id,s_d_id,s_number,s_d_name from stock";
            pre = connection.prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next() != false) {
                list.add(new Stock(res.getInt(1), res.getInt(2), res.getInt(3), res.getString(4)));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAuto(connection, pre, res);
        }
        return list;
    }

    public Stock SelectOne(Integer sid) throws Exception {
        Stock stock = null;
        Connection con = null;
        PreparedStatement pre = null;
        ResultSet res = null;
        try {
            con = new DBUtil().getConnection();
            String sql = "select s_id,s_d_id,s_number,s_d_name from stock where s_id=?";
            pre = con.prepareStatement(sql);
            pre.setInt(1, sid);
            res = pre.executeQuery();
            if (res.next() != false) {
                stock = new Stock(res.getInt(1), res.getInt(2), res.getInt(3), res.getString(4));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAuto(con, pre, res);
        }
        return stock;
    }

    public void Delete(Integer id) throws Exception {
        Connection connection = null;
        PreparedStatement pre = null;
        try {
            connection = new DBUtil().getConnection();
            String sql = "delete from stock where s_d_id=?";
            pre = connection.prepareStatement(sql);
            pre.setInt(1, id);
            pre.executeUpdate();
        } finally {
            DBUtil.closeAuto(connection, pre);
        }
    }

    public void Sell(Integer sid) throws Exception {
        Connection connection = null;
        PreparedStatement pre = null;
        try {
            connection = new DBUtil().getConnection();
            String sql = "update stock set s_number=? where s_id=?";
            pre = connection.prepareStatement(sql);
            pre.setInt(2, sid);
            Integer num = new StockDao().SelectOne(sid).getNumber() - 1;
            pre.setInt(1, num);
            pre.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeAuto(connection, pre);
        }
    }
}
