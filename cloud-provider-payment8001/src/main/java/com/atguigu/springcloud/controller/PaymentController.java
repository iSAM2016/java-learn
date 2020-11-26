package com.atguigu.springcloud.controller;

import com.atguigu.spring.entities.CommonResult;
import com.atguigu.spring.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody  Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果是" +  result);
        if(result > 0){
            return  new CommonResult(200, "掺入数据成功",result);
        } else {
            return  new CommonResult(200, "掺入数据失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("插入结果是" +  payment);
        System.out.println(90 + "isam2016");
        if(payment != null){
            return  new CommonResult(200, "成功",payment);
        } else {
            return  new CommonResult(200, "查询");
        }
    }
}
