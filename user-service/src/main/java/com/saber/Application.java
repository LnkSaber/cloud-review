package com.saber;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.saber.mapper")
@EnableDiscoveryClient  // 开启Eureka客户端发现功能
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
