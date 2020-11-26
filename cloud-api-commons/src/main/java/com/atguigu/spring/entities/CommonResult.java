package com.atguigu.spring.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private  Integer code;
    private  String mesage;
    private  T data;

    public CommonResult(Integer code,String mesage){
        this(code, mesage,null);
    }
}
