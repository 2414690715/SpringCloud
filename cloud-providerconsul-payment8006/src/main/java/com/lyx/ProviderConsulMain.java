package com.lyx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liao 2021/9/24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderConsulMain {

    public static void main(String[] args) {
        SpringApplication.run(ProviderConsulMain.class);
    }

}
