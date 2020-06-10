package LogTreatmentLog4J.cemvc.Mapper;

import LogTreatmentLog4J.utill.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUserIdd();

    User selectUserPass(String username);
}
