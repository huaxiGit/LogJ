package LogTreatmentLog4J.cemvc.Serivce;

import LogTreatmentLog4J.cemvc.Mapper.UserMapper;
import LogTreatmentLog4J.utill.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSerivceimpl implements UserSerivce {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> seleectUseridD() {
        return userMapper.selectUserIdd();
    }

    @Override
    public User selectUserPass(String username) {
        return userMapper.selectUserPass(username);
    }


}
