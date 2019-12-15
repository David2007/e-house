package com.david.house.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//注明是 controller 的辅助类
@ControllerAdvice
public class Errorhandler {
    private static final Logger logger = LoggerFactory.getLogger(Errorhandler.class);

//    注明哪些异常的时候进行下面的处理
    @ExceptionHandler(value={Exception.class,RuntimeException.class})
    public String error500(HttpServletRequest request,Exception e){
        logger.error(e.getMessage(),e);
        logger.error(request.getRequestURL() + " encounter 500");
        return "error/500";
    }
}
