package priv.wwy.springboot.security.model;

import lombok.Data;

/**
 * @author wangweiye
 * @date 2021-06-30 14:28
 */
@Data
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}
