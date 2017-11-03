package cn.jdimage.springcloudtest.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableEurekaServer
public class EurekaApp {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApp.class, args);
    }
}
