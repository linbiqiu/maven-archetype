package ${package}.api.model;

import java.io.Serializable;
import java.sql.Timestamp;
import com.einwin.framework.model.GenericModel;

public class DemoModel extends GenericModel<String> implements Serializable{

    private static final long serialVersionUID = 1L;


    /**
     * 字段名称：测试字段
     *
     * 数据库字段信息:test VARCHAR(100)
     */
    private String test;


    public String getTest() {
        return this.test;
    }

    public void setTest(String test) {
        this.test = test;
    }

}