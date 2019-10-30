package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 17:34
 */
public class JdbcTemplate {

    static List query(String sql, IRowMapper rowMapper, Object... params) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        List<User> list = new ArrayList<User>();
        try {
            connection = JDBCUtil.getConnection();
            ps = connection.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
            resultSet = ps.executeQuery();
            return rowMapper.rowMapper(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(ps, connection, resultSet);
        }
        return null;

    }

}
