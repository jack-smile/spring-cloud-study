package site.jackwang.cloud.study;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * 订单微服务，启动类
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/29
 */
@EnableFeignClients
@SpringCloudApplication
public class ConsumerOrderApplication {
  public static void main(String[] args) {
    SpringApplication.run(ConsumerOrderApplication.class, args);
  }

  @Bean
  public Logger.Level feignLoggerLevel(){
    return Logger.Level.HEADERS;
  }
}
