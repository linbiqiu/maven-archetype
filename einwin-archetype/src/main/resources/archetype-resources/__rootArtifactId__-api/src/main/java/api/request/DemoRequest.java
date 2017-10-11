package ${package}.api.request;

import com.einwin.framework.model.RequestData;
import javax.validation.Valid;
public class DemoRequest <T>extends RequestData<T> {
    @Valid
    private T data;

    //设置本系统请求公有参数
    private String userId;

    @Override
    public T getData() {
        return data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}