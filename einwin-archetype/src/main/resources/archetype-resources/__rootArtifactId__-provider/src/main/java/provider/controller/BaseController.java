package ${package}.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.einwin.framework.annotation.PropertyFiltration;
import ${package}.api.request.DemoRequest;
import ${package}.api.model.DemoModel;
import ${package}.api.bo.DemoBO;
import ${package}.api.response.AppResponseData;
import ${package}.api.response.DemoResponse;
import ${package}.provider.service.DemoService;
import ${package}.api.model.DemoModel;
import ${package}.api.service.DemoRemoteService;
import org.springframework.beans.BeanUtils;

@RestController
public class BaseController implements DemoRemoteService{

    @Autowired
    DemoService demoService;


    @RequestMapping(value = "/t", method = RequestMethod.POST)
    @PropertyFiltration(clazz = AppResponseData.class)
    public AppResponseData<DemoResponse> test(@Validated @RequestBody DemoRequest<DemoBO> request){
        DemoResponse demoResponse = new DemoResponse();

        DemoModel demoModel= demoService.get("yourid");
        BeanUtils.copyProperties(demoResponse, demoModel);

        return AppResponseData.Success(demoResponse);
    }
}