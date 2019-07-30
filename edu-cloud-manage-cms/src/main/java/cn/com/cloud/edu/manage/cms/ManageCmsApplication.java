package cn.com.cloud.edu.manage.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author:Alex
 * @date:2019/7/29
 * @version:1.0
 * @description:
 */
@SpringBootApplication
@EntityScan(value = "cn.com.cloud.edu.common.model")
@ComponentScan(basePackages= {"cn.com.cloud.edu.api.cms"})
public class ManageCmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManageCmsApplication.class,args);
    }
}

