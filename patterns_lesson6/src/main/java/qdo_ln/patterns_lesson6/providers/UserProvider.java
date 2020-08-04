package qdo_ln.patterns_lesson6.providers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import qdo_ln.patterns_lesson6.entities.User;

@Repository
public class UserProvider {
    UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(int id){
        return userMapper.getUserById(id);
    }
}
