package top.atluofu.common.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import top.atluofu.common.exception.BusinessException;
import top.atluofu.common.result.ResultUtils;

/**
 * @ClassName: ControllerExceptionHandler
 * @description: ControllerExceptionHandler
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-11Month-02Day-13:15
 * @Version: 1.0
 */
@ControllerAdvice
@Slf4j
public class ControllerExceptionHandler {


    /**
     * 所有异常统一处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultUtils exceptionHandler(Exception e) throws Exception {
        log.error("系统异常：", e);
        return ResultUtils.error(500,"系统出现异常，请联系管理员");
    }

    /**
     * 业务异常统一处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ResultUtils exceptionHandler(BusinessException e) {
        log.error("业务异常：{}", e.getE().getDesc());
        return ResultUtils.error(500,e.getE().getDesc());
    }

    /**
     * 校验异常统一处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public ResultUtils exceptionHandler(BindException e) {
        log.error("校验异常：{}", e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
        return ResultUtils.error(500,e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }

    /**
     * 校验异常统一处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public ResultUtils exceptionHandler(RuntimeException e) {
        throw e;
    }

}