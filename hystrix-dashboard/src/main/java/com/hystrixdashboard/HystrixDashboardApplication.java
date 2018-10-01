package com.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient//向服务中心注册
@EnableHystrix//启用熔断机制
@EnableHystrixDashboard //启用熔断器监控页面
public class HystrixDashboardApplication {

	@Bean
    @LoadBalanced//使用这个restTemplate开启负载均衡
    RestTemplate initRestTemplate(){
        return new RestTemplate();
    }
	
	
	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}
}
