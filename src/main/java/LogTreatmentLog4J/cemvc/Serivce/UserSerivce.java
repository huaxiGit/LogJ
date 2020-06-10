package LogTreatmentLog4J.cemvc.Serivce;

import LogTreatmentLog4J.utill.User;

import java.util.List;


public interface UserSerivce {


    List<User> seleectUseridD();

    User selectUserPass(String username);
}
