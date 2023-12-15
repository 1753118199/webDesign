package main.util;

import java.sql.*;

public class DbUtil {
    public static Connection getConn() {

        Connection conn = null;
        try { //1加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver"); // 1
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //2链接到数据库
        String url = "jdbc:mysql://localhost:3306/web2.0?useUnicode=true&serverTimezone=UTC&characterEncoding=utf8";
        String databaseUserName = "root";
        String databasePassWord = "zwy0724.";
        try {
            conn = DriverManager.getConnection(url, databaseUserName, databasePassWord);//2

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void closeConn(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static PreparedStatement getPreStmt(Connection conn, String sql) {
        PreparedStatement PreStmt = null;
        try {
            PreStmt = conn.prepareStatement(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return PreStmt;
    }

    public static void closeStmt(PreparedStatement pstmt) {
        try {
            if (pstmt != null) {
                pstmt.close();
                pstmt = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
                rs = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

