package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author luanv
 */
public class DB {
    public static Connection connect( boolean autoComit){
        String url = "jdbc:postgresql://localhost:5432/Empresa";
        String user = "postgres";
        String password = "Chiefs@King7";


        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;

    }
}