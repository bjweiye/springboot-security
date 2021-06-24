package priv.wwy.springboot.security.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author wangweiye
 * @date 2021-06-24 15:30
 */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }
    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}

