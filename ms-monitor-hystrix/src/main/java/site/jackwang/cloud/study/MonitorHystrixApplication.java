package site.jackwang.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

/**
 * 监控-hystrix-dashboard，启动类
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/30
 */
@Configuration
@EnableAutoConfiguration
@EnableTurbine
@EnableDiscoveryClient
@EnableHystrixDashboard
public class MonitorHystrixApplication {
  public static void main(String[] args) {
    SpringApplication.run(MonitorHystrixApplication.class, args);
  }
}
