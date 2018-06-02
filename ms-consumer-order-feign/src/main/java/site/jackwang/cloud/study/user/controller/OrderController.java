package site.jackwang.cloud.study.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import site.jackwang.cloud.study.user.entity.User;
import site.jackwang.cloud.study.user.feign.UserFeignClient;

/**
 * 订单微服务的web接口
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/29
 */
@RestController
public class OrderController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return userFeignClient.findById(id);
    }

    @GetMapping("/user/getIpAndPort")
    public String getIpAndPort(){
        return userFeignClient.getIpAndPort();
    }

}
