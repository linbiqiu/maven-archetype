package ${package}.api.bo;

import com.einwin.framework.model.GenericBO;
import javax.validation.constraints.Min;
import ${package}.api.model.DemoModel;

public class DemoBO extends GenericBO {

    @Min(value=0, message="抽奖消耗积分的最小值为0")
    private Long depletePoint;

    public DemoBO() {
        setVo(new DemoModel());
    }

    public DemoModel getDemoModel() {
        return (DemoModel) getVo();
    }

    public void setDemoBO(DemoModel vo) {
        setVo(vo);
    }


    public Long getDepletePoint() {
        return depletePoint;
    }

    public void setDepletePoint(Long depletePoint) {
        this.depletePoint = depletePoint;
    }
}