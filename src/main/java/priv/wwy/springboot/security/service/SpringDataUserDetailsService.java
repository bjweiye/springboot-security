package priv.wwy.springboot.security.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import priv.wwy.springboot.security.dao.UserDao;
import priv.wwy.springboot.security.model.UserDto;

/**
 * @author wangweiye
 * @date 2021-06-25 16:46
 */
@Slf4j
@Service
public class SpringDataUserDetailsService implements UserDetailsService {
    @Autowired
    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserDto userDto = userDao.getUserByUsername(username);
        if(userDto == null){
            return null;
        }
        log.info("username:"+username+userDto.toString());
        UserDetails userDetails = User.withUsername(userDto.getUsername()).password(userDto.getPassword()).authorities("USER").build();
        return userDetails;
    }
}
