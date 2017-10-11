package ${package}.api.exception;

import ${package}.api.constant.DemoErrorCode;
import com.einwin.framework.model.AppCode;

public class DemoException2 extends Exception {
    private AppCode appCode = DemoErrorCode.DEMO_ERROR_SYSTEM;//默认异常为系统异常

    public DemoException2() {
    }

    public DemoException2(String message, AppCode appErrorCode) {
        super(message);
        this.appCode = appErrorCode;
    }

    public AppCode getAppCode() {
        return appCode;
    }

    public void setAppCode(AppCode appCode) {
        this.appCode = appCode;
    }
}