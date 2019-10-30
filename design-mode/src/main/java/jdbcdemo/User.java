package jdbcdemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: ganbo
 * @Date: 2019/10/29 16:02
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;

}
