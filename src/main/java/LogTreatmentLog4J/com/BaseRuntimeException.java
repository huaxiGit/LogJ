package LogTreatmentLog4J.com;

import org.springframework.util.StringUtils;

/**
 * 创建Exception 异常类
 *
 * */
public class BaseRuntimeException extends RuntimeException {
    static final long serialVersionUID = 0L;
    private Object errorData;
    private Throwable cause = null;
    private String errorCode = null;

    private String errorMsg = ""; // 客户描述
    private String alarmMsg = "!@#$"; // 告警描述
    public  BaseRuntimeException(){

    }
    public BaseRuntimeException(String errorCode){
        this.errorCode=errorCode;
    }

    /**
     *      * 透传其他模块的错误信息 Creates a new instance of BaseRuntimeException.
     *      *
     *      * @param errorCode
     *      * @param msg
     *     
     */


    public BaseRuntimeException(String errorCode, String msg) {
        super(msg);
        this.errorMsg = msg;
        this.errorCode = errorCode;
        System.out.println(this.errorCode);
        System.out.println(this.errorMsg);
    }

    /**
     *      * 透传其他模块的错误信息并告警 Creates a new instance of BaseRuntimeException.
     *      *
     *      * @param errorCode
     *      * @param msg
     *     
     */


    public BaseRuntimeException(String errorCode, String msg, String alarmMsg) {
        super(msg);
        this.errorMsg = msg;
        this.alarmMsg = alarmMsg;
        this.errorCode = errorCode;
    }


    public BaseRuntimeException(Throwable cause) {
        super(cause);
    }


    public BaseRuntimeException(String errorCode, String msg, Throwable cause) {
        super(msg);
        this.cause = cause;
        this.errorCode = errorCode;
    }


    public BaseRuntimeException(String errorCode, String msg, Object data) {
        super(msg);
        this.errorData = data;
        this.errorCode = errorCode;
    }
    public boolean isAlarm() {
        if ((!StringUtils.isEmpty(this.alarmMsg)) && (!this.alarmMsg.equals("!@#$"))) {
            return true;
        }
        return false;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Object getErrorData() {
        return errorData;
    }

    public void setErrorData(Object errorData) {
        this.errorData = errorData;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    public void setCause(Throwable cause) {
        this.cause = cause;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getAlarmMsg() {
        return alarmMsg;
    }

    public void setAlarmMsg(String alarmMsg) {
        this.alarmMsg = alarmMsg;
    }
}
