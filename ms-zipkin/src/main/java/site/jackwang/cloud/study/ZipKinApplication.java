package site.jackwang.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * zipkin链路追踪，启动类
 *
 * @author wangjie<http://www.jackwang.site/>
 * @date 2018/5/30
 */
@EnableZipkinServer
@SpringBootApplication
public class ZipKinApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZipKinApplication.class, args);
  }
}
