package site.jackwang.cloud.study.user.feign;

import site.jackwang.cloud.study.user.entity.User;
import site.jackwang.cloud.study.user.feign.fallback.FeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign客户端，对"用户user微服务"发出远程接口调用
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/29
 */
@FeignClient(value = "microservice-provider-user")
//@FeignClient(value = "api-gateway" + "/api-user")
//@FeignClient(value = "API-GATEWAY" + "/api-user", fallback = FeignClientFallback.class)
public interface UserFeignClient {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id);

    @RequestMapping(value = "/getIpAndPort", method = RequestMethod.GET)
    String getIpAndPort();
}
