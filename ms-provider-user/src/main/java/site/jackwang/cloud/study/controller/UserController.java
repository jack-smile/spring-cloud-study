package site.jackwang.cloud.study.controller;

import site.jackwang.cloud.study.entity.User;
import site.jackwang.cloud.study.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户微服务的web接口
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/29
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private Registration registration;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) throws InterruptedException {
//        Random rand = new Random();
//        int time = rand.nextInt(2000);
//        Thread.sleep(time);
//        System.out.println("休眠：" + time);

//        Thread.sleep(2000);

//        Thread.sleep(500);

        System.out.println("调用findById！！！");


        User findOne = userRepository.findOne(id);
        return findOne;
    }

    @GetMapping("/getIpAndPort")
    public String getIpAndPort() throws InterruptedException {
//        Thread.sleep(2000);

//        Thread.sleep(500);

        System.out.println("调用getIpAndPort！！！");

        return registration.getHost() + ":" + registration.getPort();
    }
}
