package com.eurekaconsumerfeign.Client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.eurekaconsumerfeign.Hystric.DcClientHystric;

@FeignClient(value="eureka-client",fallback=DcClientHystric.class) //指定调用哪个服务提供者，指定熔断后的执行的类
public interface DcClient {

    @GetMapping("/dc") //指定调用服务提供者的哪个接口
    String consumer();

}