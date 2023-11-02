package top.atluofu.common.exception;

/**
 * @ClassName: BusinessException
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-16:49
 * @Version: 1.0
 */
public class BusinessException extends RuntimeException {

    private BusinessExceptionEnum e;

    public BusinessException(BusinessExceptionEnum e) {
        this.e = e;
    }

    public BusinessExceptionEnum getE() {
        return e;
    }

    public void setE(BusinessExceptionEnum e) {
        this.e = e;
    }

    /**
     * 不写入堆栈信息，提高性能
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}

