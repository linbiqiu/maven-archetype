package ${package}.client;

import  ${package}.api.service.DemoRemoteService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import ${package}.api.request.DemoRequest;
import ${package}.api.model.DemoModel;
import ${package}.api.response.AppResponseData;
import ${package}.api.response.DemoResponse;
import ${package}.api.constant.DemoErrorCode;
import ${package}.api.bo.DemoBO;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "test", fallback = DemoClient.HystrixClientFallback.class)
public interface DemoClient extends DemoRemoteService {

    @Component
    class HystrixClientFallback implements DemoClient {
        @Override
        public AppResponseData<DemoResponse> test(@RequestBody  DemoRequest<DemoBO> request) {
            return AppResponseData.Failure(DemoErrorCode.DEMO_ERROR_SYSTEM);
        }

    }
}