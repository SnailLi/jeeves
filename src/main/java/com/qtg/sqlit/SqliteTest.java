package com.qtg.sqlit;
import java.sql.*;
public class SqliteTest {


    public static void main(String[] args) {
        createTable();
    }

    public static void createTable()
    {
        Connection conn = null;
        Statement stmt = null;
        String sql = "CREATE TABLE company(ID INT PRIMARY KEY NOT NULL,NAME TEXT NOT NULL,AGE INT NOT NULL,ADDRESS CHAR(50),SALARY REAL)";
        try
        {
            conn = SqliteDbUtils.getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally {
            SqliteDbUtils.close(conn,stmt,null);
        }

    }
}
