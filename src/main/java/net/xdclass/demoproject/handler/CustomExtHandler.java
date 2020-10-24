package net.xdclass.demoproject.handler;

import net.xdclass.demoproject.utils.JsonData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常处理类
 */
@RestControllerAdvice
public class CustomExtHandler {

    //处理对应的异常
    @ExceptionHandler(value = Exception.class)
    Object handlerException(Exception e, HttpServletRequest request) {
        return JsonData.buildError("系统异常,e:"+e, -2);
    }

}
