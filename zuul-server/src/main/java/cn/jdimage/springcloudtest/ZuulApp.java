package cn.jdimage.springcloudtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/11/3 0003.
 */
@SpringBootApplication
@EnableZuulProxy   //开启Zuul
public class ZuulApp {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


    public static void main(String[] args) {
        SpringApplication.run(ZuulApp.class, args);
    }

}

//@Component
//class DiscoveryClientSample implements CommandLineRunner {
//
//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @Override
//    public void run(String... strings) throws Exception {
//        System.out.println(discoveryClient.description());
//        discoveryClient.getInstances("COMPUTE-SERVICE").forEach((ServiceInstance serviceInstance) -> {
//            System.out.println("Instance --> " + serviceInstance.getServiceId()
//                    + "\nServer: " + serviceInstance.getHost() + ":" + serviceInstance.getPort()
//                    + "\nURI: " + serviceInstance.getUri() + "\n\n\n");
//        });
//    }
//}
