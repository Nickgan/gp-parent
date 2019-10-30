package jdbcdemo;

import java.sql.*;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 17:18
 */
public class JDBCUtil {


    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void close(Statement st, Connection connection, ResultSet resultSet) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (resultSet != null) {
                        resultSet.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                }
            }
        }
    }


    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql:///gp", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
