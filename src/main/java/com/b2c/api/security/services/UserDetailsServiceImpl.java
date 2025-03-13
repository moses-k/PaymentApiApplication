package com.b2c.api.security.services;

//import org.springframework.beans.factory.annotation.Autowired;

import com.b2c.api.security.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import com.bezkoder.springing's.repository.UserRepository;

/**
 *
 * @author Moses Kipyegon
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User();

        if ("B2CApiUser".equals(username)) {
            user = new User("B2CApiUser", "","$2a$04$si8Q0lMwLTkyIix14u5ZYOvbLzrvo0kJS");
        } else {
            throw new UsernameNotFoundException("User Not Found with username: " + username);
        }
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }

}
