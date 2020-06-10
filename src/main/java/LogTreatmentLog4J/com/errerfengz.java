package LogTreatmentLog4J.com;

public class errerfengz extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String code;
    private String massage;
    //自定义构造器，只保留一个，让其必须输入错误码及内容
    public errerfengz(String code){
        super(code);
        this.code=code;
    }
    public errerfengz(String code,String massage){
        super(code);
        this.code=code;
        this.massage=massage;
    }



    @Override
    public String toString() {
        return "errerfengz{" +
                "code='" + code + '\'' +
                ", massage='" + massage + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
