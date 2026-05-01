package BankingSystem.app;
import java.sql.*;

public class Banking {

    public void createAccount(int accno, String name, int balance) {
        try {
            Connection conn = Bankingconnection.getConnection();

            String createTable = "CREATE TABLE IF NOT EXISTS bank(accno INTEGER PRIMARY KEY, name TEXT, balance INTEGER)";
            Statement st = conn.createStatement();
            st.execute(createTable);

            String insert = "INSERT INTO bank(accno, name, balance) VALUES(?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, accno);
            ps.setString(2, name);
            ps.setInt(3, balance);
            ps.executeUpdate();

            System.out.println("Account Created Successfully...");

            ps.close();
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deposit(int id, int amount) {
        try {
            Connection conn = Bankingconnection.getConnection();

            String query = "UPDATE bank SET balance = balance + ? WHERE accno = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, amount);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deposited Successfully...");
            else
                System.out.println("Account not found!");

            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withdraw(int id, int amount) {
        try {
            Connection conn = Bankingconnection.getConnection();

            String query = "UPDATE bank SET balance = balance - ? WHERE accno = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, amount);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Withdraw Successful...");
            else
                System.out.println("Account not found!");

            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getBalance(int id) {
        try {
            Connection conn = Bankingconnection.getConnection();

            String query = "SELECT balance FROM bank WHERE accno = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Balance: " + rs.getInt("balance"));
            } else {
                System.out.println("Account not found!");
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAccounts() {
        try {
            Connection conn = Bankingconnection.getConnection();

            String query = "SELECT * FROM bank";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(
                        "AccNo: " + rs.getInt("accno") +
                        ", Name: " + rs.getString("name") +
                        ", Balance: " + rs.getInt("balance")
                );
            }

            rs.close();
            st.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}