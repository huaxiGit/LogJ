package LogTreatmentLog4J.com;

import java.util.ArrayList;
//定义全局返回
/**
 * 定义一个全局错误码
 * */
public enum GlobalErrorCode {
    // Login error
    LOGIN_ERROR_TOKEN_INVALID("-10000", "无效的token.", new ArrayList<>()),
    REQUEST_PACKET_ERROR("400010","请求数据错误！"),
    TCP_SYSTEM_CONNECT_ERROR("400012","连接数据服务器失败！"),
    REQUEST_PARSE_PACKET_ERROR("400015","服务器处理数据失败！"),
    REQUEST_DB_ADD_ERROR("30001","数据库添加处理失败！"),
    REQUEST_DB_SAVE_ERROR("30002","数据库修改处理失败！"),
    REQ_PARAM_TOKEN_NOTNULL("400014","token参数为空！"),
    REQ_PARAM_TTL_INVALID("-10000","登陆超时！");
    GlobalErrorCode(String code,String message){
        this.code = code;
        this.message = message;
    }
    GlobalErrorCode(String code,String message, Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    private String code;
    private String message;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
