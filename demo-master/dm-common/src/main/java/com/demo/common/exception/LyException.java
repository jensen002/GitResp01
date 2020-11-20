package com.demo.common.exception;

import com.demo.common.enums.ExceptionEnum;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author jensen
 * @date 2016/9/15
 *
 * 自定义异常类
 */
@Getter
public class DmException extends RuntimeException {

    private ExceptionEnum exceptionEnum;

    public DmException(ExceptionEnum exceptionEnum) {
        this.exceptionEnum = exceptionEnum;
    }


}
