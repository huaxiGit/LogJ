package LogTreatmentLog4J.cemvc.Controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Api(value="aaaa",tags = "bbbb",description = "ccc")
public class SwaggerController {
    @RequestMapping("aaabbb")
    public String sss(){
        return "aaaaa";

    }

}
