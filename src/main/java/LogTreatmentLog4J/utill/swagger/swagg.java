package LogTreatmentLog4J.utill.swagger;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@ApiModel("用户实体")
public class swagg {
    @ApiParam(name = "version", value = "接口版本号", defaultValue = "1.0", required = true, allowableValues = "1.0")
    @Pattern(regexp = "1.0", message = "version filed must equal 1.0")
    @ApiModelProperty("用户名")
    private String username;

    //@NotNull
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
