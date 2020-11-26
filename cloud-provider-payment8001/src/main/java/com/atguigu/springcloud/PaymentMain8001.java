package com.atguigu.springcloud;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class PaymentMain8001 {

    public  static void main(String[] args){
        SpringApplication.run(PaymentMain8001.class,args);
    }
}
