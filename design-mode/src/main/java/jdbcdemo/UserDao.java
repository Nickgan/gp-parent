package jdbcdemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 16:05
 */
public class UserDao {

    public List<User> query(String sql, Object... params) {
        return JdbcTemplate.query(sql, new IRowMapper<User>() {
            public List rowMapper(ResultSet resultSet) throws Exception {
                List<User> list = new ArrayList<User>();
                while (resultSet.next()) {
                    list.add(new User(resultSet.getLong("id"), resultSet.getString("name")));
                }
                return list;
            }
        }, params);
    }

    public void save(User user) {
        String sql = "insert into user(name) values(?)";
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            System.out.println(com.mysql.jdbc.Driver.class.getName());

            connection = DriverManager.getConnection("jdbc:mysql:///gp", "root", "root");
            ps = connection.prepareStatement(sql);
            ps.setString(1, user.getName());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e) {
                try {
                    if (connection != null)
                        connection.close();
                } catch (SQLException e2) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
//        User user = new User();
//        user.setName("admin");
//
//        UserDao userDao = new UserDao();
//        userDao.save(user);

        UserDao userDao = new UserDao();
        List<User> root = userDao.query("select * from user where name = ? ", "root");
        System.out.println(root);
    }
}
