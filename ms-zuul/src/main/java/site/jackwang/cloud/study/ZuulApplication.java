package site.jackwang.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul网关，启动类
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/29
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZuulApplication.class, args);
  }
}
