package LogTreatmentLog4J.utill;

public class Userauthority {
    private Integer authId;
    private Integer userId;
    private String  authSou;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAuthSou() {
        return authSou;
    }

    public void setAuthSou(String authSou) {
        this.authSou = authSou;
    }

    @Override
    public String toString() {
        return "Userauthority{" +
                "authId=" + authId +
                ", userId=" + userId +
                ", authSou='" + authSou + '\'' +
                '}';
    }
}
