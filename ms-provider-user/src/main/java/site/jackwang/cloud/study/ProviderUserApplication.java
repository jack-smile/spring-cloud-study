package site.jackwang.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 用户微服务，启动类
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/27
 */
@EnableDiscoveryClient
@SpringCloudApplication
public class ProviderUserApplication {
  public static void main(String[] args) {
    SpringApplication.run(ProviderUserApplication.class, args);
  }
}
