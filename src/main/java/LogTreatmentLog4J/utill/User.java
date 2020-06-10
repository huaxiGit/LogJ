package LogTreatmentLog4J.utill;

public class User {
    private Integer userId;
    private String userName;
    private Integer userAge;
    private String userEnder;
    private String userPassword;

    private Integer authId;
    //auth表，授权
    private String  authSou;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userEnder='" + userEnder + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", authId=" + authId +
                ", authSou='" + authSou + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserEnder() {
        return userEnder;
    }

    public void setUserEnder(String userEnder) {
        this.userEnder = userEnder;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthSou() {
        return authSou;
    }

    public void setAuthSou(String authSou) {
        this.authSou = authSou;
    }
}
