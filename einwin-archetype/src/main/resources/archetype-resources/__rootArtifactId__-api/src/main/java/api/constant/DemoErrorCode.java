package ${package}.api.constant;

import com.einwin.framework.model.AppCode;

public enum DemoErrorCode implements AppCode {

    //接口错误码 用架构组分配编码
    DEMO_ERROR_SYSTEM(-11111, "系统异常");

    private Integer code;
    private String message;

    private String format;

    DemoErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
        this.format = message;
    }

    public DemoErrorCode format(Object... msgArgs) {
        this.message = String.format(this.format, msgArgs);
        return this;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public void setMessage(String s) {
        this.message = s;

    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public void setCode(int i) {
        this.code = i;
    }
}