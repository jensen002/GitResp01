package com.demo.common.advice;

import com.demo.common.exception.DmException;
import com.demo.common.vo.ExceptionResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author jensen
 * @date 2016/9/15
 *
 * 自定义异常处理
 */
//通用异常处理
@Slf4j
@ControllerAdvice//会自动拦截所有的controller
public class BasicExceptionHandler {
    //处理异常，方法返回值就是将来要返回到页面的东西,不同方法些不同的
    @ExceptionHandler(DmException.class)
    public ResponseEntity<ExceptionResult> handleException(DmException e) {
        return ResponseEntity.status(e.getExceptionEnum().value())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
