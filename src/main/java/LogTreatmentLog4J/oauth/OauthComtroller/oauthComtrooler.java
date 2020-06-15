package LogTreatmentLog4J.oauth.OauthComtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class oauthComtrooler {

    @RequestMapping("/home")
    public String home(){
        return "/oauth/home";
    }




}
