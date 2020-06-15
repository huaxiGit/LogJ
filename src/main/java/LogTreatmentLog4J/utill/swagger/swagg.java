package LogTreatmentLog4J.utill.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体")
public class swagg {
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("测试")
    public String passw;

    @Override
    public String toString() {
        return "swagg{" +
                "username='" + username + '\'' +
                ", passw='" + passw + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
