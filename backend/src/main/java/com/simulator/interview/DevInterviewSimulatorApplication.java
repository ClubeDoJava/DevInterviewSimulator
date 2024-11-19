package com.simulator.interview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.simulator.interview.repository")
@EntityScan(basePackages = "com.simulator.interview.model")
public class DevInterviewSimulatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(DevInterviewSimulatorApplication.class, args);
    }
}
