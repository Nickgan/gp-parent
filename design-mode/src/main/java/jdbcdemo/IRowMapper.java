package jdbcdemo;

import java.sql.ResultSet;
import java.util.List;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 17:37
 */
public interface IRowMapper<T> {

    List<T> rowMapper(ResultSet resultSet) throws Exception;

}
