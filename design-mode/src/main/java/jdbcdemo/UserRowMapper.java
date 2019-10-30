package jdbcdemo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 17:38
 */
public class UserRowMapper implements IRowMapper<User> {

    public List<User> rowMapper(ResultSet resultSet) throws Exception {
        List<User> list = new ArrayList<User>();
        while (resultSet.next()) {
            long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            list.add(new User(id, name));
        }
        return list;
    }
}
