package LogTreatmentLog4J.com;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * 全局异常处理
 * 全局数据绑定
 * 全局数据预处理
 * 增强controller
 * */
//@ControllerAdvice
public class GlobalExceptionHandler {
    //抛出异常类型
   /* @ExceptionHandler(Exception.class)
    public ModelAndView customException(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", e.getMessage());
        mv.setViewName("myerror");
        return mv;
    }*/

   /* @Autowired
    private Environment environment;
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonReturn defaultErrorHandler(HttpServletRequest request, Exception ex) throws Exception {
        String errorCode = null;
        String errorMsg = null;
        Object errorData = new ArrayList();
        String active = environment.getProperty("spring.profiles.active");
        if (ex instanceof BusinessException) {
            BusinessException se = (BusinessException) ex;
            errorCode = se.getCode();
            errorMsg = se.getMessage();
            errorData = se.getData();
// 屏蔽线上异常
        } else if (active == "prod") {
            errorCode = "0";
            errorMsg = "内部服务错误";
        } else {
            ex.printStackTrace();
        }
        return new JsonReturn(errorCode, errorMsg, errorData);
    }
*/


}
