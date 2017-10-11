package ${package}.provider.service;

import org.springframework.stereotype.Service;
import com.einwin.framework.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import ${package}.provider.service.DemoService;
import ${package}.api.model.DemoModel;
import ${package}.provider.mapper.DemoMapper;

@Service("demoService")
public class DemoService extends GenericService<DemoModel, String>{


    public DemoService(@Autowired DemoMapper demoMapper) {
        super(demoMapper);
    }

    public DemoMapper getMapper() {
        return (DemoMapper) super.genericMapper;
    }

}