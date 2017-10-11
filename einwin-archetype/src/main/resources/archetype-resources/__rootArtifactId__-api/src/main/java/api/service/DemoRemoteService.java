package ${package}.api.service;

import com.einwin.framework.annotation.PropertyFiltration;
import ${package}.api.request.DemoRequest;
import ${package}.api.bo.DemoBO;
import ${package}.api.model.DemoModel;
import ${package}.api.response.AppResponseData;
import ${package}.api.response.DemoResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.annotation.Validated;

public interface DemoRemoteService {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    AppResponseData<DemoResponse> test(@Validated @RequestBody  DemoRequest<DemoBO> request);
}