package BankingSystem.app;
import java.sql.*;

public class Bankingconnection {

    static String url = "jdbc:sqlite:C:/Users/Dinesh/bank.db";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(url);
    }
}