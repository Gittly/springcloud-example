package example.springcloud.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("SERVICE-HELLOWORLD")
public interface HelloWorldService {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHello();
}
