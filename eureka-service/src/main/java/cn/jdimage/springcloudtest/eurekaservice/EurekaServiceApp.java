package cn.jdimage.springcloudtest.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApp.class, args);
    }
}
