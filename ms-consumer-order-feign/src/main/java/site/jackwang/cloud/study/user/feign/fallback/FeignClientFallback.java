package site.jackwang.cloud.study.user.feign.fallback;

import site.jackwang.cloud.study.user.entity.User;
import site.jackwang.cloud.study.user.feign.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * 服务降级
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/29
 */
@Component
public class FeignClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        return new User("小王");
    }

    @Override
    public String getIpAndPort() {
        return new String("ip：0.0.0.0");
    }
}
