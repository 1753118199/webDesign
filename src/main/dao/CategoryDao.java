package main.dao;

import main.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CategoryDao {
    public int categoryInsert(String categoryName) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "INSERT INTO category(categoryName) VALUES(?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, categoryName);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int categoryInsertChild(String categoryName, String upId) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "INSERT INTO category(categoryName,upId) VALUES(?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoryName);
            ps.setString(2, upId);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public ResultSet categorySelectFirst() {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM category WHERE upId IS NULL";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public ResultSet categorySelect() {
        try {
            Connection con = DbUtil.getConn();

            String sql = "SELECT * FROM category_self_join";
            PreparedStatement ps = con.prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int categoryUpdate(String categoryId, String categoryName) {
        try {
            Connection con = DbUtil.getConn();

            String sql = "UPDATE category SET categoryName = ? WHERE categoryId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoryName);
            ps.setString(2, categoryId);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int categoryUpdateFather(String categoryId, String upId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "UPDATE category SET upId = ? WHERE categoryId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, upId);
            ps.setString(2, categoryId);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int categoryDelete(String categoryId) {
        try {
            Connection con = DbUtil.getConn();
            String sql = "DELETE FROM category WHERE categoryId = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoryId);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
