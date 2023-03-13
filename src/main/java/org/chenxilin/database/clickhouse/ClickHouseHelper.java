package org.chenxilin.database.clickhouse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ClickHouseHelper {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:ch://192.168.100.194/di_aiops_anal_detn";
        String user = "root";
        String password = "aiops-test";

        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn.isClosed());
        conn.close();
    }
}
