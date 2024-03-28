package cn.hhy.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Binlog Kafka 引用启动程序
 */
@EnableEurekaClient
@SpringBootApplication
public class BinlogKafkaApplication {

    public static void main(String[] args) {

        SpringApplication.run(BinlogKafkaApplication.class, args);
    }
}
